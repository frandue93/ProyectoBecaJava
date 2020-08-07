package es.eoi.mundobancario.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrestamoDto {

private String descripcion;
	
	private Date fecha;
	
	private double importe;
	
	private int plazos;
	
	private CuentaDto cuenta;
}
