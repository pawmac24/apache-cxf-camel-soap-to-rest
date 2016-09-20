package com.pawelm.service;

import org.springframework.stereotype.Service;

@Service("pawelService")
public class PawelServiceImpl implements PawelService {

	@Override
	public String processRequest(String request) {
		return "OUT";
	}
}
