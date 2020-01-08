package mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Employee;

@Controller
public class EmployeeController {
@Autowired
EmployeeDaoImpl dao;
@RequestMapping(value="/addempl", method=RequestMethod.GET)
public String showEmployeeForm(){
return "AddEmpl";
}
@RequestMapping(value="/addempl", method=RequestMethod.POST)
public ModelAndView addEmployee(@ModelAttribute("employee")Employee emp){
ModelAndView mav=new ModelAndView();
mav.addObject(emp);
mav.setViewName("redirect:viewempls");
return mav;
}
@RequestMapping(value="/viewempls", method=RequestMethod.GET)
public ModelAndView getEmpls(){
List<Employee> emplist=dao.getEmpls();
ModelAndView mav=new ModelAndView();
mav.addObject("empls",emplist);
mav.setViewName("ViewEmpls");
return mav;
}

}