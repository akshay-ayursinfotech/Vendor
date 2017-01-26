package com.ayursinfotech.vendor.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ayursinfotech.vendor.response.BaseResponse;
import com.ayursinfotech.vendor.service.VendorService;

@Controller
public class VendorController {

	private static final Logger LOGGER = Logger
			.getLogger(VendorController.class);
	@Autowired
	private VendorService vendorService;

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public BaseResponse ping() {
		LOGGER.info("start executing ping");
		return vendorService.ping();
	}
}
