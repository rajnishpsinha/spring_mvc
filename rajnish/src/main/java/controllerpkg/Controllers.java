package controllerpkg;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Daointerfaceimpl;
import model.Patient;

@Controller
public class Controllers {
	@Autowired
	Daointerfaceimpl dao;
/* 
 * @RequestMapping("/show")
 
public ModelAndView display(HttpServletRequest request, HttpServletResponse response)
{
String input=request.getParameter("nme");
ModelAndView mv= new ModelAndView();
mv.setViewName("/WEB-INF/views/message.jsp");
mv.addObject("buyer_name",input);
	return mv;}
	*/
@RequestMapping ("/viewall")
public ModelAndView viewAll(HttpServletRequest request, HttpServletResponse response)
{

List<Patient> patient_list=  dao.viewPatient();
ModelAndView mv= new ModelAndView();
mv.setViewName("/WEB-INF/views/showall.jsp");
mv.addObject("patients", patient_list);
	
return mv;	
 }

}
