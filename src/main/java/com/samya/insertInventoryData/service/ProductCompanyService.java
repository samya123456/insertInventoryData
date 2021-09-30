package com.samya.insertInventoryData.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.samya.insertInventoryData.dao.ProductCompanyDao;
import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;
import com.samya.insertInventoryData.service.inteface.IProductCompanyService;

@Service
public class ProductCompanyService implements IProductCompanyService {

	@Autowired
	ProductCompanyDao productCompanyDao;

	public List<ProductWiseCompanyList> getAllProductsCompanyWise() throws DataAccessException, SQLException {
		Map<Product, List<ProductCompany>> productCompanyMap = new HashMap<Product, List<ProductCompany>>();
		List<ProductCompany> productCompanyList = productCompanyDao.getAllProductsCompanyWise();
		List<ProductWiseCompanyList> productWiseCompanyListList = new ArrayList<>();

		for (int i = 0; i < productCompanyList.size(); i++) {
			Product product = productCompanyList.get(i).getProduct();
			if (productCompanyMap.containsKey(product)) {
				List<ProductCompany> temp=productCompanyMap.get(product);
				temp.add(productCompanyList.get(i));
				productCompanyMap.put(product, temp);
			} else {
				List<ProductCompany> temp =new ArrayList<>();
				temp.add(productCompanyList.get(i));
				productCompanyMap.put(product, temp);
			}

		}

		Set<Map.Entry<Product, List<ProductCompany>>> set = productCompanyMap.entrySet();
		for (Map.Entry<Product, List<ProductCompany>> entry : set) {
			ProductWiseCompanyList productWiseCompanyList = new ProductWiseCompanyList();
			productWiseCompanyList.setProduct(entry.getKey());
			productWiseCompanyList.setProductCompanyList(entry.getValue());
			int totalQuantity =0;
			for(ProductCompany productCompany:entry.getValue()) {
				totalQuantity += productCompany.getProductcompanyQuantity()==null?0:productCompany.getProductcompanyQuantity();
			}
			productWiseCompanyList.setTotalQuantity(totalQuantity);
			productWiseCompanyListList.add(productWiseCompanyList);
		}

		return productWiseCompanyListList;
	}

}
