package AulasGuanabara.Aula1;

public class MainPrograma {

    // Programa Principal

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Fabiana");
        p4.setNome("Eduarda");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");

        p1.setIdade(19);
        p2.setIdade(23);
        p3.setIdade(32);
        p4.setIdade(21);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        p2.setCurso("Programacao");
        p3.setSalario(2000.35f);
        p4.setSetor("RH");

    }
}
