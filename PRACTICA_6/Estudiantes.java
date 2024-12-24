package PRACTICA_6;
import java.util.*;
//CODE CREADO POR J.ALFREDO L.D.C
public class Estudiantes extends Persona{
	private static final Random aleatorio=new Random();
	
	private int calificacionActual;
	
	public Estudiantes() {
		super();
		calificacionActual=0+aleatorio.nextInt(11);
		super.setEdad(12+aleatorio.nextInt(17));
	}

	
	public double getCalificacionActual() {
		return calificacionActual;
	}


	public void setCalificacionActual(int calificacionActual) {
		this.calificacionActual = calificacionActual;
	}

	//ELEGIR ASISTENCIA
	@Override
	public void disponibilidad() {
		int elegirAssitencia=0+aleatorio.nextInt(100);
		super.setAssistencia(elegirAssitencia<50);
	}

	@Override
	public String toString() {
		return "Estudiante [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + "Calificacion="+ calificacionActual+"]";
	}
}