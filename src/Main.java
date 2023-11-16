import Animais.cachorro;
public class Main {

    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro("Richas", "Marrom", 22, 5.55, 5, "");

        System.out.println(cachorro.getNumerosDeCachorros());

        cachorro cachorro2 = new cachorro("Puck", "Branco", 22, 8.34, 4, "");

        System.out.println(cachorro.getNumerosDeCachorros());
//        System.out.println("O Cachorro Esta " + cachorro1.interagir("vai dormir"));
//        System.out.println("O Cachorro Esta " + cachorro1.interagir("carinho"));
//        System.out.println("O Cachorro Esta " + cachorro1.interagir("pisar na patinha"));
//        System.out.println("O Cachorro Esta " + cachorro1.interagir("nada"));


        }


    }


