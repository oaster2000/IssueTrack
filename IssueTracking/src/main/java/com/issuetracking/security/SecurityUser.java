package com.issuetracking.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.issuetracking.domain.User;

public class SecurityUser extends User implements UserDetails{

	private static final long serialVersionUID = 288931419970644977L;
	
	public SecurityUser() { }
	
	public SecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setName(user.getName());
		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
		this.setIssues(user.getIssues());
		this.setProjects(user.getProjects());
	}

	@Override
	public Set<Authority> getAuthorities() {
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername();
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
