/**
 * Clase que lanza la simulación del campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 1.0
 */

public class TennisDemo {

    public static void main(String[] args) {
        //Creación del campeonato
        Campeonato campeonato= new Campeonato("Extremadura");
        //Carga de datos iniciales del campeonato
        //Instanciar una variable de tipo InitTennisData pasando la variable instanciada de tipo campeonato como parámetro;
        InitTennisData initData= new InitTennisData(campeonato);
        //Llamada al método que inicia la simulación del campeonato
        //Llamar al método que hayáis definido en vuestra clase Campeonato en la variable instanciada de tipo campeonato para que realice el campeonato;
        campeonato.juego();
        
    }
}