package es.eoi.mundobancario.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cuentas", schema = "mundobancario")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_cuenta")
	private int numcuenta;
	
	@Column(name = "alias")
	private String alias;
	
	@Column(name = "saldo")
	private double saldo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private Cliente cliente;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	private List<Prestamo> prestamos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	private List<Movimiento> movimientos;
}
