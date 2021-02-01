package sdo.md.mapper;

import org.apache.ibatis.annotations.Insert;

public interface TxSample1Mapper {
	@Insert("insert into tbl_sample2 values(#{data})")
	public void insertCol1(String data);
		
}
