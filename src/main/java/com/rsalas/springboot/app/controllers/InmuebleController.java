package com.rsalas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsalas.springboot.app.models.dao.IInmuebleDao;

@Controller
public class InmuebleController {


	@Autowired
	private IInmuebleDao inmuebleDao;
   
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model){
		model.addAttribute("titulo", "Listado de Inmuebles");
		model.addAttribute("inmuebles", inmuebleDao.findAll());
		return "listar";
	}
}
