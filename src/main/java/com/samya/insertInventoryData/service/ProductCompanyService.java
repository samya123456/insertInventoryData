package com.samya.insertInventoryData.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.samya.insertInventoryData.Jpamodel.BranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyBranchDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyBranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.dao.interfaces.ProductCompanyBranchDaoInterface;
import com.samya.insertInventoryData.dao.interfaces.ProductCompanyDaoInterface;
import com.samya.insertInventoryData.dao.interfaces.ProductServiceInterfaceJpa;
import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;
import com.samya.insertInventoryData.service.inteface.IProductCompanyService;
import com.samya.insertInventoryData.staticbusinessdata.ModeOfOperationsStatus;

@Service
public class ProductCompanyService implements IProductCompanyService {

	@Autowired
	ProductCompanyDaoInterface productCompanyDao;
	@Autowired
	ProductServiceInterfaceJpa productDaoJpa;
	
	@Autowired 
	ProductCompanyBranchDaoInterface productCompanyBranchDao;

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

	@Transactional(rollbackFor  = Exception.class, 
			propagation = Propagation.REQUIRED,
			isolation = Isolation.READ_COMMITTED)
	    public ProductCompanyBranch updateProductCompanyQuantity(ProductCompanyBranch productCompanyBranch) throws DataAccessException, SQLException {
		long now = System.currentTimeMillis();
		java.sql.Date currentSqlDate = new java.sql.Date(now);
		ProductCompany productCompany =insertProductCompanyTables (productCompanyBranch.getProductCompany(), currentSqlDate);
		productCompanyBranch.setProductCompany(productCompany);
		productCompanyBranch=	updateProductCompanyBranchQuantity(productCompanyBranch,currentSqlDate);
		return productCompanyBranch;
		
		
		
		
	}
	
	private ProductCompany insertProductCompanyTables(ProductCompany productCompany,Date currentSqlDate) throws DataAccessException, SQLException {
		
		
		productCompany= productCompanyDao.getProductCompanyIdFromPrdIDnCompID(productCompany).get(0);
		
		ProductCompanyJpa productCompanyJpa = new ProductCompanyJpa();
		productCompanyJpa.setCompanyId(productCompany.getCompany().getId());
		productCompanyJpa.setProductId(productCompany.getProduct().getProductId());
		productCompanyJpa.setProductCompanyId(productCompany.getProductCompanyId());
		productCompanyJpa.setProductcompanyQuantity(productCompany.getProductcompanyQuantity());
		productCompanyJpa.setInsertDate(productCompany.getInsertDate());
		productCompanyJpa.setUpdateDate(currentSqlDate);
		
		
		//insert into t_product_company
		productCompanyJpa=productDaoJpa.save(productCompanyJpa);
		
		
		ProductCompanyDetailsJpa productCompanyDetailsJpa = new ProductCompanyDetailsJpa();
		productCompanyDetailsJpa.setProductCompanyId(productCompany.getProductCompanyId());
		productCompanyDetailsJpa.setInsertDate(currentSqlDate);
		productCompanyDetailsJpa.setModeOfOpertion(ModeOfOperationsStatus.PRODUCT_QUANTITY_ADDED);
		productCompanyDetailsJpa.setQuantityAffected(productCompany.getAddedQuantity());
		
		//insert into t_product_company_details
		productCompanyDetailsJpa=productDaoJpa.save(productCompanyDetailsJpa);
		return productCompany;
		
	}

	
	private ProductCompanyBranch updateProductCompanyBranchQuantity(ProductCompanyBranch productCompanyBranch ,Date currentSqlDate) throws DataAccessException, SQLException {
		 ProductCompanyBranchJpa productCompanyBranchJpa = new ProductCompanyBranchJpa();
		 List<ProductCompanyBranch> productCompanyBranchList=	productCompanyBranchDao.getProductCompanyBranchIdFromPrdIDnCompIDnBranchId(productCompanyBranch);
		 if(productCompanyBranchList.size()==0) {
			 productCompanyBranchJpa.setBranchProductCompanyQuantity(productCompanyBranch.getProductCompany().getAddedQuantity());
		 }else {
			 productCompanyBranch = productCompanyBranchList.get(0);
			 productCompanyBranchJpa.setBranchProductCompanyQuantity(productCompanyBranch.getBranchProductCompanyQuantity() +
					 productCompanyBranch.getProductCompany().getAddedQuantity()); 
			 productCompanyBranchJpa.setProductCompanyBranchId(productCompanyBranch.getProductCompanyBranchId());
		 }
		
		 productCompanyBranchJpa.setBranchCode(productCompanyBranch.getBranch().getBranchCode());
		 productCompanyBranchJpa.setBranchId(productCompanyBranch.getBranch().getBranchid());
		
		 productCompanyBranchJpa.setCompanyCode(productCompanyBranch.getProductCompany().getCompany().getCode());
		 productCompanyBranchJpa.setCompanyId(productCompanyBranch.getProductCompany().getCompany().getId());
		 productCompanyBranchJpa.setCompanyName(productCompanyBranch.getProductCompany().getCompany().getName());
		 productCompanyBranchJpa.setProductCode(productCompanyBranch.getProductCompany().getProduct().getProductCode());
		 productCompanyBranchJpa.setProductCompanyId(productCompanyBranch.getProductCompany().getProductCompanyId());
		 productCompanyBranchJpa.setProductId(productCompanyBranch.getProductCompany().getProduct().getProductId());
		 productCompanyBranchJpa.setProductName(productCompanyBranch.getProductCompany().getProduct().getProductName());
		 productCompanyBranchJpa.setUpdateDate(currentSqlDate);
		 
		 productCompanyBranchJpa= productDaoJpa.save(productCompanyBranchJpa);
		 
		 ProductCompanyBranchDetailsJpa productCompanyBranchDetailsJpa = new ProductCompanyBranchDetailsJpa();
		 productCompanyBranchDetailsJpa.setProductCompanyBranchId(productCompanyBranchJpa.getProductCompanyBranchId());
		 productCompanyBranchDetailsJpa.setQuantityAffected(productCompanyBranchJpa.getBranchProductCompanyQuantity());
		 productCompanyBranchDetailsJpa.setModeOfOperations(ModeOfOperationsStatus.PRODUCT_QUANTITY_ADDED);
		 productCompanyBranchDetailsJpa.setInsertDate(currentSqlDate);
		 
		 productDaoJpa.save(productCompanyBranchDetailsJpa);
		 
		 return productCompanyBranch;
		
		
	}


	




}
