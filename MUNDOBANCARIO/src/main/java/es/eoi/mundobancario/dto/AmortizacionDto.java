package es.eoi.mundobancario.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AmortizacionDto {
	
    private Date fecha;
	
	private double importe;
	
	private PrestamoDto prestamo;

}
