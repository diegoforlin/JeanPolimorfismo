import java.util.Scanner;

public abstract class Computador {
    private final double acessorios;
    private int gbMemoria;
    private static int numProcessadores;

    public Computador(int gbMemoria, int numProcessadores, double acessorios) {
        this.gbMemoria = gbMemoria;
        Computador.numProcessadores = numProcessadores;
        this.acessorios = acessorios;
    }

    public int getGbMemoria() {
        return gbMemoria;
    }

    public void setGbMemoria(int gbMemoria) {
        this.gbMemoria = gbMemoria;
    }

    public int getNumProcessadores() {
        return numProcessadores;
    }

    public void setNumProcessadores(int numProcessadores) {
        Computador.numProcessadores = numProcessadores;
    }

    public double getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(double acessorios) {
        // Não é possível alterar o valor de acessórios, pois é final
        System.out.println("O valor de acessórios não pode ser alterado.");
    }

    public abstract double calculaValor();

    public static class Desktop extends Computador {
        public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
            super(gbMemoria, numProcessadores, acessorios);
        }

        @Override
        public double calculaValor() {
            return getGbMemoria() * 200 + getNumProcessadores() * 400 + getAcessorios();
        }
    }
}
