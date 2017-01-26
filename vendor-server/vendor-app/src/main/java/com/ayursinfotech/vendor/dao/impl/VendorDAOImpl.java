package com.ayursinfotech.vendor.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.ayursinfotech.vendor.controllers.VendorController;
import com.ayursinfotech.vendor.dao.VendorDAO;
import com.mysql.jdbc.log.Log;

@Repository
public class VendorDAOImpl implements VendorDAO {
	private static final Logger LOGGER = Logger.getLogger(VendorDAOImpl.class);

	@Override
	public Boolean ping() throws Exception {
		LOGGER.info("start Executing ping");
		Boolean result = true;
		LOGGER.info("end Executing ping");
		return result;
	}

}
