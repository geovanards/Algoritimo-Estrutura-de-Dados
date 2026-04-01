package hashexercicios;

import java.util.HashSet;

//01 Crie um HashSet vazio chamado "mySet".
public class Exercicio {
    public static void main(String[] args) {
        
        //02.Adicione os números 1, 2, 3, 4 e 5 ao HashSet "mySet".
        HashSet<Integer> mySet =  new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        
        //3.Verifique se o HashSet "mySet" contém o número 3.
        mySet.contains(3);
        System.out.println(mySet);
        
        //4.Remova o número 2 do HashSet "mySet".
        mySet.remove(2);
        System.out.println(mySet);
        
        //5.Verifique se o HashSet "mySet" está vazio.
        System.out.println("conjunto vazio?"+mySet.isEmpty());
        
        //6.Crie outro HashSet chamado "otherSet" e adicione os números 4, 5, 6 e 7.
        HashSet<Integer> otherSet = new HashSet<>();
        otherSet.add(4);
        otherSet.add(5);
        otherSet.add(6);
        otherSet.add(7);
        
        //7.Retenha no HashSet "mySet" apenas os elementos presentes em "otherSet".
        mySet.retainAll(otherSet);
        System.out.println(mySet);
        //8.Adicione todos os elementos de "otherSet" ao HashSet "mySet".
        mySet.addAll(otherSet);
        System.out.println(mySet);
        
        //9.Obtenha o tamanho atual do HashSet "mySet".
        System.out.println(mySet.size());
        
        //10.Percorra todos os elementos do HashSet "mySet" e imprima cada um deles.
        for(Integer elemento : mySet){
            System.out.println(elemento);
        }
    }
}
