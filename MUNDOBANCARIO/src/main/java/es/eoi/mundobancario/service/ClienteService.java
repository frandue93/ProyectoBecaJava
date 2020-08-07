package es.eoi.mundobancario.service;

import java.util.List;

import es.eoi.mundobancario.dto.ClienteDto;
import es.eoi.mundobancario.dto.ClienteLoginDto;
import es.eoi.mundobancario.entity.Cliente;



public interface ClienteService {


	public void updateEmail(Cliente clienteEdit);

	public ClienteDto findClienteById(Integer id);
	
	public List<ClienteDto> findAll();
	
	public Cliente saveCliente( Cliente cliente);
	
	
	
}
