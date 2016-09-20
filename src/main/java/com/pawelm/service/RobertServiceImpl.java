package com.pawelm.service;

import org.springframework.stereotype.Service;

@Service("robertService")
public class RobertServiceImpl implements RobertService {

	@Override
	public String processRequest(String request) {
		return "OUT2";
	}
}
