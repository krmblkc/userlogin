package com.example.userlogin.service.imp;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.userlogin.model.User;


public class UserDetailsImp implements UserDetails{
	private User user;
	
	
	public UserDetailsImp(User user) {
		this.user = user;
	}
	
	public String getFullName() {
		return user.getFirstName() + " " + user.getLastName();
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}



	@Override
	public String getPassword() {
		
		return user.getPassword();
	}



	@Override
	public String getUsername() {
		
		return user.getEmail();
	}



	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}



	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}



	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}



	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
