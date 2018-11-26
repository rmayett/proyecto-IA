
import java.util.Scanner;  
public class IA{
	public void poblacion(){
	Persona per = new Persona();
	per.agregar();
	per.show();
	}
	public static void main(String[] args) {
		IA proyecto = new IA();
		proyecto.poblacion();
	}
}