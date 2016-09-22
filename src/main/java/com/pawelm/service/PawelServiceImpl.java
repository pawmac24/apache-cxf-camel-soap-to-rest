package com.pawelm.service;

import com.company.pm.schema.pawelschema.FirstOperationRequestType;
import com.company.pm.schema.pawelschema.FirstOperationResponseType;
import com.company.pm.schema.pawelschema.ObjectFactory;
import org.springframework.stereotype.Service;

@Service("pawelService")
public class PawelServiceImpl implements PawelService {

	@Override
	public String processRequest(String request) {
		return "OUT";
	}

	@Override
	public FirstOperationResponseType processRequest(FirstOperationRequestType request) {
		ObjectFactory factory = new ObjectFactory();
		FirstOperationResponseType response = factory.createFirstOperationResponseType();
		response.setOutFirstParam("OUTPUT VALUE");
		return response;
	}
}
