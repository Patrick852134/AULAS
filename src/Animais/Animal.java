package Animais;

public class Animal {

    //atributos

    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, int altura) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    protected void comer() {
    }

   protected void dormir() {
    }

    public void soar() {
        System.out.println("cri cri");
    }

}