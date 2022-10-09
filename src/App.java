
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double F;
        
        System.out.println("Digite a temperatura em Fahrenheit");
        F = entrada.nextDouble();
        
        double C;
        
        C = 5 * ((F-32) / 9);
        
        System.out.println("A temperatura em graus Celsius é de:" + C);

        entrada.close();        
        


    }
}
