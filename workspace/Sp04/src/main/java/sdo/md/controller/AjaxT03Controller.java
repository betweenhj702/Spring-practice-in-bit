package sdo.md.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sdo.md.domain.Address;
import sdo.md.service.AddressAjaxService;

//@ResponseBody 클래스의 모든 메소드가 ajax라면, 클래스 위에 붙여주면 끝
@Controller
@RequestMapping("ajax03")
public class AjaxT03Controller {
	@Autowired
	private AddressAjaxService service;
	
	@GetMapping("search01")
	public @ResponseBody Address search01(long seq, HttpServletResponse response) {
		Address address = service.selectBySeqS(seq);
		
		return address;
	}
	@PostMapping("search02")
	public @ResponseBody List<Address> search02(String name, HttpServletResponse response) {
		List<Address> list = service.selectByNameS(name);
		
		return list;
	}
}