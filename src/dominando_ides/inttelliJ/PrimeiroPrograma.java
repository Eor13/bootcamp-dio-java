package dominando_ides.inttelliJ;

import dominando_ides.inttelliJ.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Filo","Preto",12);
        System.out.println(gato);
        /* int a = 5;
        int b = 2;
        System.out.println("Hello World! " + (a+b));*/
        Livro livro = new Livro("Harry Potter", 300);
        System.out.println(livro);
    }
}

class Livro {
    private String nome;
    private Integer numeroDePagina;
    public Livro(String nome, Integer numeroDePagina){
        this.nome = nome;
        this.numeroDePagina = numeroDePagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(Integer numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroDePagina=" + numeroDePagina +
                '}';
    }
}
