public class MicroTeveTest {
    public static void main(String[] args) {
        //Teste da classe Microondas
        Microondas micro = new Microondas(false, "Samsung", false);
        micro.abrirPorta();
        micro.fecharPorta();
        micro.ligar();
        System.out.printf("\nInformação do Microondas \n"+ micro.toString());
        if(micro.ligar()==true){
            System.out.printf("\nErro!! Microondas com a porta aberta, nao pode ligar\n");
        }
        else
            System.out.printf("\nMicroondas ligado, porta fechada\n");
        micro.desligar();

        //Teste da classe Televisor
        Televisor tv = new Televisor(true, "Samsung", 5);
        //tv.adicionaNumeroAosCanais();
        tv.ligar();
        System.out.printf("\nInformação do Televisor \n"+ tv.toString());
        System.out.printf("\nProximo Canal: "+ tv.canalAcima(5));
        System.out.printf("\nCanal Anterior: "+ tv.canalAbaixo(5));
        //System.out.printf("");
        tv.desligar();
    }
}
