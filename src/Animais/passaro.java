package Animais;
public class passaro extends Animal {
    static int numeroDePassaros;


    public passaro(String nome, String cor, int altura) {
        super(nome, cor, altura);
    }

    //metodos


    @Override
    public void soar() {
        System.out.println("piu piu");
    }

    @Override
    public String getNome() {
        return super.getNome();


    }
}











