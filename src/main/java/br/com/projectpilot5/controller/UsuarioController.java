package br.com.projectpilot5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projectpilot5.dto.UsuarioDTO;
import br.com.projectpilot5.entity.Usuario;
import br.com.projectpilot5.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/usuario")
	@ResponseBody
	public void salvarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setLogin(usuarioDTO.getLogin());
		usuario.setSenha(usuarioDTO.getSenha());
		usuarioService.salvarUsuario(usuario);
	}

	@PutMapping(value = "/usuario/{id}")
	@ResponseBody
	public String modificausuario(@PathVariable long id, @RequestBody UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setLogin(usuarioDTO.getLogin());
		usuario.setSenha(usuarioDTO.getSenha());
		usuarioService.verificacaoIdUsuarioExiste(id);
		usuarioService.salvarUsuario(usuario);
		return "Usuario Modificado com sucesso!!!";

	}

	@DeleteMapping(value = "/usuario/{id}")
	@ResponseBody
	public String deletar(@PathVariable long id) {
		usuarioService.verificacaoIdUsuarioExiste(id);
		usuarioService.deletar(id);
		return "Usuario Deletado";
	}
	


}
