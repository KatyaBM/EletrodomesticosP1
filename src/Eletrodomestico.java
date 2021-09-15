public class Eletrodomestico {
    private boolean ligado;
    private final String marcaModelo;

    public Eletrodomestico(boolean ligado, String marcaModelo){
        this.ligado = ligado;
        this.marcaModelo = marcaModelo;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public boolean ligar(){
            return true; //ligado
    }
    public boolean desligar(){
        return false;//desligado
    }

    @Override
    public String toString() {
        return  "Ligado = " + getLigado() +
                "\nMarca Modelo = " + getMarcaModelo();
    }
}
