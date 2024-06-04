
import java.util.ArrayList;
import java.util.List;

public class NumerosModelo {
    private List<Integer> numeros;

    public NumerosModelo() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public int buscarNumero(int numero) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numero) {
                return i;
            }
        }
        return -1; 
    }
}