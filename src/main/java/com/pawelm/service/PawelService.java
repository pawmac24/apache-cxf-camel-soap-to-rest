package com.pawelm.service;

import com.company.pm.schema.pawelschema.FirstOperationRequestType;
import com.company.pm.schema.pawelschema.FirstOperationResponseType;

public interface PawelService {

	String processRequest(String request);

	FirstOperationResponseType processRequest(FirstOperationRequestType request);
}
