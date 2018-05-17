package com.qa.dodgy.business.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.qa.dodgy.business.repository.IHelloWorldRepository;
import com.qa.dodgy.persistence.domain.HelloWorld;

public class HelloWorldService implements IHelloWorldService {
	@Inject
	private IHelloWorldRepository repo;

	public String sayHello() {
		String names = String.join(", ", getNames());
		return String.format("{\"message\": \"Hello my dodgy friends!\", \"friends\": \"%s\"}", names);
	}
	
	private List<String> getNames() {
		List<HelloWorld> helloWorlds = repo.getHelloWorlds();
		List<String> names = new ArrayList<String>();
		for (HelloWorld helloWorld : helloWorlds) {
			names.add(helloWorld.getName());
		}
	return names;
	}
}
