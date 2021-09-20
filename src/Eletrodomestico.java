public class Eletrodomestico {
    private boolean ligado;
    private final String marcaModelo;

    public Eletrodomestico(String marcaModelo){
        ligado = false;
        this.marcaModelo = marcaModelo;
    }

    public boolean getLigado() {
        return ligado;
    }// para saber o estado do objeto

     public String getMarcaModelo() {
        return marcaModelo;
    }

    public void ligar(){
            ligado = true; //ligado
    }
    public void desligar(){
            ligado = false;//desligado
    }

    @Override
    public String toString() {
        return  "Ligado = " + getLigado() +
                "\nMarca Modelo = " + getMarcaModelo();
    }
}
