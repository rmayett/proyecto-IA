/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class InteligenciaArtificial {
    static ArrayList<Persona> generaciones = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InteligenciaArtificial proyecto = new InteligenciaArtificial();
        generaciones = proyecto.poblacion();
        // aqui va la funcion de aceptacion
        
        proyecto.seleccion();
        // para los hijos y el cruce el valor de generaciones.get(i).getfadap()
        //tiene que ser mayor al 60% de costo 
                
    }
    
    //Creamos la priemra generación 
    public ArrayList<Persona> poblacion(){
        int i=0,j=0;
        Persona[] per=new Persona[1];
        ArrayList<Integer> prueba = new ArrayList<>();
        
        do{
            per[j]=new Persona();
            i=0;
                do{
                    per[j].agrega(i);
                    i++;
                }while(i!=per[j].persona.length);
            System.out.println("No. "+(j+1));
            per[j].show();
            prueba = per[j].devolver();
                j++;
                
        }while(j<1);       
	
        System.out.println("Prueba"+ prueba.size());
        
        ArrayList<Persona> generacion1 = new ArrayList<>();
        
        for(Integer valor: prueba){
            Persona aux = new Persona();
            aux.setValor(valor);
            aux.setHijos(0);
            aux.setFadaptacion(0);
            
            generacion1.add(aux);
        }
        
    return generacion1;
    
    }
    
    public void seleccion(){
        int costo = 0;
        float alpha =8.5f;
        float Sinfa = 0;
        int repetidos = 0;
        
        costo = sacarCosto(generaciones);
        
        for(int i = 0; i< generaciones.size();i++){
            Sinfa = sacarSinfact(i+1, generaciones.get(i).getValor());
            float fadap = costo - alpha* Sinfa;
            
            
            //Castiga repetidos
            if(Sinfa != 0){
                for(int j = i+1; j< generaciones.size(); j++ ){

                    if(generaciones.get(i).getValor() == generaciones.get(j).getValor() ){
                        fadap = fadap /2;
                    }
                }
            }
            generaciones.get(i).setFadaptacion(fadap);
            
        }
        
        for(Persona pr : generaciones ){
            
            System.out.println("valores: "+ pr.getFadaptacion());
        }
        
    }
    
    public Integer sacarCosto(ArrayList<Persona> tmpArray){
        int valorTmp =0;
        
        for (Persona tmp : tmpArray){
            valorTmp = valorTmp + tmp.getValor();
        }
        return valorTmp;
    }
    
    public Integer sacarSinfact(Integer marcador, Integer valor){
        
        if(valor > marcador){
            
            return valor - marcador;
        }else if(valor < marcador){
            return marcador - valor;
        }else{
            return 0;
        }
    }
}
