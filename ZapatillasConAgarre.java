
/**
 * Write a description of class ZapatillasConAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends Zapatillas{
    public ZapatillasConAgarre(String tipo, int numero, double valor){
        super("Agarre", numero, valor);       
    }
    
    public double calcularValorResto(){
        return super.calcularValorResto()* 1.7;
    }
}
