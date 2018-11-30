package inteligenciaartificial;

import java.util.ArrayList;
import java.util.Random;

public class Persona {
    Random r = new Random();
    float fadaptacion;
    public int persona[]; 
    Integer valor;
    float hijos;

    public float getFadaptacion() {
        return fadaptacion;
    }

    public void setFadaptacion(float fadaptacion) {
        this.fadaptacion = fadaptacion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public float getHijos() {
        return hijos;
    }

    public void setHijos(float hijos) {
        this.hijos = hijos;
    }
    
    
    
    
    ArrayList PInicial = new ArrayList();
    
	public Persona(){
		this.persona = new int[16];
	}
	public void show(){
            System.out.println("Generacion:");
		for (int i =0;i<this.persona.length;i++) {
			System.out.print(" "+this.persona[i]);	
                        PInicial.add(this.persona[i]);
		}
            System.out.println("");
	}
	public void agrega(int i){
            
            this.persona[i]=r.nextInt(16)+1;         		
	}   
        
        public ArrayList<Integer> devolver(){
           
            return PInicial;
        }
}
