package com.ayursinfotech.vendor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ayursinfotech.vendor.response.BaseResponse;
import com.ayursinfotech.vendor.service.VirtualccService;

@Controller
@RequestMapping(value = "/virtualcc")
public class VirtualccController {

	@Autowired
	private VirtualccService virtualccService;

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public BaseResponse ping() {
		return virtualccService.ping();
	}
}
