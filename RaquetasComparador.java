import java.util.*;
/**
 * Write a description of class RaquetasComparador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetasComparador implements Comparator<IRaqueta>
{
    
    public int compare(IRaqueta raqueta1, IRaqueta raqueta2){
        if(raqueta1.calcularPotencia() == raqueta2.calcularPotencia()){
            return raqueta1.getModelo().compareTo(raqueta2.getModelo());
        }else if(raqueta1.calcularPotencia() > raqueta2.calcularPotencia()){
            return 1;
        }else{
            return -1;
        }
    }
}
