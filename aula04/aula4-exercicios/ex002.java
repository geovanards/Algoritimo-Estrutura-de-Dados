//Crie um ArrayList e retorne o número de elementos
// únicos na lista.

import java.util.ArrayList;
import java.util.HashSet;

public class ex002 {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(3);

        System.out.println(num);

        //para que apareça valores unicos se repetição
        //necessita que o]do hash que impede de imprimir valores repetidos

        System.out.println(new HashSet<>(num).size());
    }
}
