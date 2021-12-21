package org.Iteracion5.Domain;

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
	 * Devuelve una lista de enfermedades y si hay alguna que hace que el paciente esté confinado
	 * @param dniPaciente
	 */
	public Enfermedad checkEnfermedad(String dniPaciente) {
		// TODO - implement Paciente.checkEnfermedad
		throw new UnsupportedOperationException();
	}

}