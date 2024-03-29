package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IEsMagico;
import app.interfaces.IHacerMagia;
import app.personajes.Mago;
import app.transportes.Transporte;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando juego");
        System.out.println("PRESIONE ENTER");
        JuegoHarryPotter.InicializarJuego();

        Teclado.nextLine();

        System.out.println("pulse 1 para elegir a Harry Potter o 2 para elegir a Severus Snape");
        Mago pj1 = (Mago) JuegoHarryPotter.ElegirPersonaje("Harry Potter");
        Mago pj2 = (Mago) JuegoHarryPotter.ElegirPersonaje("Severus Snape");
        int opcion = Teclado.nextInt();
        Teclado.nextLine();

        Mago pjtmp = null;

        switch (opcion) {
        case 1:
            System.out.println("Elegiste a Harry Potter");

            break;

        case 2:
            System.out.println("Elegiste a Severus Snape");

            pjtmp = pj1;
            pj1 = pj2;
            pj2 = pjtmp;

            // intercambio de jugadores
            break;

        default:

            System.out.println("No hay más personajes");
            break;

        }

        // tenemos que hacer que pj1 y pj 2 peleen y que alguno de los dos gane o
        // pierda, por ahora probemos algo tranqui.
        System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
        System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

        System.out.println("El poder actual de " + pj1.nombre + pj1.energiaMagica + " y su salud es de " + pj1.salud);

        boolean atacapj1 = true;
        int tipoHechizo = 0;
        int artefactos = 0;
        int transportesMagicos = 0;
        Hechizo hechizoAtacante = null;
        Artefacto elArtefacto = null;
        Transporte elTransporte = null;

        System.out.println(
                "Elegi el artefacto a utilizar: 1= Piedra Filosofal, 2= Horror Crux, 3=Guarda pelo, 4= Diario Tom Riddle");
        artefactos = Teclado.nextInt();

        Artefacto pFilosofal = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Piedra Filosofal");
        Artefacto hCrux = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Horror crux");
        Artefacto sSlytherin = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Guardapelo de Salazar Slytherin");
        Artefacto tRiddle = (Artefacto) JuegoHarryPotter.ElegirArtefacto("Diario de Tom Riddle");

        Teclado.nextLine();

        switch (artefactos) {
        case 1:
            elArtefacto = pFilosofal;

            System.out.println("Has elegido una reliquia de la muerte");
            System.out
                    .println("El poder actual de " + pj1.nombre + pj1.energiaMagica + " y su salud es de " + pj1.salud);
            System.out
                    .println("El poder actual de " + pj2.nombre + pj2.energiaMagica + " y su salud es de " + pj2.salud);
            break;

        case 2:
            elArtefacto = hCrux;

            System.out.println("Has elegido un HorrorCrux");
            System.out
                    .println("El poder actual de " + pj1.nombre + pj1.energiaMagica + " y su salud es de " + pj1.salud);
            System.out
                    .println("El poder actual de " + pj2.nombre + pj2.energiaMagica + " y su salud es de " + pj2.salud);
            break;
        case 3:
            elArtefacto = sSlytherin;
            System.out.println("Has elegido el guardapelo de Salazar Sytherin");
            System.out
                    .println("El poder actual de " + pj1.nombre + pj1.energiaMagica + " y su salud es de " + pj1.salud);
            System.out
                    .println("El poder actual de " + pj2.nombre + pj2.energiaMagica + " y su salud es de " + pj2.salud);
            break;
        case 4:
            elArtefacto = tRiddle;

            System.out.println("Has elegido el Diario de Tom Riddle");
            System.out
                    .println("El poder actual de " + pj1.nombre + pj1.energiaMagica + " y su salud es de " + pj1.salud);
            System.out
                    .println("El poder actual de " + pj2.nombre + pj2.energiaMagica + " y su salud es de " + pj2.salud);
            break;

        default:
            System.out.println("No hay más artefactos");

            break;
        }

        System.out.println(
                "Elegi el transporte: 1=Alfombra Voladora , 2= Moto de Sirius Black, 3= Expreso a Hogwarts, 4=Autobus Noctambulo, 5= Escoba Nimbus 2000, 6= Escoba Saeta de fuego, 7= Giratiempo");
        transportesMagicos = Teclado.nextInt();
        Transporte alfombraVoladora = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Alfombra Voladora");
        Transporte motosirius = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Moto Sirius Black");
        Transporte eHogwarts = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Expreso a Hogwarts");
        Transporte aNoctambulo = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Autobús noctámbulo");
        Transporte escobaMagica = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Nimbus 2000");
        Transporte escobaMagica2 = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Saeta de Fuego");
        Transporte giratiempo = (Transporte) JuegoHarryPotter.SubiteAlTransporte("Giratiempo");

        Teclado.nextLine();

        switch (transportesMagicos) {
        case 1:
            elTransporte = alfombraVoladora;
            break;

        case 2:
            elTransporte = motosirius;
            break;
        case 3:
            elTransporte = eHogwarts;
            break;
        case 4:
            elTransporte = aNoctambulo;
            break;

        case 5:
            elTransporte = escobaMagica;

            break;

        case 6:
            elTransporte = escobaMagica2;

            break;
        case 7:
            elTransporte = giratiempo;

            break;

        default:
            System.out.println("No hay más transportes");

            break;
        }

        if (pj1 instanceof IEsMagico) {

            IEsMagico mago1 = (IEsMagico) pj1;
            ((IHacerMagia) mago1).atacar(elTransporte, elArtefacto);

            atacapj1 = !atacapj1;
        } else if (pj2 instanceof IEsMagico) {
            IEsMagico mago2 = (IEsMagico) pj2;
            ((IHacerMagia) mago2).atacar(elTransporte, elArtefacto);

        }

        while (pj1.salud > 0 && pj2.salud > 0)

        {

            if (atacapj1) {
                System.out.println(
                        "Elegi el hechizo a utilizar 1 = Sectum Sempra, 2 = Avada Kedabra, 3= Expelliarmus, 4= Maleficio Cruciatus");

                tipoHechizo = Teclado.nextInt();

                Hechizo sempra = (Hechizo) JuegoHarryPotter.ElegirHechizo("Sectum Sempra");
                Hechizo kedabra = (Hechizo) JuegoHarryPotter.ElegirHechizo("Avada Kedabra");
                Hechizo expelliarmus = (Hechizo) JuegoHarryPotter.ElegirHechizo("Expelliarmus");
                Hechizo cruciatus = (Hechizo) JuegoHarryPotter.ElegirHechizo("Maleficio Cruciatus");

                switch (tipoHechizo) {
                case 1:
                    hechizoAtacante = sempra;
                    System.out.println(pj1.nombre + " ha usado" + hechizoAtacante.nombreHechizo);

                    break;

                case 2:
                    hechizoAtacante = kedabra;
                    System.out.println(pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);

                    break;

                case 3:
                    hechizoAtacante = expelliarmus;
                    System.out.println(pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);

                    break;
                case 4:
                    hechizoAtacante = cruciatus;
                    System.out.println(pj1.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);

                    break;

                default:
                    System.out.println("No hay más hay hechizos disponibles en la opción");
                    break;
                }

                if (pj1 instanceof IHacerMagia) {

                    IHacerMagia mago1 = (IHacerMagia) pj1;

                    mago1.atacar(pj2, hechizoAtacante);

                    System.out.println(pj2.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);

                    atacapj1 = !atacapj1;
                }
            } else if (pj2 instanceof IHacerMagia) {

                IHacerMagia mago2 = (IHacerMagia) pj2;
                mago2.atacar(pj1, hechizoAtacante);
                System.out.println(pj2.nombre + " Ha usado " + hechizoAtacante.nombreHechizo);
            }

        }

        System.out.println("La salud de " + pj1.nombre + " es de " + pj1.salud);
        pj2.atacar(pj1, hechizoAtacante);
        System.out.println("La salud de " + pj2.nombre + " es de " + pj2.salud);

        if (pj1.salud == 0) {
            System.out.println(pj1.nombre + " Ha ganado el duelo.");
            System.out.println(
                    pj2.nombre + " Ha subido en " + elTransporte.nombreTransporte + " Y se ha retirado victorioso");

        } else if (pj2.salud == 0) {

            System.out.println(pj1.nombre + " Ha ganado el duelo.");

            System.out.println(
                    pj1.nombre + " Ha subido en " + elTransporte.nombreTransporte + " Y se ha retirado victorioso");

        } else {
            System.out.println(pj1.nombre + " Ha perdido el duelo ");
            System.out.println(
                    pj2.nombre + " Ha subido en " + elTransporte.nombreTransporte + " Y se ha retirado victorioso");
        }
    }

}
