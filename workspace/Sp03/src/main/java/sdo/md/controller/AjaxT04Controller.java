package sdo.md.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sdo.md.domain.Address;
import sdo.md.service.AddressAjaxService;

@RestController
@RequestMapping("ajax04")
public class AjaxT04Controller {
	@Autowired
	private AddressAjaxService service;
	
	//@GetMapping("search01")
	@GetMapping(value="search01", 
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Address search01(long seq, HttpServletResponse response) {
		Address address = service.selectBySeqS(seq);
		
		return address;
	}
	@PostMapping("search02")
	public List<Address> search02(String name, HttpServletResponse response) {
		List<Address> list = service.selectByNameS(name);
		
		return list;
	}
}
