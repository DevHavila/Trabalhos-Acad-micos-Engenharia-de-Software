/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author havil
 */
public class Consultar {
    
    private double saldo;
    
    public Consultar(){
    }
    
    public void setDeposito(Double saldo){
        this.saldo += saldo;
    }
    
    public void setSaque(Double saldo){
        this.saldo -= saldo;
    }    
    
    public  double getConsultar(){
        return saldo;
    }
}
