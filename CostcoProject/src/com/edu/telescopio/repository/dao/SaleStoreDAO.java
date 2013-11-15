package com.edu.telescopio.repository.dao;

import java.util.Map;

import com.edu.telescopio.repository.vo.SaleStore;

/**
 * @author andres
 *
 */
public interface SaleStoreDAO {

	Map<String, SaleStore> getSaleStores();
	
}
