package com.rsalas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rsalas.springboot.app.models.entity.Inmueble;

@Repository
public class InmuebleDaoImpl implements IInmuebleDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)//solo lectura
	@Override
	public List<Inmueble> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From Cliente").getResultList();
	}

}
