/**
 * Abstract class RaquetaAbs - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class RaquetaAbs
{
    protected IRaqueta raqueta;
    protected String subtipo;
    
    public RaquetaAbs(IRaqueta raqueta, String subtipo){
        this.raqueta= raqueta;
        this.subtipo= subtipo;
    }
    
    public String getSubtipo(){
        return this.subtipo;
    }
    
    public String getModelo(){
        return this.getModelo();
    }
    
    public double getPeso(){
        return this.getPeso();
    }
    
    public double getLongitud(){
        return this.getLongitud();
    }
    
    public double getTamCabeza(){
        return this.getTamCabeza();
    }
    
    public EnumEncordado getEncordado(){
        return this.getEncordado();
    }
    
    public String tipoEncordado(){
        return this.tipoEncordado();
    }
    
    public double calcularPotencia(){
        return this.calcularPotencia();
    }
    
    public double calcularControl(){
        return this.calcularControl();
    }
    
    public double calcularVelocidad(){
        return this.calcularVelocidad();
    }
    
    public String toString(){
        String datos="";
        datos+= "Raqueta Abstracta";
        return datos;
    }
}
