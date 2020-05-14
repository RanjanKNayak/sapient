package com.search.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.service.repository.CatalogSearchRepositort;
import com.service.repository.CatalogSearchRepository;

import dto.Product;

@Service
public class CatalogSearchSearviceImpl implements CatalogSearchSearvice {
	@Autowired
	CatalogSearchRepository catalogSearchRepository;
	
	public List<Product> fetchItemsByBrandName( String brandname){
		List<Product> products = catalogSearchRepository.fetchItemsByBrandName(brandname);
		return products;
	}
		
		public List<Product> fetchItemsBySkuId( String skuid){
			List<Product> products = catalogSearchRepository.fetchItemsBySkuId(skuid);
			return products;
			
		}
		
	}

}
