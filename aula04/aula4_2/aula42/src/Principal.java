import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        //"pulse" é 0 dentro da lista
        ArrayList<String> carros = new ArrayList<>();
        carros.add("Pulse");
        carros.add("Honda Fit");
        carros.add("147");
        carros.add("Opala");
        carros.add("BYD");

        System.out.println(carros);

        carros.remove(2);
        System.out.println(carros);

        carros.remove("BYD");
        System.out.println(carros);

        //acessando uma informação específica:
        System.out.println(carros.get(1));


        //atualizando uma informação
        carros.set(0,"Abarth");
        System.out.println(carros);

        for(String carro : carros){
            System.out.println(carro);
        }

        
    }

}
