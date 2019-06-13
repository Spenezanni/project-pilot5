package br.com.projectpilot5.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectpilot5.entity.Usuario;
import br.com.projectpilot5.error.ResourceNotFoundException;
import br.com.projectpilot5.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public void salvarUsuario(Usuario usuario) {
		System.out.println("--------------" + usuario.toString());
		usuarioRepository.save(usuario);
	}

	@Override
	public void verificacaoIdUsuarioExiste(long id) {
		Usuario usuario = usuarioRepository.findOne(id);
		if (usuario == null) {
			throw new ResourceNotFoundException("Id de Tarefa não existe");
		}
	}

	@Override
	public void deletar(long id) {
		usuarioRepository.delete(id);
	}

	@Override
	public List<Usuario> listar() {

		return (List<Usuario>) usuarioRepository.findAll();
	}

}
