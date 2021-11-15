import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Set;
import java.util.*;

/**
 * La clase campeonato representa el campeoato que se va a disputar
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Campeonato{
    
    private String nombre;
    private ArrayList <Tenista> competidores;
    private ArrayList <Tenista> eliminados;
    private String datos;
    private ArrayList <IZapatillas> zapatillasCampeonato;
<<<<<<< HEAD
    private Set <RaquetaGenerica> raquetasCampeonato;
=======
    private Set <IRaqueta> raquetasCampeonato;
>>>>>>> 480e49c00f955bdaf797e8135d4542ad86b6429d
    
    /**
     * Constructor del objeto de la clase Campeonato
     * @param nombre Nombre asignado al campeonato
     */
    public Campeonato(String nombre){
        this.nombre= nombre;
        this.competidores= new ArrayList <Tenista>();
        this.eliminados= new ArrayList <Tenista>();
        this.zapatillasCampeonato=new ArrayList <IZapatillas>();
<<<<<<< HEAD
        this.raquetasCampeonato=new TreeSet <RaquetaGenerica>(new RaquetasComparador());
=======
        this.raquetasCampeonato=new TreeSet <IRaqueta>(new RaquetasComparador());
>>>>>>> 480e49c00f955bdaf797e8135d4542ad86b6429d
        
        datos="";
    }
    
    /**
     * Establece el nombre del campeonato
     * @param nombre Nombre que recibe el campeonato
     */
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    /**
     * Obtiene el nombre del campeonato
     * @return Nombre del campeonato
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Inserta una cadena de datos
     * @param datos Cadena de datos a insertar
     */
    public void setDatos(String datos){
        this.datos += datos;
    }
    
    /**
     * Obtiene la cadena de datos
     * @return Datos
     */
    public String getDatos(){
        return this.datos;
    }
    
    /**
     * Inscribe a un tenista en el campeonato
     * @param tenista Tenista que se inscribe
     */
    public void inscribirTenista(Tenista tenista){
        this.competidores.add(tenista);
    }

    /**
     * Elimina a un tenista del campeonato teniendo en cuenta su posicion
     * @param tenista Tenista a eliminar
     * @param posicion Posicion del tenista al ser eliminado
     */
    public void eliminarTenista(Tenista tenista, int posicion){
        this.competidores.remove(tenista);
        tenista.setPosicionElim(posicion);
        this.eliminados.add(tenista);
    }
    
    /**
     * Devuelve la lista de los competdiores
     */
    public ArrayList <Tenista> getCompetidores(){
        return this.competidores;
    }

    /**
     * Devuelve la lista de los eliminados
     */
    public ArrayList<Tenista> getEliminados(){
        return this.eliminados;
    }
    
    /**
     * Actualiza la posicion de un tenista en la lista de competidores
     * @param tenista Tenista que actualiza su posición en la lista
     * @param nuevaPosicion Es la nueva posición del tenista en la lista
     */
    public void actualizarLista(Tenista tenista, int nuevaPosicion){       
        this.competidores.add(nuevaPosicion, tenista);
        competidores.remove(competidores.size()-1);
    }
    
    public void addZapatillas(IZapatillas z1){
        zapatillasCampeonato.add(z1);
    }
    
    public void removeZapatillas(Zapatillas z1){
        zapatillasCampeonato.remove(z1);
    }
    
    public void addRaqueta(IRaqueta r1){
        raquetasCampeonato.add(r1);
    }
    
    public void removeRaqueta(IRaqueta r1){
        raquetasCampeonato.remove(r1);
    }
    
    public boolean asignarRaquetas(){
        boolean cancelado=false;
        IRaqueta raqueta;
        
        if(raquetasCampeonato.size()<competidores.size()){
            cancelado=true;
        }
        else{
            for(int i=0;i<competidores.size();i++){
                raqueta=raquetasCampeonato.get(0);             
            }
        }
        
        return cancelado;
    }
    
    /**
     * Pone en marcha todos los partidos hasta que solo quede un tenista que será el ganador
     */
    void juego(){
        Tenista t1, t2;         
        int ronda=1;
        int tamaño;
        setDatos(" Inicio del campeonato: Campeonato de " + this.getNombre()+ " \n");
        setDatos("\n***** Listado de competidores:\n");
        for(Tenista tenista: competidores){
            setDatos (tenista.toString() + "\n");
            setDatos (tenista.getZapatillas().toString() + "\n");
        }
        int contador=0;
        while(competidores.size()>1){
            setDatos("\n*****Ronda---->>>: "+ ronda+ "\n");          
            tamaño= competidores.size()/2;
            for(int i=0; i< tamaño; i++){                   
                t1= competidores.get(i);
                t2= competidores.get(competidores.size()-1);
                setDatos("### Juego ----------->>>: "+ i+ "\n");
                setDatos("Tenista1 ---->>>: "+ t1.getNombre()+ "\n");
                setDatos("Tenista2 ---->>>: "+ t2.getNombre()+ "\n");                              
                t1.jugar(t2);
                t2.jugar(t1);
                if(t1.getPuntosAcumulados()> t2.getPuntosAcumulados()){                   
                    eliminarTenista(t2,contador);
                }else if(t1.getPuntosAcumulados() < t2.getPuntosAcumulados()){
                    eliminarTenista(t1,contador);
                    actualizarLista(t2, i);
                }else if((t1.getSaque()+t1.getResto()) < (t2.getSaque()+t2.getResto())){
                    eliminarTenista(t2,contador);
                }else{
                    eliminarTenista(t1,contador);
                    actualizarLista(t2, i);
                }
                
                setDatos("## Gana este juego: "+ competidores.get(i).getNombre()+ " con: "+ competidores.get(i).getPuntosAcumulados()
                + " puntos acumulados.\n");
                setDatos("## Se elimina: "+ eliminados.get(eliminados.size()-1).getNombre()+ " con: "+ eliminados.get(eliminados.size()-1).getPuntosAcumulados()
                + " puntos acumulados. Tenista eliminado núm: "+ (eliminados.size())+ "\n");
                t1.setPuntosAcumulados(0);
                t2.setPuntosAcumulados(0);
                contador++;
            }
            ronda++;            
        }
        
        Collections.sort(eliminados,(new DesempateComparador()).reversed());
        setDatos("\n---->>>>  Gana la competición: Tenista "+ competidores.get(0).toString()+ "\n"
        + competidores.get(0).getZapatillas().toString()+ "  <<<<----\n");
        setDatos("\n***** Listado de eliminados:\n");
        for(Tenista tenista: eliminados){
            setDatos (tenista.toString() + "\n");
            setDatos (tenista.getZapatillas().toString() + "\n");
        }        
        System.out.println(this.getDatos());
    }
}
