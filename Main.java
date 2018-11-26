public class Main {
    public void poblacion(){
        int i=0,j=0;
        Persona[] per=new Persona[50];
        do{
            per[j]=new Persona();
            i=0;
                do{
                    per[j].agrega(i);
                    i++;
                }while(i!=per[j].persona.length);
            System.out.println("No. "+(j+1));
            per[j].show();
                j++;
        }while(j<50);
        
	}
	public static void main(String[] args) {
		Main proyecto = new Main();
		proyecto.poblacion();
	}
    
}
