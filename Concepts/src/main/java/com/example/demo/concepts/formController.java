package com.example.demo.concepts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class formController {



	/*public String callJSP(HttpServletRequest req)
	{
	HttpSession session=req.getSession();
	String fname=req.getParameter("fname");	//This whole block is by using HttpServleRequest,below is the alternative
	session.setAttribute("fname", fname);
		return "regform";
		
	}*/


/*public String callJSP(String fname, HttpSession session)
{											//This whole block is by using just the HttpSession
session.setAttribute("fname", fname);
return "regform";
}*/
	@RequestMapping("/check")
public ModelAndView callJSP(@RequestParam("fname") String fname)
{
	ModelAndView mv=new ModelAndView();
	mv.addObject("fname", fname);	//This block is using the ModelAndView Class;al the block is doing the same work
	mv.setViewName("regform");
	return mv;
	
}
}
