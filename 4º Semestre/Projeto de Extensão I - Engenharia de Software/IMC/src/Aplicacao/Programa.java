package Aplicacao;

import java.util.Scanner;

import imc.HistoricoIMC;
import imc.IMCService;
import imc.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE IMC ===");

        try {
            System.out.print("Digite o peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Digite a altura (m): ");
            double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(peso, altura);

            double imc = IMCService.calcularIMC(pessoa);
            String classificacao = IMCService.classificarIMC(imc);

            System.out.printf("IMC calculado: %.2f%n", imc);
            System.out.println("Classificação: " + classificacao);

            HistoricoIMC.salvar(peso, altura, imc, classificacao);

            System.out.println("Resultado salvo no arquivo historico_imc.txt");

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida.");
        } finally {
            sc.close();
        }
    }
}