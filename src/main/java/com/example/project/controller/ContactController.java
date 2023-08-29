package com.example.project.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Contact;
import com.example.project.service.ContactService;

@Controller
public class ContactController {
private final ContactService contactservice;

@Autowired
public ContactController(ContactService contactservice) {
	this.contactservice=contactservice;

}

@RequestMapping("/contact")
public String displaycontactpage()
{
	return "contact.html";
}
 /*private static Logger log= LoggerFactory.getLogger(ContactController.class);
@RequestMapping(value="/saveMsg",method=POST)
public ModelAndView savemessage(@RequestParam String name, @RequestParam String mobileNum,
        @RequestParam String email, @RequestParam String subject, @RequestParam String message)
{

log.info("name:"+name);
log.info("mobilenum:"+mobileNum);
log.info("email"+email);
log.info("subject"+subject);
log.info("message"+message);
return new ModelAndView("redirect:/contact");

}      */



@RequestMapping(value = "/saveMsg",method = POST)
public ModelAndView saveMessage(Contact contact){
    contactservice.display(contact);
    return new ModelAndView("redirect:/contact");
}




}
