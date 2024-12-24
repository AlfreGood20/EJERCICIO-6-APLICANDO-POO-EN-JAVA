package PRACTICA_6;
//CODE CREADO POR J.ALFREDO L.D.C
public class Principal {

	public static void main(String[] args) {
		Aula aula=new Aula();
        aula.mostrarInfo();
        
        if(aula.darClase()) {
        	System.out.println("Si hubo clase.....");
        	System.out.println(aula.notas());
        }
        else {
        	System.out.println("No hubo clase.......");
        }
    }
}