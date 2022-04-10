package com.issuetracking.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Access {

	private AccessID id;
	private String access_level;

	@EmbeddedId
	public AccessID getId() {
		return id;
	}

	public void setId(AccessID id) {
		this.id = id;
	}

	public String getAccess_level() {
		return access_level;
	}

	public void setAccess_level(String access_level) {
		this.access_level = access_level;
	}
	
}
