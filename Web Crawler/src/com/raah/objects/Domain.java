package com.raah.objects;

import java.sql.Timestamp;

public class Domain {
	private String domainHash;
	private String domainUrl;
	private boolean activated;
	private Timestamp modified;
	private Timestamp created;
	
		
	public Domain(String domainHash, String domainUrl) {
		super();
		this.domainHash = domainHash;
		this.domainUrl = domainUrl;
	} //end of constructor
	
	public Domain(String domainHash, String domainUrl, boolean activated, Timestamp modified, Timestamp created) {
		super();
		this.domainHash = domainHash;
		this.domainUrl = domainUrl;
		this.activated = activated;
		this.modified = modified;
		this.created = created;
	} //end of constructor
	
	public String getDomainHash() {
		return domainHash;
	}
	public String getDomainUrl() {
		return domainUrl;
	}
	public boolean isActivated() {
		return activated;
	}
	public Timestamp getModified() {
		return modified;
	}
	public Timestamp getCreated() {
		return created;
	}

} //end of class
