package com.ayursinfotech.vendor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayursinfotech.vendor.dao.VirtualccDAO;
import com.ayursinfotech.vendor.response.BaseResponse;
import com.ayursinfotech.vendor.service.VirtualccService;
import com.ayursinfotech.vendor.util.VirtualccConstants;

@Service
public class VirtualccServiceImpl implements VirtualccService {

	@Autowired
	private VirtualccDAO virtualccDAO;

	@Override
	public BaseResponse ping() {
		BaseResponse response = new BaseResponse();
		try {
			if (virtualccDAO.ping()) {
				response.setStatus(VirtualccConstants.STATUS_SUCCESS);
			} else {
				response.setStatus(VirtualccConstants.STATUS_FAILURE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

}
