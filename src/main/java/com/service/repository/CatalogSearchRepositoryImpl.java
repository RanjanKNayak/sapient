package com.service.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.orm.jpa.EntityManagerFactoryUtils;

import com.search.service.List;
import com.search.service.Product;

@Transactional
public class CatalogSearchRepositoryImpl {
	List<Product> fetchItemsByBrandName(String brandname){
		//We need to get Enity manager 2. Ger session and fetch products associated with this brand name
		//brandname and products are mapped in many to many.
		//So from brand entity we can fetch associated products
		//Also we can fetch product category.
		
	}
	
	List<Product> fetchItemsBySkuId( String skuid){
		//1.fetch a product using skuid(productid)
		//it will be having brand name and category.
		//we can group using category and or brand
	}

}
