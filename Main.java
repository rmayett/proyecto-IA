import java.io.*;
public class Main {
    public void poblacion(){
        File f = new File("Generaciones.txt");
        try{
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("Primera Generacion");
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
            pw.println("No. "+(j+1));
            for (int p =0;p<per[j].getLong();p++) {
			pw.print(per[j].getPersona(p)+" ");
		}
            pw.println("");
            per[j].show();
                j++;
        }while(j<50);
        //llamamos a seleccion
        //llamamos cruza
        //Mostramos generacion 
        pw.println("Segunda Generacion");
        //metemos en condicion de repeticion 
        pw.close();
        bw.close();
        }catch(IOException e){};
	}
	public static void main(String[] args) {
		Main proyecto = new Main();
		proyecto.poblacion();
	}
    
}
