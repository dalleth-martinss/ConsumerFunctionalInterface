import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        /**
         * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
         * É utilizado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar,
         * ou retornar um valor.
         */



        // criar uma lista de numeros interos
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if( numero % 2 == 0){
                System.out.println(numero);
            }
        };
    // Usar o consumer para imprimir nuemros pares no Stream
         numeros.stream().forEach(imprimirNumeroPar);
    }
}