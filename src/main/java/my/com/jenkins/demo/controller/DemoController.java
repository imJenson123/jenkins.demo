package my.com.jenkins.demo.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import my.com.jenkins.demo.service.*;
import my.com.jenkins.demo.model.*;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET,
            produces = "application/json")
	public String test() {
		String test = "hi";
		return test;
	}
	
	@GetMapping(value="/user")
	public List<User> getUser(){
		return userService.getUserList();
	}
	
	@GetMapping(value="/user/{id}")
	public Optional<User> getUserById(@PathVariable(value="id") Integer id) {
		Optional<User> user = userService.getUserById(id);

		return user;
	}
	
	@GetMapping(value="/paramByMap")
	public String getParamByMap(@RequestParam Map<String,String> allParams) {
		Map<String,String> arrays = allParams;
		String name = arrays.get("name");
		
		return name;
	}
	
	@GetMapping(value="/paramByList")
	public List<String> getParamByList(@RequestParam List<String> test) {
		//parameter = ?name=jenson&test=test1,test2
		//return [test1,test2];
//		User user = userService.getUserByName(name);

		return test;
	}
	
//	@GetMapping(value="/paramByServlet")
//	public String getParamByServlet(HttpServletRequest request, HttpServletResponse response) {
//		String requestUrl = request.getRemoteAddr();
//		PrintWriter responseWriter = response.getWriter();
//		
//		return request.getParameter("name");
//	}
	
	@GetMapping(value="/userByName")
	public String getUserByName(@RequestParam String name) {
		
		User user = userService.getUserByName(name);

		return user.getUsrFirstName();
	}
	
	@GetMapping(value="/getMap")
	public HashMap<String,Object> getMap(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "jenson");
		
		return map;
	}
}
