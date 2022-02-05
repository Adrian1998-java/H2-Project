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
@Table(name = "tienda")
public class Tienda {

	@Id
	@Column(columnDefinition = "char(9)")
	String codTienda;
	
	@Column(columnDefinition = "varchar(100)")
	String localizacion;
	
	@Column(columnDefinition = "varchar(50)")
	String nomTienda;
	
	@OneToMany (cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "tiendaObj")
	List<Productos> productos = new ArrayList<>();
	
	@OneToMany (cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "tiendaObj")
	List<Clientes> clientes = new ArrayList<>();

	public String getCodTienda() {
		return codTienda;
	}

	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getNomTienda() {
		return nomTienda;
	}

	public void setNomTienda(String nomTienda) {
		this.nomTienda = nomTienda;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	
	
}
