package com.ayursinfotech.vendor.dao.impl;

import org.springframework.stereotype.Repository;

import com.ayursinfotech.vendor.dao.VirtualccDAO;

@Repository
public class VirtualccDAOImpl implements VirtualccDAO {

	@Override
	public Boolean ping() throws Exception {
		Boolean result = true;
		return result;
	}

}
