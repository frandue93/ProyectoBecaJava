package es.eoi.mundobancario.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.mundobancario.dto.PrestamoDto;

import es.eoi.mundobancario.entity.Prestamo;

import es.eoi.mundobancario.repository.PrestamoRepository;

@Service
public class PrestamoServiceImpl implements PrestamoService {

	@Autowired
	PrestamoRepository repository;

	@Autowired
	ModelMapper modelMapper;

	
	public List<PrestamoDto> findAllPres() {
		return repository.findAll().
				stream().
				map(this::convertToDto).
				collect(Collectors.toList());

	}

	
	public Prestamo savePrestamo(Prestamo prestamo) {
		return repository.save(prestamo);
	}

	
	public PrestamoDto findPrestamoById(Integer id) {
		return this.convertToDto(repository.findById(id).get());
	}

	private PrestamoDto convertToDto(Prestamo entity) {
		return modelMapper.map(entity, PrestamoDto.class);
	}

	private Prestamo convertToEntity(PrestamoDto dto) {
		return modelMapper.map(dto, Prestamo.class);
	}

}
