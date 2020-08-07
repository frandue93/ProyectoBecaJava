package es.eoi.mundobancario.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.mundobancario.dto.MovimientoDto;
import es.eoi.mundobancario.entity.Movimiento;
import es.eoi.mundobancario.repository.MovimientoRepository;

@Service
public class MovimientoServiceImpl implements MovimientoService{

	@Autowired
	MovimientoRepository repository;

	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<MovimientoDto> findAllMov() {
		return repository.findAll().stream().
				map(this::convertToDto).collect(Collectors.toList());
	}

	private MovimientoDto convertToDto(Movimiento entity) {
		return modelMapper.map(entity, MovimientoDto.class);
	}

	private Movimiento convertToEntity(MovimientoDto dto) {
		return modelMapper.map(dto, Movimiento.class);
	}
}
