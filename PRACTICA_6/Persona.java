package PRACTICA_6;
import java.util.*;
//CODE CREADO POR J.ALFREDO L.D.C
public abstract class Persona {
	private final String [] NOMBR_H= {"Alfredo","Alex","Cristiano","Iker","David"};
	private final String [] NOMBR_M= {"Kimberly","Karla","Leslie","Yessica","Danna"};
	private final int hombres=1;
	private static final Random aleatorio=new Random();
	
	private String nombre;
	private int edad;
	private char sexo;
	private boolean assistencia;
	
	
	public Persona() {
		int elegirSexo=aleatorio.nextInt(2);
		if(elegirSexo==hombres) {
			nombre=NOMBR_H[aleatorio.nextInt(NOMBR_H.length)];
			sexo='H';
		}
		else{
			nombre=NOMBR_M[aleatorio.nextInt(NOMBR_M.length)];
			sexo='M';
		}
		disponibilidad();
	}

	public void setAssistencia(boolean assistencia) {
		this.assistencia = assistencia;
	}
	
	public boolean isAssistencia() {
		return assistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public abstract void disponibilidad();
}
