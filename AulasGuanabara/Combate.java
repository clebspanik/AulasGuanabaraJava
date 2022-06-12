package AulasGuanabara.Aula4;

public class Combate {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; // Instanciando o objeto como vetor;

        l[0] = new Lutador("Pitchula Monster", "França", 31, 1.75f, 68.9f, 11, 12, 1);
        l[1] = new Lutador("Mago Aristeu", "Haiti", 29, 1.87f, 74.5f, 15, 10, 2);
        l[2] = new Lutador("Astrogildo", "Bahamas", 26, 1.79f, 70.2f, 12, 16, 1);
        l[3] = new Lutador("Zé Clodoaldo", "Áustria", 33, 1.85f, 90.6f, 20, 3, 3);

        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
    }
}
