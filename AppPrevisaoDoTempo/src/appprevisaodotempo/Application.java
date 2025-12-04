package appprevisaodotempo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        
        System.out.println("===  Aplicativo de Previsao do Tempo ===");
        System.out.print("Digite o nome da cidade: ");
        String cidade = sc.nextLine();
        
        ClimaDados dados = service.getClima(cidade);
        if (dados != null) {
            System.out.println(dados);
        } else {
            System.out.println("nao foi possivel encontrar a cidade");
        }
        
        sc.close();
    }
    
}
