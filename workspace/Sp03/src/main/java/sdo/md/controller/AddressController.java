package sdo.md.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;
import sdo.md.domain.Address;
import sdo.md.service.AddressService;


@Log4j
@Controller
@RequestMapping("/address/*")
public class AddressController {
	@Resource(name="addressService")
	private AddressService service;
	
	@GetMapping("/list.do")
	public ModelAndView list() {
		List<Address> list = service.listS();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("address/list");
		mv.addObject("list", list);
		return mv;
		//return new ModelAndView("address/list","list", list);
	}
	@GetMapping("/write.do")
	public String write() {
		return "address/write";
	}
	@PostMapping("/write.do")
	public String write(Address address) {
		service.insertS(address);
		return "redirect:list.do";
	}
	//**************** 스프링 컨트롤러에서 scope 객체에 접근하는 방법!! 파라미터에 넣어주면 된다 자동으로 세팅해줌. 
	@GetMapping("/del.do")
	public String delete(@RequestParam long seq,
			HttpSession session, HttpServletRequest request, Object page) {
		log.info("#session"+session);
		log.info("#request"+request);
		log.info("#page"+page);
		ServletContext application = session.getServletContext();
		log.info("#application"+application);
		service.deleteS(seq);
		return "redirect:list.do";
	}
	
}
