package es.eoi.mundobancario.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaDto {

    private String alias;
	
	private double saldo;

	private ClienteDto cliente;
}
