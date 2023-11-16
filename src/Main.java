import Animais.cachorro;
public class Main {

    public static void main(String[] args) {

        cachorro cachorro2 = new cachorro();
        cachorro cachorro1 = new cachorro("Richas", "Marrom", 22, 5.55, 5, "");
        System.out.println("O Cachorro Esta " + cachorro1.interagir("vai dormir"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("carinho"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O Cachorro Esta " + cachorro1.interagir("nada"));
        System.out.println(cachorro2);
        System.out.println(cachorro1);
    }
}

