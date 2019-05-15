package br.com.projectpilot5.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioDTO implements UserDetails{
	
	private String login;
	private String senha;
	
	public UsuarioDTO(){
		super();
	}
	
	public UsuarioDTO(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
