package com.ayursinfotech.vendor.dao.impl;

import org.springframework.stereotype.Repository;

import com.ayursinfotech.vendor.dao.VendorDAO;

@Repository
public class VendorDAOImpl implements VendorDAO {

	@Override
	public Boolean ping() throws Exception {
		Boolean result = true;
		return result;
	}

}
