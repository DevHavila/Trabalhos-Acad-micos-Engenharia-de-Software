/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author havil
 */
public class Usuario {
    
    private String nome;
    private String sobrenome;
    private String CPF;
    
    public void Usuario(){
    }
            
    public void Usuario(String nome, String sobrenome, String CPF){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
    
	public String getNome() {
            return nome;
	}

	public void setNome(String nome) {
            this.nome = nome;
	}

	public String getSobrenome() {
            return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
	}

	public String getCPF() {
            return CPF;
	}

	public void setCPF(String CPF) {
            this.CPF = CPF;
	}    
            
        public void nUsuario(){
             System.out.println("Nome: " + nome + "\nSobreno: " + sobrenome + "\nCPF: " + CPF);
        }
}
