package es.eoi.mundobancario.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.mundobancario.dto.ClienteDto;
import es.eoi.mundobancario.dto.ClienteLoginDto;
import es.eoi.mundobancario.entity.Cliente;
import es.eoi.mundobancario.service.ClienteService;


@RestController
public class ClientesController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("clientes/{id}")
	public ResponseEntity<ClienteDto> findClienteByIdCliente(@PathVariable Integer id){
		return ResponseEntity.ok(service.findClienteById(id));
	}
	
	/*@GetMapping("clientes/login")
	public ResponseEntity<ClienteLoginDto> findLoginByIdCliente(@PathVariable Integer id, String pass){
		
		return ResponseEntity.ok(service.findClienteById(id,pass));
	}*/
	
	@GetMapping("clientes")
	public ResponseEntity<List<ClienteDto>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping("clientes")
	public ResponseEntity<String> createCliente(@RequestBody Cliente cliente){
		service.saveCliente(cliente);
		return new ResponseEntity<String>(HttpStatus.CREATED);
		
	}

	
	
	/*@PostMapping("clientes/login")
	public ResponseEntity<ClienteDto> loginCliente(@RequestBody Cliente cliente, @PathVariable Integer id, String pass){
		if (id.equals(cliente.getId()) && pass.equals(cliente.getPass()))
		return ResponseEntity.ok(service.findClienteById(id));
		
	}*/
	
	/*@PutMapping("clientes/{id}")
	@ResponseBody
	public ResponseEntity<String> updateCliente(@PathVariable Integer id, @RequestBody Cliente cliente){
		service
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}*/
	
	/*@UpdateMapping("clientes/{id}")
	public ResponseEntity<String> updateEmail(@)
	*/

}
