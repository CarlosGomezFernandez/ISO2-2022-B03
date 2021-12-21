package org.Iteracion2.Domain;

import java.util.*;

public class Enfermedad {

	public String nombre;
	public int idEnfermedad;
	public String duracionEstimada;
	public boolean confinamiento;
	public List<Sintoma> sintomas;
	private List<Medicina> medicinas;
	public List<Vacuna> vacunas;

}