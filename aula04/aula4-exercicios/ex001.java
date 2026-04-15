//Crie um ArrayList e adicione alguns elementos a ele. Em seguida, imprima o tamanho da lista e verifique
//se um elemento específico está presente na lista.

import java.util.ArrayList;

public class ex001 {
    public static void main(String[] args) {
        
        ArrayList<String> jogos = new ArrayList<>();
        jogos.add("League of Legends");
        jogos.add("Hollow Knight");
        jogos.add("Apex Legends");
        jogos.add("Overwatch");

        System.out.println(jogos);
    
        System.out.println((jogos).get(1));
    }
}
