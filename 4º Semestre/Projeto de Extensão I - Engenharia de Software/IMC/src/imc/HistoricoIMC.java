package imc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HistoricoIMC {
	
	private static final String ARQUIVO = "historico_imc.txt";

    public static void salvar(double peso, double altura, double imc, String classificacao) {
        try (FileWriter fw = new FileWriter(ARQUIVO, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("Peso: " + peso + " kg");
            pw.println("Altura: " + altura + " m");
            pw.printf("IMC: %.2f%n", imc);
            pw.println("Classificação: " + classificacao);
            pw.println("------------------------------");

        } catch (IOException e) {
            System.out.println("Erro ao salvar histórico: " + e.getMessage());
        }
    }
}