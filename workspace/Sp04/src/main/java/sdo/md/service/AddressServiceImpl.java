package sdo.md.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import sdo.md.dao.AddressDao;
import sdo.md.domain.Address;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	
	@Inject
	private AddressDao addressDao;
	
	@Override
	public List<Address> listS() {
		// TODO Auto-generated method stub
		return addressDao.list();
	}

	@Override
	public void insertS(Address address) {
		// TODO Auto-generated method stub
		addressDao.insert(address);
	}

	@Override
	public void deleteS(long seq) {
		// TODO Auto-generated method stub
		addressDao.delete(seq);
	}

}
