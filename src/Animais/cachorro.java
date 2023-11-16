package Animais;
public class cachorro {

    //Attributes
    static int numerosDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int temanhoDoRabo;
    private String estadoDeEspirito;

    //contrutores padrao

    public cachorro(){}

    //construtores adicionais

    public cachorro(String nome, String cor, int altura, double peso, int temanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.temanhoDoRabo = temanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numerosDeCachorros ++; //cade cachorro criadd add +1

    }







    //metodos getters/setters


    public static int getNumerosDeCachorros() {
        return numerosDeCachorros;
    }
    public static void setNumerosDeCachorros(int numerosDeCachorros) {
        cachorro.numerosDeCachorros = numerosDeCachorros;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCor() {
        return cor;
    }
    public int getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public int getTemanhoDoRabo() {
        return temanhoDoRabo;
    }
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setTemanhoDoRabo(int temanhoDoRabo) {
        this.temanhoDoRabo = temanhoDoRabo;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void come(){}
    public void soar() {System.out.println("AU AU");}
    public String pegar() {return "Bolinha";}



    public String interagir(String acao) {

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;

    }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
