package aed.h2.app;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	@Column(columnDefinition = "char(9)")
	String idProducto;

	@Column(columnDefinition = "varchar(50)")
	String nomProducto;

	@Column(columnDefinition = "integer")
	int precio;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "codTienda")
	private Tienda tiendaObj;

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Tienda getTiendaObj() {
		return tiendaObj;
	}

	public void setTiendaObj(Tienda tiendaObj) {
		this.tiendaObj = tiendaObj;
	}

}
