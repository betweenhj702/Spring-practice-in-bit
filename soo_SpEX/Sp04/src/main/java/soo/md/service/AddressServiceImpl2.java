package soo.md.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import soo.md.domain.Address;
import soo.md.mapper.AddressMapper2;

@Service("addressService2")
public class AddressServiceImpl2 implements AddressService {
	//@Autowired
	@Resource
	private AddressMapper2 addressMapper;
	
	@Override
	public List<Address> listS() {
		return addressMapper.list();
	}

	@Override
	public void insertS(Address address) {
		addressMapper.insert(address);
	}

	@Override
	public void deleteS(long seq) {
		addressMapper.delete(seq);
	}
}
