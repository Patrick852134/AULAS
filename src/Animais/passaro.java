package Animais;

public class passaro {
    static int numeroDePassaros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    //contrutor

    public passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDePassaros++;
    }

    //metodos

    void comer() {
    }

    void dormir() {
    }

    void soar() {System.out.println("PIU PIU");}

}

