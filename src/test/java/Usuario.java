import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.projectpilot5.dto.UsuarioDTO;

public class Usuario {

	public String modificausuario(@PathVariable long id, @RequestBody UsuarioDTO usuarioDTO) {

		Usuario usuario = new Usuario();

		usuario.setId(1);
		usuario.setLogin("kikgsodjf");
		usuario.setSenha("123");
	
		return "Usuario Modificado com sucesso!!!";

	}

	private void setSenha(String senha) {
		// TODO Auto-generated method stub
		
	}

	private void setLogin(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setId(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
