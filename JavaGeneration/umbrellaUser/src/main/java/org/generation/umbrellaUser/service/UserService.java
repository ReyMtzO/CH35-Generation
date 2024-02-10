package org.generation.umbrellaUser.service;

import java.util.List;
import org.generation.umbrellaUser.model.User;
import org.generation.umbrellaUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	//Eliminamos todo lo relacionado al ArrayList que creamos para instanciar objetos
	//Ahora vamos a traer a JPA para que me brinde los métodos para recuperar los datos
	private final UserRepository repository;
	
	//Constructor permite la inyección de dependencias
	@Autowired
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	//Crear método de tipo Get para traer a todos los usuarios
	public List<User> allUsers() {
		return repository.findAll();
	}
}