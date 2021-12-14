
package boletín.pkg5;

import java.util.Scanner;

public class Boletín5 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometros percorridos: ");
        float km = sc.nextFloat();
        
        System.out.println("Litros de combustible consumidos ");
        float litros = sc.nextFloat();
        
        System.out.println("Velocidad media ");
        float vMed = sc.nextFloat();
        
        System.out.println("Prezo da gasolina ");
        float pGas = sc.nextFloat();
        
        Consumo obxCons1 = new Consumo ();
        obxCons1.amosar("Consumo medio" + obxCons1.getConsumoMedio());
        obxCons1.setLitros(50f);
        
        obxCons1.setPgas(1.57f);
        
       
        
        Consumo obxCons2 = new Consumo (km, litros, vMed, pGas);
        
       
       
        obxCons2.amosar("Velocidade media " + vMed);
        
    }
    
    
    
    
    
}
