package sdo.md.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;
import sdo.md.domain.Address;
import sdo.md.domain.ChartDTO;
import sdo.md.service.AddressAjaxService;

@Log4j
@Controller
@RequestMapping("auto")
public class AutoController {
	@Autowired
	private AddressAjaxService service;
	
	@RequestMapping("auto.do")
	public String showView() {
		return "auto/autocomplete";
	}
	
	@PostMapping(value="auto_result", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
	public @ResponseBody List<Address> getData(String writer){
		//log.info(writer);
		List<Address> list = service.selectByNameS(writer);
		
		return list;
	}
}
