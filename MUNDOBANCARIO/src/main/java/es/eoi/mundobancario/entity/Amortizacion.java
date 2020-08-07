package es.eoi.mundobancario.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "amortizaciones", schema = "mundobancario")
public class Amortizacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "importe")
	private double importe;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prestamo", referencedColumnName = "id")
	private Prestamo prestamo;
}
