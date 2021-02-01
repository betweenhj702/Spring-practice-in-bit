package sdo.ct.controller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;
import sdo.ct.domain.Human;
import sdo.ct.domain.HumanList;
import sdo.ct.domain.ToDoDTO;




@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	@RequestMapping("")
	public void m01() {
		log.info("m1(): 디폴트 유알엘");
	}
	
	@RequestMapping("/base1")
	public void m02() {
		log.info("m02() - Get방식 & Post방식 & ...");
	}
	@RequestMapping(value="/base2", method=RequestMethod.GET)
	public void m03() {
		log.info("m03() - only Get방식");
	}
	@RequestMapping(value="/base3", method= {RequestMethod.GET, RequestMethod.POST})
	public void m04() {
		log.info("m04() - Get방식 & Post방식");
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String form() {
		return "sample/form";
	}
	
	//뷰에서 전달하는 데이터, 컨트롤러에서 받는 여러가지 방법
	@RequestMapping(value="/param1")
	public void m05(Human human) {
		log.info("dto: "+ human);	//DTO로 전달, 멤버변수이름과 파라미터 이름이 같아야함.
	}
	@RequestMapping(value="/param2")
	public void m06(@RequestParam String name, @RequestParam int age) {
		log.info("파람이름: "+name);	//파라미터이름으로 전달
		log.info("파람나이: "+age);	//뷰에서 넘겨주는 파라미터의 이름과 변수 이름이 같아야한다
	}
	@RequestMapping("/param3")
	public void m07(@RequestParam ArrayList<String> names){
		log.info("m07() names: " + names);	//동일한 파라미터에 여러 데이터를 전달했을 때, 배열로 받을 수 있다 
	}
	@RequestMapping("/param4")
	public void m08(@RequestParam("ns") ArrayList<String> names){
		log.info("m08() names: " + names);	//(흔하지 않음)넘어오는 파라미터 이름과 변수이름이 다를 때, 이렇게 받을 수 있다. 
	}
	@RequestMapping("/param5")
	public void m09(@RequestParam String[] names){
		log.info("m09() names: " + names);	//동일한 파라미터에 여러 데이터를 전달했을 때, 배열로 받을 수 있다
		for(String name: names) log.info("name: "+name);
	}
	@RequestMapping("/param6")
	public void m10(HumanList hlist) {
		log.info("배열 안의 내용을 출력 : "+hlist); 	//겟메소드를 쓰지 않고, 배열안의 내용을 출력해줄수 있는 기법. ****
	}
	@RequestMapping(value="/param7")
	public void m011(Human human, @RequestParam int page) {
		log.info("dto: "+ human);	//DTO로 전달 + DTO에 없는 변수
		log.info("page: "+ page);
	}
	@RequestMapping("/param8")
	public void m12(ToDoDTO dto)  {
		log.info("m12() dto.getCdate(): " + dto.getCdate());	//시간데이터의 전달 ToDoDTO에서 패턴어노테이션
	}
	
	
	//서버에서 브라우저로 데이터 전달하는 방법(html, text, json, xml)
	//@RequestMapping(value="/json1", method=RequestMethod.GET)
	@GetMapping("/json1")		
	public ResponseEntity<String> m13() {
		String msg = "{\"name\":\"임연지\", \"age\":25}"; //json 
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json;charset=utf-8");
		
		return new ResponseEntity<String>(msg, headers, HttpStatus.OK);
	}
	@GetMapping("/json2")
	public @ResponseBody Human m14() { //*****
		return new Human("세종대왕", 40);
	}
}
