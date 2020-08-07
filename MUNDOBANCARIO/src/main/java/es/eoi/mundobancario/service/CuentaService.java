package es.eoi.mundobancario.service;

import java.util.List;

import es.eoi.mundobancario.dto.ClienteLoginDto;
import es.eoi.mundobancario.dto.CuentaDto;
import es.eoi.mundobancario.entity.Cuenta;

public interface CuentaService {
	
	public Cuenta saveCuenta(Cuenta cuenta);
	
	public List<CuentaDto> findAll();
	
	public CuentaDto findCuentaById(Integer id);
	
	public void cuentaService(Cuenta cuentaEdit);
	
	
	
}
