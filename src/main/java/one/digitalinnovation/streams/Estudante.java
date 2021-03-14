package one.digitalinnovation.streams;

public class Estudante {

    private String nome;
    private int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return getNome() + " - " + getIdade() + " anos";
    }

}
