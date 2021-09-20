public class Microondas extends Eletrodomestico{
    private boolean portaFechada;

    public Microondas(String marcaModelo,boolean portaFechada){
        super(marcaModelo);
        this.portaFechada = portaFechada;
    }

    public boolean getPortaFechada() {
        return portaFechada;
    }

    public void fecharPorta(){
        if(!getPortaFechada())
            portaFechada = true;
    }
    public void abrirPorta(){
        if(getPortaFechada())
            portaFechada = false;
    }

    @Override
    public void ligar() {
        if(getPortaFechada()){//porta aberta nao liga
            super.ligar();
        }
        else
            throw new IllegalArgumentException("Feche a porta para ligar!!!");
    }

    @Override
    public String toString() {
        return  "Microondas" + super.toString() +
                (getPortaFechada()? "\nPorta Fechada" : "\nPorta Aberta");
    }
}
