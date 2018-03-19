package org.sambasoft.service;

import java.util.ArrayList;
import java.util.List;

import org.sambasoft.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public interface AddressService {
	
	public List<Address> findAllAddresses();
	public Address getAddress(long id);
	public Address addAddress(Address address);
	public Address updateAddress(Address address);
	public boolean removeAddress(long id);
	public List<Address> findAddressByCountry(String country);
	
		
		
	

}
