package com.example.project.service;



import com.example.project.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class ContactService {
	 private static Logger log= LoggerFactory.getLogger(ContactService.class);
	 public boolean display(Contact contact)
	 {
		 boolean isSaved=true;
	 log.info(contact.toString());
	 return isSaved;
	 }

}
