package es.eoi.mundobancario.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.mundobancario.dto.ClienteDto;
import es.eoi.mundobancario.dto.ClienteLoginDto;
import es.eoi.mundobancario.dto.CuentaDto;
import es.eoi.mundobancario.entity.Cuenta;
import es.eoi.mundobancario.repository.CuentaRepository;
@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	CuentaRepository repository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public CuentaDto findCuentaById(Integer id) {
		return this.convertToDto(repository.findById(id).get());
	}
	
	public List<CuentaDto> findAll(){
		return repository.findAll().
				stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}
	
	public Cuenta saveCuenta(Cuenta cuenta) {
		return repository.save(cuenta);
	}

	
	
	public void cuentaService(Cuenta cuentaEdit) {
		repository.modAlias(null, 0);
		
	}


	
	
	private CuentaDto convertToDto(Cuenta entity) {
		return modelMapper.map(entity, CuentaDto.class);
	}

	private Cuenta convertToEntity(CuentaDto dto) {
		return modelMapper.map(dto, Cuenta.class);
	}

}
