package org.Iteracion5.Domain;

import java.util.*;

public class Enfermedad {

	public String nombre;
	public int idEnfermedad;
	public String duracionEstimada;
	public boolean confinamiento;
	public List<Síntoma> sintomas;
	private List<Medicina> medicinas;
	public List<Vacuna> vacunas;

}