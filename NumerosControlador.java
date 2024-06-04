
public class NumerosControlador {
    private NumerosModelo modelo;
    private NumerosVisao visao;

    public NumerosControlador(NumerosModelo modelo, NumerosVisao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void adicionarNumero(int numero) {
        modelo.adicionarNumero(numero);
    }

    public void buscarNumero(int numero) {
        int posicao = modelo.buscarNumero(numero);
        visao.mostrarResultado(posicao);
    }
}