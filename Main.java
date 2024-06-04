public class Main {
    public static void main(String[] args) {
        NumerosModelo modelo = new NumerosModelo();
        NumerosVisao visao = new NumerosVisao();
        NumerosControlador controlador = new NumerosControlador(modelo, visao);

        
        controlador.adicionarNumero(10);
        controlador.adicionarNumero(20);
        controlador.adicionarNumero(30);
        controlador.adicionarNumero(40);
        controlador.adicionarNumero(50);
        controlador.adicionarNumero(60);
        controlador.adicionarNumero(70);
        controlador.adicionarNumero(80);
        controlador.adicionarNumero(90);
        controlador.adicionarNumero(100);

        
        int numeroBuscado = visao.lerNumero();
        controlador.buscarNumero(numeroBuscado);
    }
}