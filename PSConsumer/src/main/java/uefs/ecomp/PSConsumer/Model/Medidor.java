package uefs.ecomp.PSConsumer.Model;

import java.util.Date;

/**
 *
 * @author Robson
 */
public class Medidor {
    private float consumo;
    private Date data;
    private int hora;
    private int minuto;

    public Medidor(float consumo, Date data, int hora, int minuto) {
        this.consumo = consumo;
        this.data = data;
        this.hora = hora;
        this.minuto = minuto;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    
    
}
