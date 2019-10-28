
package com.javen.controller;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind .annotation.RequestMapping;
import org.springframework.web.bind .annotation.RequestMethod;

import com.javen.model.User;


@Controller
@RequestMapping("/user")
// /user/**
public class UserController {
	 private Logger log = Logger.getLogger(UserController.class);


// /user/test?id=1
@RequestMapping (value="/test", method=RequestMethod.GET)
public String test (HttpServletRequest request, Model model){
int userId = Integer.parseInt (request.getParameter ("id"));
System.out.println ("userId:"+userId);
User user=null;
if (userId==1) {
user = new User();
user.setAge(11);
user.setId(1);
user.setPassword ("123");
user.setUserName ("javen");
}

log.debug(user.toString());
model.addAttribute ("user", user);
return "index";
}
}