package com.exemple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exemple.model.Lenbrete;
import com.exenple.Repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/cadastroEvento", method= RequestMethod.GET)
	public String Form() {
		return "lenbrete/formEvento";
	}

	@RequestMapping(value="/cadastroEvento", method= RequestMethod.POST)
	public String Form(Lenbrete lenbrete) {
		
		er.save(lenbrete);
		
		return "redirect:/formEvento";
	}
	
	
	@RequestMapping("/lenbrete")
		public ModelAndView listaEventos() {
			ModelAndView mv = new ModelAndView("index");
			Iterable<Lenbrete> lenbrete = er.findAll();
			
			mv.addObject("lenbrete",lenbrete);
			return mv;
		}
	}
	

