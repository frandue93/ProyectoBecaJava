package es.eoi.mundobancario.service;

import java.util.List;


import es.eoi.mundobancario.dto.TipoMovimientoDto;

public interface TipoMovimientoService {

	public List<TipoMovimientoDto> findAll();
}
