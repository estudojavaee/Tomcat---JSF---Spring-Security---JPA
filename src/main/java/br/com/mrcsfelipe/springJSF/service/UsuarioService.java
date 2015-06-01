package br.com.mrcsfelipe.springJSF.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import br.com.mrcsfelipe.springJSF.dao.UsuarioDAO;
import br.com.mrcsfelipe.springJSF.dao.UsuarioDAOCompl;
import br.com.mrcsfelipe.springJSF.entity.Usuario;

public class UsuarioService {
	
	private UsuarioDAO usuarioDAO =  new UsuarioDAOCompl();
	
	public UsuarioService() {
		
	}
	
	@PreAuthorize("hasRole('ROLE_ADMINISTRADOR')")
	public List<Usuario> getUsuarios(){
		return usuarioDAO.getUsuarios();
	}
	

}
