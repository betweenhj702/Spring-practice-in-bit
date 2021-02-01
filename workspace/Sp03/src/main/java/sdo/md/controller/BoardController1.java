package sdo.md.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sdo.md.domain.Board;
import sdo.md.service.BoardService;
import sdo.md.vo.BoardVo;

@Controller
@RequestMapping("/board1/*")
public class BoardController1 {
	@Resource(name="BoardService1")
	private BoardService service;
	
	@GetMapping("/list.do")
	public ModelAndView list(HttpServletRequest request) {
		String cpStr = request.getParameter("cp");
		String psStr = request.getParameter("ps");
		
		HttpSession session = request.getSession();
		
		//(1) cp 
		int cp = 1;
		if(cpStr == null) {
			Object cpObj = session.getAttribute("cp");
			if(cpObj != null) {
				cp = (Integer)cpObj;
			}
		}else {
			cpStr = cpStr.trim();
			cp = Integer.parseInt(cpStr);
		}
		session.setAttribute("cp", cp);
		
		//(2) ps 
		int ps = 3;
		if(psStr == null) {
			Object psObj = session.getAttribute("ps");
			if(psObj != null) {
				ps = (Integer)psObj;
			}
		}else {
			psStr = psStr.trim();
			int psParam = Integer.parseInt(psStr);
			
			Object psObj = session.getAttribute("ps");
			if(psObj != null) {
				int psSession = (Integer)psObj;
				if(psSession != psParam) {
					cp = 1;
					session.setAttribute("cp", cp);
				}
			}else {
				if(ps != psParam) {
					cp = 1;
					session.setAttribute("cp", cp);
				}
			}
			
			ps = psParam;
		}
		session.setAttribute("ps", ps);
		
		BoardVo boardVo = service.listS(cp, ps);
		ModelAndView mv = new ModelAndView();
		if(boardVo.getList().size() == 0 && cp>1) {
			//response.sendRedirect("board.do?m=list&cp="+(cp-1));
			mv.setViewName("redirect:list.do?cp="+(cp-1));
			return mv;
		}else {
//			String view = "list.jsp";
//			RequestDispatcher rd = request.getRequestDispatcher(view);
//			rd.forward(request, response);
			mv.setViewName("board1/list");
			mv.addObject("boardVo", boardVo);
			return mv;
		}
	}
	
	@GetMapping("/write.do")
	public String write() {
		return "/board1/write";
	}
	
	@PostMapping("/write.do")
	public String write(Board board) {
		service.insertS(board);
		return "redirect:list.do";
	}
	
	@GetMapping("/content.do")
	public ModelAndView showContent(@RequestParam long seq) {
		Board board = service.showContentS(seq);
		return new ModelAndView("/board1/content","board",board);
	}
	
	@GetMapping("/delete.do")
	public String delete(@RequestParam long seq) {
		service.deleteS(seq);
		return "redirect:list.do";
	}
	
	@GetMapping("/update.do")
	public ModelAndView update(@RequestParam long seq) {
		Board board =service.showContentS(seq);
		return new ModelAndView("/board1/update","board",board);
	}
	@PostMapping("/update.do")
	public String update(Board board) {
		service.updateS(board);
		return "/board1/content";
	}
}
