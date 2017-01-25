package com.ayursinfotech.vendor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayursinfotech.vendor.dao.VendorDAO;
import com.ayursinfotech.vendor.response.BaseResponse;
import com.ayursinfotech.vendor.service.VendorService;
import com.ayursinfotech.vendor.util.VendorConstants;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDAO virtualccDAO;

	@Override
	public BaseResponse ping() {
		BaseResponse response = new BaseResponse();
		try {
			if (virtualccDAO.ping()) {
				response.setStatus(VendorConstants.STATUS_SUCCESS);
			} else {
				response.setStatus(VendorConstants.STATUS_FAILURE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

}
