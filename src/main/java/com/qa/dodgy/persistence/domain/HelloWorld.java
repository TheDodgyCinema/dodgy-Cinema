package com.qa.dodgy.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HelloWorld {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;

    HelloWorld() {}
	
	HelloWorld(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
