package B.Proyecto.StaticView.Domain;

import java.util.*;

public class Paciente {

	public String DNI;
	public String nombre;
	public int edad;
	public String vulnerabilidad;
	public List<Enfermedad> enfermedades;
	public boolean confinado;
	public boolean contagiado;
	public boolean ingresado;

	/**
	 * @param dNI
	 * @param nombre
	 * @param edad
	 * @param vulnerabilidad
	 * @param enfermedades
	 * @param confinado
	 * @param contagiado
	 * @param ingresado
	 */
	public Paciente(String dNI, String nombre, int edad, String vulnerabilidad, List<Enfermedad> enfermedades,
			boolean confinado, boolean contagiado, boolean ingresado) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.vulnerabilidad = vulnerabilidad;
		this.enfermedades = enfermedades;
		this.confinado = confinado;
		this.contagiado = contagiado;
		this.ingresado = ingresado;
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the vulnerabilidad
	 */
	public String getVulnerabilidad() {
		return vulnerabilidad;
	}

	/**
	 * @return the enfermedades
	 */
	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	/**
	 * @return the confinado
	 */
	public boolean isConfinado() {
		return confinado;
	}

	/**
	 * @return the contagiado
	 */
	public boolean isContagiado() {
		return contagiado;
	}

	/**
	 * @return the ingresado
	 */
	public boolean isIngresado() {
		return ingresado;
	}

	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param vulnerabilidad the vulnerabilidad to set
	 */
	public void setVulnerabilidad(String vulnerabilidad) {
		this.vulnerabilidad = vulnerabilidad;
	}

	/**
	 * @param enfermedades the enfermedades to set
	 */
	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}

	/**
	 * @param confinado the confinado to set
	 */
	public void setConfinado(boolean confinado) {
		this.confinado = confinado;
	}

	/**
	 * @param contagiado the contagiado to set
	 */
	public void setContagiado(boolean contagiado) {
		this.contagiado = contagiado;
	}

	/**
	 * @param ingresado the ingresado to set
	 */
	public void setIngresado(boolean ingresado) {
		this.ingresado = ingresado;
	}

	/**
	 * Devuelve una lista de enfermedades y si hay alguna que hace que el paciente
	 * est� confinado
	 * 
	 * @param dniPaciente
	 */
	public Enfermedad checkEnfermedad(String dniPaciente) {
		// TODO - implement Paciente.checkEnfermedad
		throw new UnsupportedOperationException();
	}

}