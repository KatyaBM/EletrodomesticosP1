public class Microondas extends Eletrodomestico{
    private boolean portaFechada;

    public Microondas(boolean ligado, String marcaModelo,boolean portaFechada){
        super(ligado, marcaModelo);
        this.portaFechada = portaFechada;
    }

    public boolean getPortaFechada() {
        return portaFechada;
    }

    public void setPortaFechada(boolean portaFechada) {
        this.portaFechada = portaFechada;
    }

    public boolean fecharPorta(){
        return portaFechada = false;
    }
    public boolean abrirPorta(){
        return portaFechada = true;
    }

    @Override
    public boolean ligar() {
        if(portaFechada == true){//porta aberta nao liga
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nPorta = " + getPortaFechada();
    }
}
