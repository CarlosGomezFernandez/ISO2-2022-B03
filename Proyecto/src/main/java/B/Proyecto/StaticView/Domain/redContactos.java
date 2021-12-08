package B.Proyecto.StaticView.Domain;

public class redContactos {

	public String ID;
	public Paciente listaContactos;
	public String fecha;

	/**
	 * @param iD
	 * @param listaContactos
	 * @param fecha
	 */
	public redContactos(String iD, Paciente listaContactos, String fecha) {
		super();
		ID = iD;
		this.listaContactos = listaContactos;
		this.fecha = fecha;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @return the listaContactos
	 */
	public Paciente getListaContactos() {
		return listaContactos;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @param listaContactos the listaContactos to set
	 */
	public void setListaContactos(Paciente listaContactos) {
		this.listaContactos = listaContactos;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}