package es.eoi.mundobancario.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import es.eoi.mundobancario.dto.TipoMovimientoDto;

import es.eoi.mundobancario.entity.TipoMovimiento;
import es.eoi.mundobancario.repository.TipoMovimientoRepository;

@Service
public class TipoMovimientoServiceImpl implements TipoMovimientoService {

	@Autowired
	TipoMovimientoRepository repository;

	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<TipoMovimientoDto> findAll() {
		return repository.findAll().stream().
				map(this::convertToDto).collect(Collectors.toList());
	}

	private TipoMovimientoDto convertToDto(TipoMovimiento entity) {
		return modelMapper.map(entity, TipoMovimientoDto.class);
	}

	private TipoMovimiento convertToEntity(TipoMovimientoDto dto) {
		return modelMapper.map(dto, TipoMovimiento.class);
	}
	
	
}
