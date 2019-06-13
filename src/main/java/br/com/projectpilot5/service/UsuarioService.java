package br.com.projectpilot5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projectpilot5.entity.Usuario;

public interface UsuarioService {

	void salvarUsuario(Usuario usuario);

	void verificacaoIdUsuarioExiste(long id);

	void deletar(long id);

	public List<Usuario> listar();

}
