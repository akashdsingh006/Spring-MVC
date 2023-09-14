package com.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcomePage()
	{
		return "details";
	}
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "Akash Anand");
		model.addAttribute("id", 14562);
		System.out.println("Home is working");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("About is working");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Virat Kohli");
		modelAndView.addObject("num", 18);
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		modelAndView.addObject("list", list);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	@RequestMapping("/data/{id}")
	public ModelAndView dataHandler(@PathVariable("id") int id)
	{
		ModelAndView view=new ModelAndView();
		view.addObject("id",id);
		view.setViewName("datapage");
		
		return view;
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandler()
	{
		return "error";
	}
}
