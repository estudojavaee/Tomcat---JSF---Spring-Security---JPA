package br.com.mrcsfelipe.springJSF.manager;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.security.access.prepost.PreAuthorize;

import br.com.mrcsfelipe.springJSF.entity.Usuario;
import br.com.mrcsfelipe.springJSF.service.UsuarioService;


@RequestScoped
@ManagedBean
public class AdminHomeMB implements Serializable{

	private List<Usuario> usuarios;
	private UsuarioService usuarioService;
	
	public AdminHomeMB() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init(){
		usuarioService = new UsuarioService();
		usuarios = usuarioService.getUsuarios();
		
	}
	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	
	
	
	
	
	
	
}
