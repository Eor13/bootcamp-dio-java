package aprendendo_sintaxe.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        //Status Iniais
        System.out.println("TV Ligada? "+ smartTV.ligada);
        System.out.println("TV esta em qual canal? "+ smartTV.canal);
        System.out.println("TV esta em qual volume? "+ smartTV.volume);

        //Alterações de Status.
        smartTV.ligar();
        System.out.println("Novo Status - TV Ligada? "+ smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("Novo Status - TV Ligada? "+ smartTV.ligada);


        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("TV esta em qual volume agora? "+ smartTV.volume);
        
        smartTV.mudarCanal(13);
        System.out.println("TV esta em qual canal? "+ smartTV.canal);
    }
}
