package sdo.bt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/*")
public class PageController {
	@RequestMapping("")
	public String index0() {
		return "pages/index";
	}
	@RequestMapping("blank.html")
	public String blank() {
		return "pages/blank";
	}
	@RequestMapping("buttons.html")
	public String buttons() {
		return "pages/buttons";
	}
	@RequestMapping("flot.html")
	public String flot() {
		return "pages/flot";
	}
	@RequestMapping("forms.html")
	public String forms() {
		return "pages/forms";
	}
	@RequestMapping("grid.html")
	public String grid() {
		return "pages/grid";
	}
	@RequestMapping("icons.html")
	public String icons() {
		return "pages/icons";
	}
	@RequestMapping("index.html")
	public String index() {
		return "pages/index";
	}
	@RequestMapping("login.html")
	public String login() {
		return "pages/login";
	}
	@RequestMapping("morris.html")
	public String morris() {
		return "pages/morris";
	}
	@RequestMapping("notifications.html")
	public String notifications() {
		return "pages/notifications";
	}
	@RequestMapping("panels-wells.html")
	public String panelswells() {
		return "pages/panels-wells";
	}
	@RequestMapping("tables.html")
	public String tables() {
		return "pages/tables";
	}
	@RequestMapping("typography.html")
	public String typography() {
		return "pages/typography";
	}
}
