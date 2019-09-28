package com.curso.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.boot.Entity.Usuario;

@Service
public class UsuarioService {

	public List<Usuario> listarUsuario() {
		List<Usuario> listar = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		usuario.setNome("Luciano");
		usuario.setIdade(40);
		usuario.seteMail("luciano.desenvolvedor@gmail.com");
		listar.add(usuario);

		usuario = new Usuario();
		usuario.setNome("Aline");
		usuario.setIdade(25);
		usuario.seteMail("aline@gmail.com");
		listar.add(usuario);
		return listar;
	}
	
	public List<Usuario> listarUsuario(Usuario usuarioAdd) {
		List<Usuario> listar = this.listarUsuario();
		listar.add(usuarioAdd);
		
		return listar;
	}
}
