package Animais;

public class gato {

    //atributos

    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;


//metodos

    void comer(){}
    void dormir(){}
    void soar(){System.out.println("MIAU MIAU");}

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}