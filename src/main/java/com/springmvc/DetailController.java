package com.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Employee;
import com.springmvc.repository.EmployeeDao;

@Controller
public class DetailController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping(path = "/details", method = RequestMethod.GET)
	public String getdDetail() {
		return "details";
	}

	//Using @RequestParam method for getting data from view 
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public ModelAndView handleForm(@RequestParam("email") String email, @RequestParam("username") String username,
//			@RequestParam("password") String password) {
//		ModelAndView view = new ModelAndView();
//		view.addObject("email", email);
//		view.addObject("username", username);
//		view.addObject("password", password);
//
//		view.setViewName("mypage1");
//
//		return view;
//
//	}
	
	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Employee employee,BindingResult result,Model model )
	{
		//System.out.println(employee);
		
		if(result.hasErrors())
		{
			return "details";
		}
		if(employeeDao.addEmployee(employee))
		return "mypage1";
		
		return "error";
		
	}
	
	@RequestMapping(path = "/searchbyid",method = RequestMethod.POST)
	public ModelAndView searchData(@RequestParam("searchbyid") String searchById)
	{
		ModelAndView view=new ModelAndView();
		Employee searchEmployee = employeeDao.searchEmployee(Long.parseLong(searchById));
		view.addObject("searchEmployee", searchEmployee);
		view.setViewName("searchResult");
		
		return view;
	}
}
