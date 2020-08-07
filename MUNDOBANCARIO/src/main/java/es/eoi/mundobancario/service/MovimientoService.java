package es.eoi.mundobancario.service;

import java.util.List;

import es.eoi.mundobancario.dto.MovimientoDto;

public interface MovimientoService {

	public List<MovimientoDto> findAllMov();
}
