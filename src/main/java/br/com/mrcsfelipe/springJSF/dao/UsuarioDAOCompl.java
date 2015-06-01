package br.com.mrcsfelipe.springJSF.dao;

import java.util.List;

import br.com.mrcsfelipe.springJSF.entity.Usuario;

public class UsuarioDAOCompl extends GenericDAO<Usuario> implements UsuarioDAO{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioDAOCompl() {
		super(Usuario.class);
	}
	
	public List<Usuario> getUsuarios(){
		
		super.beginTransaction();
		List<Usuario> usuarios = super.findAll();
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getLogin());
		}
		
		super.closeTransaction();
		
		
		
		return usuarios;
	}

}
