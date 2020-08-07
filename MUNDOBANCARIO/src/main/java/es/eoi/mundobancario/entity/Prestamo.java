package es.eoi.mundobancario.entity;

import java.sql.Date;
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
@Table(name = "prestamos", schema = "mundobancario")
public class Prestamo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "importe")
	private double importe;
	
	@Column(name = "plazos")
	private int plazos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prestamo")
	private List<Amortizacion> amortizaciones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cuenta", referencedColumnName = "num_cuenta")
	private Cuenta cuenta;
}
