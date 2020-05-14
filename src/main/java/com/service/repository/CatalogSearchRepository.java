package com.service.repository;

import com.search.service.Item;
import com.search.service.List;

public interface CatalogSearchRepository  {
	List<Item> fetchItemsByBrandName(String brandname);
	List<Item> fetchItemsBySkuId( String skuid);


}
