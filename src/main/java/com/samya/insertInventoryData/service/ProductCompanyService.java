package com.samya.insertInventoryData.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.samya.insertInventoryData.Jpamodel.BranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.dao.interfaces.ProductCompanyDaoInterface;
import com.samya.insertInventoryData.dao.interfaces.ProductServiceInterfaceJpa;
import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;
import com.samya.insertInventoryData.service.inteface.IProductCompanyService;
import com.samya.insertInventoryData.staticbusinessdata.ModeOfOperationsStatus;

@Service
public class ProductCompanyService implements IProductCompanyService {

	@Autowired
	ProductCompanyDaoInterface productCompanyDao;
	@Autowired
	ProductServiceInterfaceJpa productDaoJpa;

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


	@Override
	public List<ProductCompany> getAllComapanyOfProduct(Product product) throws DataAccessException, SQLException {
		
		return productCompanyDao.getAllComapanyOfProduct(product);
	}
	
	@Override
	public List<Company> getAllCompany() throws DataAccessException, SQLException{
		return productCompanyDao.getAllCompany();
		
	}


	@Override
	public ProductCompany addNewProduct(ProductCompany productCompany) {
		
		return productDaoJpa.addNewProduct(productCompany);
	}


	@Override
	public List<ProductJpa> getAllProducts() {
		// TODO Auto-generated method stub
		return productDaoJpa.listAll();
	}
	
	@Override
	public List<BranchJpa> getAllOpenBranchs() {
		// TODO Auto-generated method stub
		return productDaoJpa.listAllOpenBranch();
		
	}


	@Override
	public ProductCompany updateProductCompanyQuantity(ProductCompany productCompany) throws DataAccessException, SQLException {
		// TODO Auto-generated method stub
		long now = System.currentTimeMillis();
		java.sql.Date currentSqlDate = new java.sql.Date(now);
		productCompany= productCompanyDao.getProductCompanyIdFromPrdIDnCompID(productCompany).get(0);
		
		ProductCompanyJpa productCompanyJpa = new ProductCompanyJpa();
		productCompanyJpa.setCompanyId(productCompany.getCompany().getId());
		productCompanyJpa.setProductId(productCompany.getProduct().getProductId());
		productCompanyJpa.setProductCompanyId(productCompany.getProductCompanyId());
		productCompanyJpa.setProductcompanyQuantity(productCompany.getProductcompanyQuantity());
		productCompanyJpa.setInsertDate(productCompany.getInsertDate());
		productCompanyJpa.setUpdateDate(currentSqlDate);
		
		productCompanyJpa=productDaoJpa.save(productCompanyJpa);
		
		
		ProductCompanyDetailsJpa productCompanyDetailsJpa = new ProductCompanyDetailsJpa();
		productCompanyDetailsJpa.setProductCompanyId(productCompany.getProductCompanyId());
		productCompanyDetailsJpa.setInsertDate(currentSqlDate);
		productCompanyDetailsJpa.setModeOfOpertion(ModeOfOperationsStatus.PRODUCT_QUANTITY_ADDED);
		productCompanyDetailsJpa.setQuantityAffected(productCompany.getAddedQuantity());
		
		productCompanyDetailsJpa=productDaoJpa.save(productCompanyDetailsJpa);
		
		return productCompany;
		
	}


	




}
