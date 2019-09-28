package com.curso.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.boot.service.UsuarioService;
import com.curso.spring.boot.Entity.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService = new UsuarioService();
	
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public List<Usuario> listarUusario(){
		return this.usuarioService.listarUsuario();
	}
	
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public List<Usuario> listarUusario(@RequestBody Usuario usuario){
		return this.usuarioService.listarUsuario(usuario);
	}
}
