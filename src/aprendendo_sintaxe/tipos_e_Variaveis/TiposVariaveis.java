package aprendendo_sintaxe.tipos_e_Variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMedio =2.500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2+salarioMedio);
    }
}
