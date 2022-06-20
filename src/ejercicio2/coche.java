package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class coche {
    private int puertas;
    
    public coche(int puertas){
		this.puertas= puertas;
	}
	
	public void anadirpuertas(int puertas){
		this.puertas += puertas;
	}
	
	public void printInfo(){
		System.out.println("puertas: " + puertas);
	}
    public static void main(String[] args) {
       
        coche carro = new coche(4);
       carro.anadirpuertas(2);
       carro.printInfo();      
        
    }
    
}
