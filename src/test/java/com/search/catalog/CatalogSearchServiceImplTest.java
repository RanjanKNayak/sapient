package com.search.catalog;

import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;

import com.service.repository.CatalogSearchRepository;

@SpringBootTest
public class CatalogSearchServiceImplTest {
	@Mock
	CatalogSearchRepository catalogSearchRepository;
	@Test
	public void fetchItemsBySkuIdTest() {
		//assert that for a skuid product is available.
		//assert not null.
		//assert for a perticular sku id its brand is fetched.
	}
	
	public void fetchItemsByBrandNameTest() {
		//assert that for a brandname all  available products are fetched.
		//assert not null.
		
	}

}
