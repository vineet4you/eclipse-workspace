package com.example.demo.forms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
@Autowired
 FormFieldsRepo rep;
	
@RequestMapping("/")
public String loadForm()
{
	return"form";
}

@RequestMapping("/forms")
public String saveForm(FormFields ff)
{
	rep.save(ff);
	return"form";
}

@RequestMapping("/details")
public String viewDetails()
{
										
	return"details";
}
@PostMapping("/details")
public ModelAndView viewDetails(@RequestParam int cid)
{
	ModelAndView mv=new ModelAndView("retrieve");
	
	FormFields formFields= rep.findById(cid).orElse(null);
	mv.addObject(formFields);
	return mv;
}


	/*@GetMapping("/forms")
	public String loadForm()
	{
							//This is for just loading the jsp page
		return"form";
	}*/
	
		/*@PostMapping("/details")
		public String viewDetails(@RequestParam("cname") String cname, @RequestParam("cid") String cid,
				 @RequestParam("cmail") String cmail, ModelMap mp)
		{
			mp.put("cname", cname);
			mp.put("cid", cid);			//This is just post and to display detail
			mp.put("cmail", cmail);
			return "details";
		}*/
		
		
}
