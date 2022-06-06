package AulasGuanabara.Aula2;

public class Aula02 extends ContaBanco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta(22323);
        p1.setDono("Paulinho Pitomba");
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumeroConta(123123);
        p2.setDono("Limdomar Souza");
        p2.abrirConta("CP");
        p2.estadoAtual();

        p1.depositar(100);
        p2.depositar(500);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }

}
