package AulasGuanabara.Aula1;

public class Aluno extends Pessoa {

    // Atritubos
    private int matricula;
    private String curso;

    // Metodos

    public void cancelarMatricula() {
        System.out.println("Matricula sera cancelada");

    }

    // Metodos especiais

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
