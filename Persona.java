import java.util.Random;
public class Persona {
    Random r = new Random();
    public int persona[]; 
	public Persona(){
		this.persona = new int[16];
	}
        public int getLong(){
            return this.persona.length;
        }
        public int getPersona(int i){
           return this.persona[i];
        }
	public void show(){
            System.out.println("Persona:");
		for (int i =0;i<this.persona.length;i++) {
			System.out.print(" "+this.persona[i]);
		}
            System.out.println("");
	}
	public void agrega(int i){
            this.persona[i]=r.nextInt(16)+1;         		
	}   
}
