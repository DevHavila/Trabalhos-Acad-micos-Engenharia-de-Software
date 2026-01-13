/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Locale;
import java.util.Scanner;

import entities.Usuario;
import entities.Consultar;
public class GerenciaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char resp = 'n';
        Consultar Saldo = new Consultar();
        Saldo.setDeposito(500.00);
        
        while (resp != 's'){
            System.out.println("Benvido ao Banco\n");
            Usuario banco = new Usuario();
            banco.Usuario("Allan", "Silva", "123.789.546.36");
            
            banco.nUsuario();
            System.out.println("Saldo em Conta: " + Saldo.getConsultar());
            
            System.out.println("\nDeseja Depositar s/n");
            resp = sc.next().charAt(0);
            
            if(resp == 's'){
                System.out.print("Valor a ser Depositado: ");
                Saldo.setDeposito(sc.nextDouble());
                System.out.print(Saldo.getConsultar());
            }
            
            System.out.println("\nDeseja Sacar s/n");
            resp = sc.next().charAt(0);
            
            if(resp == 's'){
                System.out.print("Valor a ser Sacado: ");
                Saldo.setSaque(sc.nextDouble());
                System.out.print(Saldo.getConsultar());
            }
            
            System.out.println("\nDeseja Encerrar s/n");
            resp = sc.next().charAt(0);
        }
        System.out.println("\nFim do Programa");
    }
    
}
