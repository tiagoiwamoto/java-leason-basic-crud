import java.util.List;
import java.util.Random;

public class Exercicio {

    public static void main(String[] args) {
        List lista = List.of("CAMISETA", "CHINELO", "CHOCOLATE",
                "IOGURTE", "SUCRILHOS", "DANONINHO", "CARNE", "PEITO DE FRANGO",
                "CAFE", "CHA", "LINGUICA", "BOLACHA", "BISCOITO", "MACARRAO", "FEIJAO", "ARROZ");
        System.out.println("CAMISETA...................R$456172008.00");
        System.out.println("............LOJA DA ESQUININHA...........");
        System.out.println("...........TEL:  (11) 9999-9999..........");
        for (int x = 0; x <= lista.size(); x++){
            int valorDoItem = new Random().nextInt(99) & Integer.MAX_VALUE;
            String valorComCifrao = "R$"+valorDoItem+".00";
            if(x < lista.size()){
                System.out.printf(lista.get(x).toString());
                if(lista.get(x).toString().length() < 40){
                    for(int y = 0; y <= 40 - lista.get(x).toString().length() - valorComCifrao.length(); y++){
                        System.out.printf(".");
                    }
                    System.out.printf(valorComCifrao);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("...........TEL:  (11) 9999-9999..........");
        System.out.println("......NFE: 456789643216549687456654......");
        System.out.println("CPF NA NOTA: 123.456.789-77..............");
        System.out.println();
    }

}
