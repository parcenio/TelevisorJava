
package br.com.pauloarcenio.assistir;


public class Televisao extends Dispositivo {
    
    public Televisao(){
        //vazio
    }
    public Televisao(boolean ligar) {
        super(ligar);
    }

    @Override
    public String toString() {
        return "Televisão{" + "ligar=" + super.isLigar() + ", canal=" + super.getCanal() + ", volume=" + super.getVolume() + '}';
    }

    
}
