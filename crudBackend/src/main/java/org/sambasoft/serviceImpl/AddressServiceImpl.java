package org.sambasoft.serviceImpl;

import java.util.List;

import org.sambasoft.model.Address;
import org.sambasoft.repository.AddressRepository;
import org.sambasoft.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressRepository addressRepository;
//	@Autowired
//	RoleRepository roleRepository;
	
	public List<Address> findAllAddresses(){
		
		return addressRepository.findAll();
		
	}

	@Override
	public Address getAddress(long id) {
		
		return addressRepository.findOne(id);
	}

	@Override
	public Address addAddress(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public boolean removeAddress(long id) {
		
		addressRepository.delete(id);
		  return true;
	}

	@Override
	public List<Address> findAddressByCountry(String country) {
		
		return addressRepository.findAddressByCountry(country);
	}

}
