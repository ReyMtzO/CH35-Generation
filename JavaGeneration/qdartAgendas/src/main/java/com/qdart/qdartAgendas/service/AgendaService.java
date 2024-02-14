package com.qdart.qdartAgendas.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qdart.qdartAgendas.exceptions.AgendaNotFoundException;
import com.qdart.qdartAgendas.model.Agenda;
import com.qdart.qdartAgendas.repository.AgendaRepository;

@Service
public class AgendaService {
	//Vamos a traer a JPA para que nos brinde los métodos paara recuperar los datos
	private final AgendaRepository repository;
	
	//Constructor permite la inyección de dependencias
	@Autowired
	public AgendaService(AgendaRepository repository) {
		this.repository = repository;
	}
		
	//Crear método de tipo Get para traer a todas las agendas
	public List<Agenda> allAgendas() {
		return repository.findAll();
	}
	
	// Crear método de tipo Get para traer una agenda por Id, arrojando una excepción si no se encuentra
	public Agenda obtenerAgendaPorId(Long id) {
	    return repository.findById(id)
	            .orElseThrow(() -> new AgendaNotFoundException(id));  // Crear una excepción personalizada
	}
		
	// Crear método para eliminar una agenda por ID. Comprobar la existencia antes de la eliminación.
	public void eliminarAgenda(Long id) {
	    if (repository.existsById(id)) {
	        repository.deleteById(id);
	    } else {
	        // Lanzar una excepción personalizada si la agenda con el ID no existe
	        throw new AgendaNotFoundException(id);
	    }
	}
		
	/* Método para agregar una nueva agenda.
	 * Antes de agregar la nueva agenda, se verifica si ya existe una agenda con el mismo ID.
	 * Si ya existe una agenda con el mismo ID, se lanza una excepción.
	 * Si no existe, se guarda la nueva agenda en el repositorio. */
	public Agenda agregarAgenda(Agenda agenda) {
	    // Verificar si ya existe una agenda con el mismo ID
	    Optional<Agenda> existingAgenda = repository.findById(agenda.getId());

	    if (existingAgenda.isPresent()) {
	        // Lanzar una excepción si ya existe una agenda con el mismo ID
	        throw new IllegalStateException("Ya existe una agenda con el ID " + agenda.getId());
	    }

	    // Si no existe, guardar la nueva agenda en el repositorio
	    return repository.save(agenda);
	}
		
	/* Método para actualizar la información de una agenda.
	 * Se busca la agenda por su ID y se actualizan los campos proporcionados en el objeto `agenda`.
	 * Si la agenda existe, se aplican las actualizaciones y se guarda en el repositorio.
	 * Si no existe, se crea una nueva instancia con el ID proporcionado y se guarda en el repositorio. */
	public Agenda actualizarAgenda(Agenda agenda, Long id) {
	    return repository.findById(id)
	            .map(agendaEncontrada -> {
	                // Actualizar cada campo según las modificaciones
	                		agendaEncontrada.setNombreCliente(agenda.getNombreCliente());
	    agendaEncontrada.setTelefono(agenda.getTelefono());             		agendaEncontrada.setDireccionEvento(agenda.getDireccionEvento());
	    agendaEncontrada.setFechaEvento(agenda.getFechaEvento());             		agendaEncontrada.setHorarioEventoInicial(agenda.getHorarioEventoInicial());                		agendaEncontrada.setHorarioEventoFinal(agenda.getHorarioEventoFinal());	                		agendaEncontrada.setComentarioServicio(agenda.getComentarioServicio());

	       // Guardar la agenda actualizada en el repositorio
	       return repository.save(agendaEncontrada);
	       })
	       .orElseGet(() -> {
	                // Si no existe, crear una nueva instancia con el ID y guardar en el repositorio
	       agenda.setId(id);
	       return repository.save(agenda);
	       });
}

		
	/*
	 * Podemos buscar una agenda por medio de su nombre para recuperar información. Para ello dependemos de JPQL en el repository y ResponseEntity que se ejecutará en el controller.
	 * Vamos a crear un método para buscar a un usuario por nombre `getAgendaByName`
	 */
	public Agenda getAgendaByName(String nombreCliente) {
		return repository.findByNombreCliente(nombreCliente);
	}	
		
}
