package es.eoi.mundobancario.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovimientoDto {

 private String descripcion;
	 
	 private Date fecha;
	 
	 private double importe;
	 
	 private CuentaDto cuenta;
	 
	 private TipoMovimientoDto tipomovimiento;
}
