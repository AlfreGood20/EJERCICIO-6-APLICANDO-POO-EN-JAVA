package PRACTICA_6;
import java.util.Random;
//CODE CREADO POR J.ALFREDO L.D.C
public class Profesor extends Persona{
	private static final Random aleatorio=new Random();
	private final String [] MATERIAS_DISPONIBLES= {"matemáticas","filosofia","física"};
	private String materia;
	
	public Profesor() {
		super();
		super.setEdad(23+aleatorio.nextInt(38));
		materia=MATERIAS_DISPONIBLES[aleatorio.nextInt(MATERIAS_DISPONIBLES.length)];
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	//
	@Override
	public void disponibilidad() {
		int elegirAssitencia=aleatorio.nextInt(100);
		super.setAssistencia(elegirAssitencia<20);
	}


	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSexo()=" + getSexo() + "]";
	}
}