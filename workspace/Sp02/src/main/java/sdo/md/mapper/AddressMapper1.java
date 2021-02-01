package sdo.md.mapper;

import java.util.List;

import sdo.md.domain.Address;

public interface AddressMapper1 {
	List<Address> list();
	void insert(Address address);
	void delete(long seq);
}
