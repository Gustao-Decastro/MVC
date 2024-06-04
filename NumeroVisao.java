import java.util.Scanner;

public class NumeroVisao{
    private Scanner scanner;

    public NumeroVisao() {
        scanner = new Scanner(System.in);
    }

    public int lerNumero() {
        System.out.print("Digite um número para buscar: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(int posicao) {
        if (posicao != -1) {
            System.out.println("Número encontrado na posição " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}