package Animais;

public class gato extends Animal{

    static int numeroDeGatos;

    public gato(String nome, String cor, int altura) {
        super(nome, cor, altura);

    }

    @Override
    public void soar() {
        System.out.println("miau miau");
    }
}

