
package paquete3;

/**
 *
 * @author reroes
 */
public class Procesador {
    private String marca;
    private double costo;
    
    public Procesador(String m, double c){
        marca = m;
        costo = c;
    }
    public void establecerMarca(String a){
        marca = a;
    }
    public void establecerCosto(double a){
        costo = a;
    }
    public String obtenerMarca(){
        return marca;
    }
    public double obtenerCosto(){
        return costo;
    }
}
