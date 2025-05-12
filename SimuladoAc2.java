import java.util.Scanner;

public class SimuladoAc2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       int qtd = 0;
       String R;
     do{
      System.out.println("Digite a quantidade de produtos armazenadas em estoque:");
       qtd = scanner.nextInt();
        System.out.println("Quantidade Minima de produtos que deve ter em estoque:");
        int QuantidadeMinima = scanner.nextInt();
       double[] QtdProdutos = new double[qtd];
       String[] NomeProdutos = new String[qtd];
        for(int p = 0; p < NomeProdutos.length; p++){
            System.out.println("Digite o nome do produto");
            NomeProdutos[p] = scanner.next();
            System.out.println("Quantos produtos tem em estoque");
            QtdProdutos[p] = scanner.nextDouble();
        } 
        for(int p = 0; p < QtdProdutos.length; p++){
            if( QtdProdutos[p] < QuantidadeMinima){
                System.out.println("Quantidade:Adequada");
            }else{
                System.out.println("Quantidade:Baixa");
            }
        System.out.println("Os produtos do estoque e sas respectivas quantidades sao" +  NomeProdutos[p] +  
        "sua quantidade e - "  +  QtdProdutos[p]);
        System.out.println("========//========");
        }
            System.out.println("Deseja realizar um novo controle de estoque? (s/n)");
            R = scanner.next();
        } while (R.equalsIgnoreCase("s"));

       
    }
}
/*professor a identação do código está correta ?? */