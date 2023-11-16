package Animais;
public class cachorro extends Animal {

    //Attributes
    static int numerosDeCachorros;


    public cachorro(String nome, String cor, int altura) {
        super(nome, cor, altura);

    }


    //contrutores padrao


    //construtores adicionais


    @Override
    public void soar() {
        System.out.println("au au");
    }

    @Override
    public String getNome() {
        return super.getNome();


    }


}











