package br.com.mrcsfelipe.springJSF.manager;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.mrcsfelipe.springJSF.entity.Usuario;
import br.com.mrcsfelipe.springJSF.service.UsuarioService;


@RequestScoped
@ManagedBean
public class UsuarioHomeMB implements Serializable{

	private UsuarioService usuarioService;
	
	public UsuarioHomeMB() {
		// TODO Auto-generated constructor stub
	}
	
	public void verificarPreAuthrorize(){
		try {
			List<Usuario> usuarios = usuarioService.getUsuarios();
			
			for (Usuario usuario : usuarios) {
				System.out.println(usuario.getLogin());
			}
			
		} catch (Exception e) {
			System.out.println("DEU ERRO NO ACESSO.... FUNCIONOU O PreAutrhorize");
		}
		
		
	}
}
