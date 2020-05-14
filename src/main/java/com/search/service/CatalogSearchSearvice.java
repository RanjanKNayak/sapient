package com.search.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.search.Controller.Item;
import com.search.Controller.List;

public interface CatalogSearchSearvice {
	
	List<Product> fetchItemsByBrandName(String brandname);
	List<Product> fetchItemsBySkuId( String skuid);

}
