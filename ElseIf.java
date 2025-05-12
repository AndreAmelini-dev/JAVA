import java.util.Scanner;

public class ElseIf{
    public static void main(String[] args) {
        int numero = 0;
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Digite o dia que dia e hoje");
        numero = Scanner.nextInt();
        
        if(numero >= 1 && numero <= 15){
            System.out.println("Primeira Quinzena");
        }else if(numero >= 16 && numero <=31){
            System.out.println("Segunda Quinzena");
        }else if (numero >=0 && numero >=32){
            System.out.println("Numero invalido!! Tente novamente");
            
            Scanner.close();
        }
        }
    }
