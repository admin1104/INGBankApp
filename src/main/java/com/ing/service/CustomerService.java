package com.ing.service;

import com.ing.dto.CustomerDto;

public interface CustomerService {
	
	public String createAccount(CustomerDto customerDto);
	
	public String updateUser(String email,Long mobile,Long customerId);
}
