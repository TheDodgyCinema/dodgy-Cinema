package com.qa.dodgy.business.repository;

import java.util.List;

import com.qa.dodgy.persistence.domain.HelloWorld;

public interface IHelloWorldRepository {
	public List<HelloWorld> getHelloWorlds();

}
