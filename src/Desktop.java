import java.util.Scanner;

public class Desktop extends Computador {
    private double acessorios;

    public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        super(gbMemoria, numProcessadores, acessorios);
        this.acessorios = acessorios;
    }

    @Override
    public double calculaValor() {
        return getGbMemoria() * 200 + getNumProcessadores() * 400 + getAcessorios();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos gbs de memória seu Desktop tem: ");
        int gbMemoria = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite quantos processadores: ");
        int numProcessadores = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite quantos acessórios seu desktop tem: ");
        double acessorios = scanner.nextDouble();

        Desktop desktop = new Desktop(gbMemoria, numProcessadores, acessorios);
        System.out.println("O valor de processamento do seu Desktop é: " + desktop.calculaValor() + " ghz");

        scanner.close();
    }
}
