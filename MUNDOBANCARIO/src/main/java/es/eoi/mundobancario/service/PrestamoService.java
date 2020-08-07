package es.eoi.mundobancario.service;

import java.util.List;

import es.eoi.mundobancario.dto.PrestamoDto;
import es.eoi.mundobancario.entity.Prestamo;

public interface PrestamoService {

	
	public List<PrestamoDto> findAllPres();
	
	public Prestamo savePrestamo( Prestamo prestamo);
	
	public PrestamoDto findPrestamoById(Integer id);
}
