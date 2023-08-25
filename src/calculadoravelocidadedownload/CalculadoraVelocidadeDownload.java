package calculadoravelocidadedownload;

import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a distância para o servidor (em Km):");
            double distanciaServidor = scanner.nextDouble();
            System.out.println("Digite a velocidade da sua internet (em Mbps):");
            double velocidadePlano = scanner.nextDouble();            

            double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidor, velocidadePlano);            

            System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");
        }
        
    }    

    public static double calcularVelocidadeDownload(double distanciaServidor, double velocidadePlano) {
        return (velocidadePlano / (1 + (distanciaServidor/100)));
    }
}
