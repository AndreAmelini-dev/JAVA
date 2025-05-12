import java.util.Scanner;

public class Fo1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num2= 0;

        System.out.println("Digite o numero que deseja");
        num2 = Scanner.nextInt();

        for(int r = 1; r <= num2; r++){
            System.out.println("O resultado desejado e:" + r*2);

            Scanner.close();
        }
    }
}
