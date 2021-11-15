/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 2.0
 */
public class InitTennisData {

    public InitTennisData(Campeonato campeonato) {
        //Descomentar la carga de datos que se quiera probar
        //cargarDatos1(campeonato);//Produce la salida Salida1_EC2
        cargarDatos2(campeonato);//Produce la salida Salida2_EC2

    }
<<<<<<< HEAD
    
=======

>>>>>>> 7502802d45b9cea5b56fbf0b513419757aa05aef
    private void cargarDatos1(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo, número y valor)
        IZapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
        IZapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
        IZapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
        IZapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
        IZapatillas z5 = new ZapatillasConAgarre("Court Lite", 39, 3);
        IZapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40, 6);
        IZapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
        IZapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais y número de pie)
        Tenista t1 = new Tenista("Novak Djokovic",z1 , 90, 80, 1, "Serbia", 42);
        Tenista t2 = new Tenista("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
        Tenista t3 = new Tenista("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista t4 = new Tenista("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista t5 = new Tenista("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista t6 = new Tenista("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista t7 = new Tenista("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista t8 = new Tenista("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

<<<<<<< HEAD

=======
>>>>>>> 7502802d45b9cea5b56fbf0b513419757aa05aef
        //A continuación se inscribirán a los 8 tenistas en el campeonato
        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        IZapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
        IZapatillas z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
        IZapatillas z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
        IZapatillas z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
        IZapatillas z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
        IZapatillas z14 = new ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
        IZapatillas z15 = new ZapatillasAmortiguadas("Head Revolt", 40,  5);
        IZapatillas z16 = new ZapatillasConAgarre("Joma Slam", 40, 3);
        IZapatillas z17 = new ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
        IZapatillas z18 = new ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
        IZapatillas z19 = new ZapatillasConAgarre("Asics Solution", 42, 3);
        IZapatillas z20 = new ZapatillasConAgarre("Nike Air Zoom", 40,  5);
        IZapatillas z21 = new ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
        IZapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41,  5);
        IZapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);

        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control

        IRaqueta r1 = new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        IRaqueta r2 = new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        IRaqueta r3 = new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO); 
        IRaqueta r4 = new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        IRaqueta r5 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        IRaqueta r6 = new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        IRaqueta r7 = new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        IRaqueta r8 = new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        IRaqueta r9 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        IRaqueta r10 = new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        IRaqueta r11 = new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        IRaqueta r12 = new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);


        //A continuación se inscribirán a los 8 tenistas en el campeonato
        campeonato.inscribirTenista(t1);
        campeonato.inscribirTenista(t2);
        campeonato.inscribirTenista(t3);
        campeonato.inscribirTenista(t4);
        campeonato.inscribirTenista(t5);
        campeonato.inscribirTenista(t6);
        campeonato.inscribirTenista(t7);
        campeonato.inscribirTenista(t8);

        campeonato.addZapatillas(z9);
        campeonato.addZapatillas(z10);
        campeonato.addZapatillas(z11);
        campeonato.addZapatillas(z12);
        campeonato.addZapatillas(z13);
        campeonato.addZapatillas(z14);
        campeonato.addZapatillas(z15);
        campeonato.addZapatillas(z16);
        campeonato.addZapatillas(z17);
        campeonato.addZapatillas(z18);
        campeonato.addZapatillas(z19);
        campeonato.addZapatillas(z20);
        campeonato.addZapatillas(z21);
        campeonato.addZapatillas(z22);
        campeonato.addZapatillas(z23);

        campeonato.addRaqueta(r1);
        campeonato.addRaqueta(r2);
        campeonato.addRaqueta(r3);
        campeonato.addRaqueta(r4);
        campeonato.addRaqueta(r5);
        campeonato.addRaqueta(r6);
        campeonato.addRaqueta(r7);
        campeonato.addRaqueta(r8);
        campeonato.addRaqueta(r9);
        campeonato.addRaqueta(r10);
        campeonato.addRaqueta(r11);
        campeonato.addRaqueta(r12);
    }

<<<<<<< HEAD
=======
    
>>>>>>> 7502802d45b9cea5b56fbf0b513419757aa05aef
    private void cargarDatos2(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
        IZapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
        IZapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
        IZapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
        IZapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42,  3);
        IZapatillas z5 = new ZapatillasConAgarre("Court Lite", 39, 3);
        IZapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
        IZapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7);
        IZapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
        Tenista t1 = new Tenista ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista t2 = new Tenista ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
        Tenista t3 = new Tenista ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista t4 = new Tenista ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista t5 = new Tenista ("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista t6 = new Tenista ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista t7 = new Tenista ("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista t8 = new Tenista ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        z9 = ZapatillasAmortiguadas("Lotto Space", 40,  5);
        z10 = ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
        z11 = ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
        z12 = ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
        z13 = ZapatillasConAgarre("Joma Slam", 40, 3);
        z14 = ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
        z15 = ZapatillasConAgarre("Asics Solution", 42, 3);
        z16 = ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
        z17 = ZapatillasConAgarre("Nike Air Zoom", 40,  5);
        z18 = ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
        z19 = ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
        z20 = ZapatillasAmortiguadas("Head Revolt", 40,  3);
        z21 = ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
        z22 = ZapatillasConAgarre("Wilson Kaos", 41,  5);
        z23 = ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);

        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        r1 = RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        r2 = RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        r3 = RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        r4 = RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        r5 = RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        r6 = RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        r7 = RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        r8 = RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        r9 = RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        r10 = RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        r11 = RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        r12 = RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);

        campeonato.inscribirTenista(t1);
        campeonato.inscribirTenista(t2);
        campeonato.inscribirTenista(t3);
        campeonato.inscribirTenista(t4);
        campeonato.inscribirTenista(t5);
        campeonato.inscribirTenista(t6);
        campeonato.inscribirTenista(t7);
        campeonato.inscribirTenista(t8);

        campeonato.addZapatillas(z9);
        campeonato.addZapatillas(z10);
        campeonato.addZapatillas(z11);
        campeonato.addZapatillas(z12);
        campeonato.addZapatillas(z13);
        campeonato.addZapatillas(z14);
        campeonato.addZapatillas(z15);
        campeonato.addZapatillas(z16);
        campeonato.addZapatillas(z17);
        campeonato.addZapatillas(z18);
        campeonato.addZapatillas(z19);
        campeonato.addZapatillas(z20);
        campeonato.addZapatillas(z21);
        campeonato.addZapatillas(z22);
        campeonato.addZapatillas(z23);

        campeonato.addRaqueta(r1);
        campeonato.addRaqueta(r2);
        campeonato.addRaqueta(r3);
        campeonato.addRaqueta(r4);
        campeonato.addRaqueta(r5);
        campeonato.addRaqueta(r6);
        campeonato.addRaqueta(r7);
        campeonato.addRaqueta(r8);
        campeonato.addRaqueta(r9);
        campeonato.addRaqueta(r10);
        campeonato.addRaqueta(r11);
        campeonato.addRaqueta(r12);
    }
}
