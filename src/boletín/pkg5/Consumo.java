
package boletín.pkg5;


public class Consumo {
    
    //atributos: km, litros, vMed, pGas
    
    private float km;
    
    private float litros;
    
    private float vMed;
    
    private float pGas;
    
    //ahora realizamos los constructores
    
    //primero el constructor por defecto
    public Consumo () {
    
}
    
    //constructor parametrizado
    
    public Consumo (float km, float lit, float vmed, float pgas){
        this.km = km;
        litros = lit;
        vMed = vmed;
        pGas = pgas;
        
    
    }
    
    //metodos de acceso ---> getters y setters
    
    //pedir el tiempo y devolverlo
    
  /*public void setTempo(float tempo){
  this.tempo = tempo;
  }  */

public float getTempo (){
       
      return km/vMed;
  }
    
public float getConsumoMedio (){
    return (100*litros)/km;
}


public float getConsumoEuros(){
    return getConsumoMedio()*pGas;
}

 

    
    
    public void setKm (float km){
        this.km = km;
    }
    
    
    public void setLitros (float litros){
        this.litros = litros;
    }
    
    public void setVmed (float vMed){
        this.vMed = vMed;
    }    
    
    public void setPgas (float pGas){
        this.pGas = pGas;
    }
    
    
    public void amosar(){
        System.out.println("Consumo medio: "+getConsumoMedio());
    }

    void amosar(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
