import java.util.Random;
public class Persona {
    Random r = new Random();
    public int persona[]; 
	public Persona(){
		this.persona = new int[10];
	}
	public void show(){
            System.out.println("Persona:");
		for (int i =0;i<this.persona.length;i++) {
			System.out.print(" "+this.persona[i]);			
		}
            System.out.println("");
	}
	public void agrega(int i){
            this.persona[i]=r.nextInt(15)+ 1;         		
	}   
}
