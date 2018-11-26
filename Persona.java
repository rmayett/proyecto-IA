public class Persona{
	int persona[]; 
	public Persona(){
		this.persona= null;
	}
	public void show(){
		for (int i =0;i<this.persona.length;i++) {
			System.out.println(this.persona[i]);			
		}
	}
	public void agrega(){
		if (this.persona.length==0) {
			this.persona[0]=(int) (Math.random() * 15) + 1;
		}
		else {
			if (this.persona.length<10) {
			this.persona[this.persona.length+1]=(int) (Math.random() * 15) + 1;
			}
		}		
	}
}