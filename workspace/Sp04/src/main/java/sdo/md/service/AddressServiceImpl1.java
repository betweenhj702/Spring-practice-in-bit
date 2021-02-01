package sdo.md.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdo.md.domain.Address;
import sdo.md.mapper.AddressMapper1;

@Service("addressService1")
public class AddressServiceImpl1 implements AddressService {
	
	@Autowired
	private AddressMapper1 addressMapper;
	@Override
	public List<Address> listS() {
		// TODO Auto-generated method stub
		return addressMapper.list();
	}

	@Override
	public void insertS(Address address) {
		addressMapper.insert(address);
	}

	@Override
	public void deleteS(long seq) {
		// TODO Auto-generated method stub
		addressMapper.delete(seq);
	}

}
