package AulasGuanabara.Aula4;

public class Lutador {

    // Atributos - Ordem 1 - Declaração de atributos; Ordem 2 - Criação de métodos;
    // 3 - Criação de métodos especiais;

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Metodos Publicos

    public void apresentar() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("CHEGOU A HORA DA PAULEIRA!!! Apresentamos o lutador " + this.nome);
        System.out.println("Diretamente da " + this.nacionalidade);
        System.out.println("com " + this.idade + " anos e " + this.altura);
        System.out.println("pesando " + this.peso + "Kg");
        System.out.println(vitorias + " vitórias");
        System.out.println(derrotas + " derrotas");
        System.out.println(empates + " derrotas");
    }

    public void status() {
        System.out.println(nome + " é um peso " + categoria);
        System.out.println(this.vitorias + " Ganhou");
        System.out.println(this.derrotas + " derrotas e ");
        System.out.println(this.empates + " empate(s)");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getVitorias() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
