
package br.com.pauloarcenio.assistir;

public class Assistir3 {

  
    public static void main(String[] args) {
        
        Controle teste = new Controle();
        Televisao televisao = new Televisao();
        Receptor receptor = new Receptor();
        
        teste.ligar(receptor,true);
        teste.ligar(televisao,true);
        teste.mudarCanal(televisao,(byte)10);
        teste.mudarVolume(televisao,(byte)10);
        teste.mudarVolume(receptor,(byte)5);
        teste.mudarCanal(receptor,(byte)24);
        System.out.println(televisao);
        System.out.println(receptor);
        teste.desligar(receptor, true);
        teste.desligar(televisao,true);
        System.out.println(receptor);
        System.out.println(televisao);
    }
    
}
