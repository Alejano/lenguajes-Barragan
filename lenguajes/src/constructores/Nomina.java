/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Nomina {
    
    String tipo;
    float saldo;
    int Horastra;
    
    
    
    public Nomina(){}
    
     public Nomina(String tipo){
     this.tipo=tipo;
     }
     
     public Nomina(float saldo){
     this.saldo=saldo;
     }
    public Nomina(int Horastra){
        this.Horastra=Horastra;
     }

    
    public Nomina(String tipo, float saldo, int Horastra){
     this.tipo=tipo;
     this.saldo=saldo;
      this.Horastra=Horastra;
     }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getHorastra() {
        return Horastra;
    }

    public void setHorastra(int Horastra) {
        this.Horastra = Horastra;
    }
    
}
