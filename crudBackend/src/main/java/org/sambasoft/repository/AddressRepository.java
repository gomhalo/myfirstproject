package org.sambasoft.repository;


import java.util.List;

import org.sambasoft.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address,Long>{
	
 List<Address> findAddressByCountry(String country);
	

}
