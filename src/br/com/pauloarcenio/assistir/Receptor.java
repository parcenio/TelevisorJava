
package br.com.pauloarcenio.assistir;


public class Receptor extends Dispositivo {

    public Receptor(){
        //vazio
    }
    public Receptor(boolean ligar) {
        super(ligar);
    }
    
    @Override
    public String toString() {
        return "Receptor{" + "ligar=" + super.isLigar() + ", canal=" + super.getCanal() + ", volume=" + super.getVolume() + '}';
    }
}
