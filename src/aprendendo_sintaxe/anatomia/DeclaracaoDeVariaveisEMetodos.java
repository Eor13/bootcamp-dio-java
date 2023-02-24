package aprendendo_sintaxe.anatomia;

public class DeclaracaoDeVariaveisEMetodos {
    public static void main(String [] args) {
        // System.out.print("Ola Pessoal. Estou aprendendo Java!");

        // int ano =2023;
        // ano = 2024;
        // final String BR ="Brasil";
        // BR = "Brazil";

        // String meuNome = "Everson";
        // int anoFabricacao = 2022;
        // boolean verdadeira = false;
        // final String NOME = "Théo";
        // NOME = "Pequeno";
        String primeiroNome = "Everson";
        String segundoNome = "Ribeiro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}