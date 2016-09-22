package com.pawelm.service;

import com.company.rk.schema.robertschema.SecondOperationRequestType;
import com.company.rk.schema.robertschema.SecondOperationResponseType;

public interface RobertService {

	String processRequest(String request);

    SecondOperationResponseType processRequest(SecondOperationRequestType request);
}
