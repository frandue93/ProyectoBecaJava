package es.eoi.mundobancario.service;

import java.util.List;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import es.eoi.mundobancario.dto.ClienteDto;
import es.eoi.mundobancario.dto.ClienteLoginDto;
import es.eoi.mundobancario.entity.Cliente;
import es.eoi.mundobancario.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	 ClienteRepository repository;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	public ClienteDto findClienteById(Integer id) {
		return this.convertToDto(repository.findById(id).get());
	}
	
	
	
	/*public ClienteLoginDto findLoginById(Integer id,String email) {
	
		
		return this.convertToDto(repository.modEmail(email, id).get());
	}*/
	
	
	
	public List<ClienteDto> findAll(){
		return repository.findAll().
				stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}
	
	public Cliente saveCliente( Cliente cliente) {
		return repository.save(cliente);
				
	}
  
	public void updateEmail(Cliente clienteEdit ) {
          repository.modEmail(null, 0);
      
    }
	
	private ClienteDto convertToDto(Cliente entity) {
		return modelMapper.map(entity, ClienteDto.class);
	}
	
	private Cliente convertToEntity(ClienteDto dto) {	
	    return modelMapper.map(dto,Cliente.class);	
	}




	/*@Override
	public ClientePassDto loginCliente(Integer id, String pass) {
		
		return null;
	}*/



	
}
