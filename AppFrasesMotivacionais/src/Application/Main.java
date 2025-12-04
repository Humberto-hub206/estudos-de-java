package Application;

import Model.Frase;
import Service.FraseService;

public class Main {

    public static void main(String[] args) {
        FraseService service = new FraseService();
        Frase frase = service.obterFraseAleatoria();
        
        if (frase != null){
            System.out.println("\nSua frase motivacional de hoje:\n");
            System.out.println(frase);
        } else {
            System.out.println("Não foi possível carregar a frase. Tente novamente mais tarde.");
        }
    }
}
