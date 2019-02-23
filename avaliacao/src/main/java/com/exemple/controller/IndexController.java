package com.exemple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exenple.Repository.EventoRepository;

@Controller
public class IndexController {

@RequestMapping("/")
public String index() {
	return "index";
}
	
}
