package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @version 1.0
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
//	其实这里经过视图解析器，他会捕获到一个虚拟的参数，然后返回给前台
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
}
