package AulasGuanabara.Aula1;

public class Pessoa {

    // Atributos

    private String nome;
    private int idade;
    private String sexo;

    // Metodos

    public void fazerAniver() {
        this.idade++;
    }

    // Metodos Especiais

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", sexo='" + getSexo() + "'" +
                "}";
    }

    public void receberAumento(float f) {
    }

}
