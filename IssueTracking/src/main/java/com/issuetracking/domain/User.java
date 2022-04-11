package com.issuetracking.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	private Long id;
	private String username;
	private String password;
	private String name;
	private String accessLevel;
	
	private Set<Issue> issues;
	private Set<Project> projects;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	@ManyToMany
	public Set<Issue> getIssues() {
		return issues;
	}
	public void setIssues(Set<Issue> issues) {
		this.issues = issues;
	}
	
	@ManyToMany
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
}
