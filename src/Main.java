import Animais.Animal;
import Animais.cachorro;
import Animais.gato;
import Animais.passaro;

public class Main {

    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro("Richas", "Marrom", 22);

        passaro passaro1 = new passaro("Ale","Preto",22);

        gato gato1 = new gato("felix","amarelo", 22);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        System.out.println(cachorro1.getNome());







        }


    }


