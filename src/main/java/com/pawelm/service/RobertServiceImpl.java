package com.pawelm.service;

import com.company.rk.schema.robertschema.ObjectFactory;
import com.company.rk.schema.robertschema.SecondOperationRequestType;
import com.company.rk.schema.robertschema.SecondOperationResponseType;
import org.springframework.stereotype.Service;

@Service("robertService")
public class RobertServiceImpl implements RobertService {

	@Override
	public String processRequest(String request) {
		return "OUT2";
	}

	@Override
	public SecondOperationResponseType processRequest(SecondOperationRequestType request) {
		ObjectFactory factory = new ObjectFactory();
		SecondOperationResponseType response = factory.createSecondOperationResponseType();
		response.setOutFirstParam("FIRST OUTPUT VALUE");
		response.setOutSecondParam("SECOND OUTPUT VALUE");
		response.setOutThirdParam(3);
		return response;
	}
}
