/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculo;

/**
 *
 * @author andre
 */
public class Aereo extends Veiculo {
    private String altitude;

    public Aereo(String altitude, String fabricante, String nome, int velocidade) {
        super(fabricante, nome, velocidade);
        this.altitude = altitude;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Aereo{" +' '+ super.toString()+ "altitude(em pés)=" + altitude ;
    }
    
}
