
package br.com.pauloarcenio.assistir;

import java.util.*;

public class Controle extends Dispositivo{
    
//    private Dispositivo dispositivo;
//    private final Televisao televisao;
//    private final Receptor receptor;
    private Scanner leia = new Scanner(System.in);
    
    public Controle() {
//        televisao = new Televisao();
//        receptor = new Receptor();
    }
    
    public void ligar(Dispositivo dispositivo,boolean ligar){
        dispositivo.setLigar(ligar);
    }
    
    public void desligar(Dispositivo dispositivo, boolean ligar){
        dispositivo.setLigar(!ligar);
        dispositivo.setVolume((byte)0);
        dispositivo.setCanal((byte)0);
    }
    
    public void mudarVolume(Dispositivo dispositivo, byte volume){
        if(dispositivo.isLigar() == true){
            if (volume >= 0 && volume <= 100){
                dispositivo.setVolume(volume);
            }else System.out.println("Volume invalido. (0~100)");          
        } else System.out.println("Ligar o aparelho!");
    }
    public void mudarCanal(Dispositivo dispositivo, byte canal){
        if(dispositivo.isLigar() == true){
            if (canal >= 0 && canal <= 30){
                dispositivo.setCanal(canal);
            } else System.out.println("Volume invalido. (0~30)"); 
        }else System.out.println("Por favor, ligar o aparelho!");
    }
    
    
    
}
