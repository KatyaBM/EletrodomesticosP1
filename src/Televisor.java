import java.util.ArrayList;
import java.util.Arrays;

public class Televisor extends Eletrodomestico{
    private int canal;
    private int numeroMaxCanais;

    public Televisor(String marcaModelo,int numeroMaxCanais, int canal){
        super(marcaModelo);
        this.canal = canal;
        this.numeroMaxCanais = numeroMaxCanais;
    }

    public int getCanal() {
        return canal;
    }
    public int getNumeroMaxCanais(){
        return numeroMaxCanais;
    }

    public void setCanal(int canal) {
        if(canal <= 0 || canal > numeroMaxCanais)
            throw new IllegalArgumentException("Canal deve ser maior que 0 e" +
                    "menor que o numero maximo de canais");
        this.canal = canal;
    }

    public void setNumeroMaxCanais(int numeroMaxCanais) {
        if(numeroMaxCanais <= 0)
            throw new IllegalArgumentException("Numero maximo de canais deve ser" +
                    "maior que 0");
        this.numeroMaxCanais = numeroMaxCanais;
    }

    public void canalAcima(int canal){
        if(getCanal() == getNumeroMaxCanais())
            this.canal = 1;
        else
            this.canal++;
    }

    public void canalAbaixo(int canal){
        if(getCanal() == 1)
            this.canal = this.numeroMaxCanais;
        else
            this.canal--;
    }

    @Override
    public String toString() {
        return "Televisor" + super.toString() +
                "Numero maximo de canais: " + getNumeroMaxCanais() +
                (getLigado()? "Canal: " + getCanal() : "");
    }
}
