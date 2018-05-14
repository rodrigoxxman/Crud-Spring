package com.rsalas.springboot.app.models.dao;

import java.util.List;

import com.rsalas.springboot.app.models.entity.Inmueble;

public interface IInmuebleDao {
	
	public List<Inmueble> findAll();
	

}
