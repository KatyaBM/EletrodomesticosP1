import java.util.ArrayList;
import java.util.Arrays;

public class Televisor extends Eletrodomestico{
    private int canal;
    private int[] numeroMaxCanais;

    public Televisor(boolean ligado, String marcaModelo,int canal){
        super(ligado, marcaModelo);
        this.canal = canal;
        this.numeroMaxCanais = new int [10];
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setNumeroMaxCanais(int[] numeroMaxCanais) {
        this.numeroMaxCanais = numeroMaxCanais;
    }
    public void adicionaNumeroAosCanais(){
        for(int i=0; i<numeroMaxCanais.length;i++){
            numeroMaxCanais[i]=i+1;
        }
    }
    public int canalAcima(int canal){
        adicionaNumeroAosCanais();
        for(int i=0; i<numeroMaxCanais.length;i++) {
            if (numeroMaxCanais[i] == canal){
                return canal = numeroMaxCanais[i + 1];
            }else{
                if(numeroMaxCanais[i] == numeroMaxCanais.length)
                    numeroMaxCanais[i]=1;
            }
        }
        return canal;
    }

    public int canalAbaixo(int canal){
        adicionaNumeroAosCanais();
        for(int i=1; i<numeroMaxCanais.length;i++) {
            if (numeroMaxCanais[i] == canal){
                return canal = numeroMaxCanais[i - 1];
            }else{
                if(numeroMaxCanais[i] == numeroMaxCanais.length)
                    numeroMaxCanais[i]=1;
            }
        }
        return canal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCanal: " + getCanal() +
                "\nNumero Maximo de Canais: " + numeroMaxCanais.length;
    }
}
