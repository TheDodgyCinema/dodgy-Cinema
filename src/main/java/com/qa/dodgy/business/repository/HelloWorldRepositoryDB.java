package com.qa.dodgy.business.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qa.dodgy.persistence.domain.HelloWorld;

public class HelloWorldRepositoryDB implements IHelloWorldRepository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	public List<HelloWorld> getHelloWorlds(){
		TypedQuery<HelloWorld> query = manager.createQuery("SELECT h FROM HelloWorld h", HelloWorld.class);
		return query.getResultList();
	}
}
