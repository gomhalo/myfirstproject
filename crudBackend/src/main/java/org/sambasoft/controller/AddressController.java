package org.sambasoft.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.sambasoft.model.Address;
import org.sambasoft.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * @author AMANUEL AREGAY
 * 
 * Address Controller
 *
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*",allowedHeaders="*")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	/**
	 * 
	 * @return List Of Address
	 * @throws Exception
	 */
	@GetMapping
	@RequestMapping (value="")
	@Produces({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<Address> getAllAddresses() throws Exception{
		return addressService.findAllAddresses();
	}
	
	/**
	 * 
	 * @param id
	 * @return Address
	 * @throws Exception
	 */
	
	@GetMapping
	@RequestMapping (value="getaddress/{id}")
	@Produces({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Address getAddress(@PathVariable("id")  Long id) throws Exception{
		return addressService.getAddress(id);
	}
	

	/**
	 * 
	 * @param id
	 * @return Address
	 * @throws Exception
	 */
	
	@GetMapping
	@RequestMapping (value="{country}")
	@Produces({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<Address> getAddress(@PathVariable("country")  String country) throws Exception{
		return addressService.findAddressByCountry(country);
	}
	
	/**
	 * 
	 * @param Address
	 * @return Address
	 * @throws Exception
	 */
	
	@PostMapping
	@RequestMapping (value="address")
	@Consumes({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	@Produces({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Address addAddress(@RequestBody Address address) throws Exception{
		return addressService.addAddress(address);
	}
	
	/**
	 * 
	 * @param Address
	 * @return Address
	 * @throws Exception
	 */
	
	@PutMapping
	@RequestMapping (value="address/{id}")
	@Consumes({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	@Produces({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Address updateAddress(@PathVariable("id") Long id, Address address) throws Exception{
		address.setId(id);
		return addressService.updateAddress(address);
	}
	
	/**
	 * 
	 * @param id
	 * @return boolean
	 * @throws Exception
	 */
	
	@DeleteMapping
	@RequestMapping (value="{id}")
	@Produces({MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Boolean removeAddress(@PathVariable("id")  Long id) throws Exception{
		addressService.removeAddress(id);
		
		return true;
	}
	
	

}
