import java.util.HashMap;

public class atv001 {
    public static void main(String[] args) {
        
        //estrutura que contem chave e valor
        HashMap<Integer,String> alunos = new HashMap<>();
        alunos.put(123456, "Molina");
        alunos.put(155456, "aaaaa");
        alunos.put(453356, "bbbba");

        System.out.println(alunos);
        System.out.println(alunos.get(453356));
        
        //alterando valor
        alunos.put(453356, "gggg");
        System.out.println(alunos);
        
        //removendo um valor
        alunos.remove(123456);
        System.out.println(alunos);

        
    }
}
