package aed.h2.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@Column(columnDefinition = "char(9)")
	String idCliente;

	@Column(columnDefinition = "varchar(50)")
	String nomCLiente;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "codTienda")
	private Tienda tiendaObj;

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomCLiente() {
		return nomCLiente;
	}

	public void setNomCLiente(String nomCLiente) {
		this.nomCLiente = nomCLiente;
	}

	public Tienda getTiendaObj() {
		return tiendaObj;
	}

	public void setTiendaObj(Tienda tiendaObj) {
		this.tiendaObj = tiendaObj;
	}

}
