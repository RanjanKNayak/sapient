package com.search.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.search.service.CatalogSearchSearvice;

import dto.Product;

@RestController("/search")
public class CatalogSearchContoller {
	
	@Autowired
	CatalogSearchSearvice  catalogSearchSearvice;

	@GetMapping("/{brandname}")
	public List<Product> fetchItemsByBrandName( @PathVariable("brandname") String brandname){
		
		List<Product> items = catalogSearchSearvice.fetchItemsByBrandName(brandname);
		return items;
	}
	
	@GetMapping("/{skuid}")
	public List<Product> fetchItemsBySkuId( @PathVariable("skuid") String skuid){
		List<Product> items = catalogSearchSearvice.fetchItemsBySkuId(skuid);
		return items;
		
		
	}
}
