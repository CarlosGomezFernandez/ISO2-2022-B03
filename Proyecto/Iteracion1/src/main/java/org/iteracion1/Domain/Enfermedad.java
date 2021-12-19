package org.iteracion1.Domain;

import java.util.*;

public class Enfermedad {

	public String nombre;
	public int idEnfermedad;
	public String duracionEstimada;
	public boolean confinamiento;
	public List<Sintoma> sintomas;
	private List<Medicina> medicinas;
	public List<Vacuna> vacunas;

	/**
	 * @param nombre
	 * @param idEnfermedad
	 * @param duracionEstimada
	 * @param confinamiento
	 * @param sintomas
	 * @param medicinas
	 * @param vacunas
	 */

	public Enfermedad(String nombre, int idEnfermedad, String duracionEstimada, boolean confinamiento,
			List<Sintoma> sintomas, List<Medicina> medicinas, List<Vacuna> vacunas) {
		super();
		this.nombre = nombre;
		this.idEnfermedad = idEnfermedad;
		this.duracionEstimada = duracionEstimada;
		this.confinamiento = confinamiento;
		this.sintomas = sintomas;
		this.medicinas = medicinas;
		this.vacunas = vacunas;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the idEnfermedad
	 */
	public int getIdEnfermedad() {
		return idEnfermedad;
	}

	/**
	 * @return the duracionEstimada
	 */
	public String getDuracionEstimada() {
		return duracionEstimada;
	}

	/**
	 * @return the confinamiento
	 */
	public boolean isConfinamiento() {
		return confinamiento;
	}

	/**
	 * @return the sintomas
	 */
	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	/**
	 * @return the medicinas
	 */
	public List<Medicina> getMedicinas() {
		return medicinas;
	}

	/**
	 * @return the vacunas
	 */
	public List<Vacuna> getVacunas() {
		return vacunas;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param idEnfermedad the idEnfermedad to set
	 */
	public void setIdEnfermedad(int idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	/**
	 * @param duracionEstimada the duracionEstimada to set
	 */
	public void setDuracionEstimada(String duracionEstimada) {
		this.duracionEstimada = duracionEstimada;
	}

	/**
	 * @param confinamiento the confinamiento to set
	 */
	public void setConfinamiento(boolean confinamiento) {
		this.confinamiento = confinamiento;
	}

	/**
	 * @param sintomas the sintomas to set
	 */
	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}

	/**
	 * @param medicinas the medicinas to set
	 */
	public void setMedicinas(List<Medicina> medicinas) {
		this.medicinas = medicinas;
	}

	/**
	 * @param vacunas the vacunas to set
	 */
	public void setVacunas(List<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

}