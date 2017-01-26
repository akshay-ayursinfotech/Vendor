package com.ayursinfotech.vendor.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayursinfotech.vendor.dao.VendorDAO;
import com.ayursinfotech.vendor.dao.impl.VendorDAOImpl;
import com.ayursinfotech.vendor.response.BaseResponse;
import com.ayursinfotech.vendor.service.VendorService;
import com.ayursinfotech.vendor.util.VendorConstants;

@Service
public class VendorServiceImpl implements VendorService {

	private static final Logger LOGGER = Logger
			.getLogger(VendorServiceImpl.class);
	@Autowired
	private VendorDAO vendorDAO;

	@Override
	public BaseResponse ping() {
		LOGGER.info("start Executing ping");
		BaseResponse response = new BaseResponse();
		try {
			if (vendorDAO.ping()) {
				response.setStatus(VendorConstants.STATUS_SUCCESS);
			} else {
				response.setStatus(VendorConstants.STATUS_FAILURE);
			}
		} catch (Exception e) {
			LOGGER.error(e);
		}
		LOGGER.info("end Executing ping");
		return response;
	}
}
