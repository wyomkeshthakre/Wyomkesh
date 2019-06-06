package com.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@RequestMapping("/show")
	public ModelAndView showData() {
		ModelAndView m=new ModelAndView();
		m.setViewName("Home");
		
		//adding data
		//--------Primitive Type------
		m.addObject("eid", 222);
		m.addObject("ename", "AA");
		m.addObject("esal", 3.2);
		
		//---Collection Data--------
		List<String> list=new ArrayList<>();
		list.add("L1");
		list.add("L2");
		list.add("L3");
		m.addObject("mylst",list);
		
		Set<String> set=new HashSet<>();
		set.add("S1");
		set.add("S2");
		set.add("S3");
		m.addObject("myset",set);
		
		Map<String,String> map=new HashMap<>();
		map.put("m1", "v1");
		map.put("m2", "v2");
		
		m.addObject("mymap", map);
		
		//---Model class Object data--------
		Employee emp=new Employee(555, "AJAY", 33.33);
		m.addObject("emp", emp);
		
		return m;
	}
	
}


