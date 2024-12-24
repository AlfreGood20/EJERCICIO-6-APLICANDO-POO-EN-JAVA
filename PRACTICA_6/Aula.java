package PRACTICA_6;
import java.util.Random;
//CODE CREADO POR J.ALFREDO L.D.C
public class Aula {
	private final int MAX_ESTUDIANTES=10;
	private final String [] MATERIAS_DISPONIBLES= {"matemáticas","filosofia","física"};
	private static final Random aleatorio=new Random();
	
	private Estudiantes[] alumnos;
	private Profesor profe;
	private String materia;
	
	
	public Aula() {
		profe=new Profesor();
		alumnos=new Estudiantes[MAX_ESTUDIANTES];
		crearAlumnos();
		materia=MATERIAS_DISPONIBLES[aleatorio.nextInt(MATERIAS_DISPONIBLES.length)];
	}
	
	private void crearAlumnos() {
		for(int i=0;i<alumnos.length;i++) {
			alumnos[i]=new Estudiantes();
		}
	}
	
	private boolean assistenciaAlumnos() {
		int contarAssistencia=0;
		
		for(int i=0;i<alumnos.length;i++) {
			if (alumnos[i].isAssistencia()) {
			    contarAssistencia++;
			}
		}
		return contarAssistencia>(alumnos.length/2);
	}
	
	public boolean darClase() {
        return profe.isAssistencia() && profe.getMateria().equals(materia) && assistenciaAlumnos();
    }
	
	public String notas(){
        
        int chicosApro=0;
        int chicasApro=0;
        
         for(int i=0;i<alumnos.length;i++){
           if(alumnos[i].getCalificacionActual()>=5){
               if(alumnos[i].getSexo()=='H'){
                   chicosApro++;
               }
               else{
                   chicasApro++;
               }
           }
        }
        return "Hay "+chicosApro+" chicos y "+chicasApro+" chicas aprobad@s";
    }
	public void mostrarInfo() {
		System.out.println("Disponibilidad profe: "+profe.isAssistencia());
		System.out.println("Materia profe: "+profe.getMateria());
		System.out.println("Assistencia alumnos: "+assistenciaAlumnos());
		System.out.println("----------------------------------------------------");
		System.out.println("El aula esta destinada a materia: "+materia);
		System.out.println("----------------------------------------------------");
	}

	public String getMateria() {
		return materia;
	}

	public Profesor getProfe() {
		return profe;
	}
	
}
