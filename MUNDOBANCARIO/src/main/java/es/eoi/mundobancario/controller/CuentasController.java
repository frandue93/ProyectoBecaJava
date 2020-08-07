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

import es.eoi.mundobancario.dto.CuentaDto;
import es.eoi.mundobancario.dto.MovimientoDto;
import es.eoi.mundobancario.dto.PrestamoDto;
import es.eoi.mundobancario.entity.Cuenta;
import es.eoi.mundobancario.entity.Prestamo;
import es.eoi.mundobancario.service.CuentaService;
import es.eoi.mundobancario.service.MovimientoService;
import es.eoi.mundobancario.service.PrestamoService;

@RestController
public class CuentasController {
	
	@Autowired
	private CuentaService service;
	private PrestamoService servicePrest;
	private MovimientoService serviceMov;
	
	@GetMapping("cuentas/{id}")
	public ResponseEntity<CuentaDto> findCuentaByIdCuenta(@PathVariable Integer id){  
		return ResponseEntity.ok(service.findCuentaById(id));
	}
	
	
	@GetMapping("cuentas")
	public ResponseEntity<List<CuentaDto>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@PostMapping("cuentas")
	public ResponseEntity<String> createCuenta(@RequestBody Cuenta cuenta){
		service.saveCuenta(cuenta);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	/*@PostMapping("cuentas/{id}/prestamos")
	public ResponseEntity<String> createPrestamo(@RequestBody Prestamo prestamo){
		servicePrest.savePrestamo(prestamo);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}*/
	
	@PutMapping("cuentas/{id}")
	@ResponseBody
	public ResponseEntity<String> updateCuenta(@PathVariable Integer id,@RequestBody Cuenta cuenta){
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
	/*@GetMapping("cuentas/{id}/prestamos")
	@ResponseBody
	public ResponseEntity<List<PrestamoDto>> findAllPres(@PathVariable Integer id){
		return ResponseEntity.ok(servicePrest.findAllPres());
	}*/

	/*@GetMapping("Prestamo/{1}")
	public ResponseEntity<PrestamoDto> findPrestamoById(@PathVariable Integer id){  
		return ResponseEntity.ok(servicePrest.findPrestamoById(id));
	}*/
	

	
	/*@GetMapping("movimientos")
	@ResponseBody
	public ResponseEntity<List<MovimientoDto>> findAllMov(){
		return ResponseEntity.ok(serviceMov.findAllMov());
	}*/
}
