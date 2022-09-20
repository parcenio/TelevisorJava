
package br.com.pauloarcenio.assistir;

public class Dispositivo {
    private boolean ligar;
    private byte canal, volume;

    public Dispositivo(boolean ligar){
        this.ligar = ligar;
    }
    
    public Dispositivo(){
        //vazio
    }
    
    public Dispositivo(boolean ligar, byte canal, byte volume) {
        this.ligar = ligar;
        this.canal = canal;
        this.volume = volume;
    }
    
    public void mudarCanal(byte canal){
        if (ligar){
            if(canal >= 0 && canal <= 100){
                this.canal = canal;
            } 
        }String.format("Por favor ligue o aparelho.");
    }

    public void mudarVolume(byte volume){
        if (ligar){
            if(volume >= 0 && volume <= 100){
                this.volume = volume;
            } 
        }String.format("Por favor ligue o aparelho.");
    }
    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public void setCanal(byte canal) {
        this.canal = canal;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }

    public boolean isLigar() {
        return ligar;
    }

    public byte getCanal() {
        return canal;
    }

    public byte getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "ligar=" + ligar + ", canal=" + canal + ", volume=" + volume + '}';
    }
    
    
}
