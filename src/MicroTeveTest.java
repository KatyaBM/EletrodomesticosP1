public class MicroTeveTest {
    public static void main(String[] args) {
        //Teste da classe Microondas
        Microondas micro = new Microondas("Samsung",true);
        System.out.printf(micro.toString());
        micro.abrirPorta();
        System.out.printf(micro.toString());
        micro.fecharPorta();
        micro.ligar();
        System.out.printf("\nInformação do Microondas \n"+ micro.toString());

    }
}
