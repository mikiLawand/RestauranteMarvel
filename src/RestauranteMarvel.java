import java.util.Scanner;
public class RestauranteMarvel {
     
     /* 
     * TODO:
     * mostrar itens do menu 
     * fazer um pedido 
     * saber o total do pedido 
     * escolher forma de pagamento 
     */

    //declaração de variaveis 
    public static Scanner input = new Scanner(System.in);
    public static int pedido, Quantity=1;
    public static String voltar;
    public static double total = 0, pagar;
    public static String pagamento;
    public static String opcaoPagar;

    //exibição do menu
    public static void menu() {
      System.out.println("Bem-vinde ao Restaurante Marvel!");
      System.out.println("Menu: ");
      System.out.println("1.Shawarma_________________R$25");
      System.out.println("2.Banquete Asgardiano_________________R$100");
      System.out.println("3.Manjar Turco_________________R$5");
      System.out.println("4.Explosão de manga_________________R$15");
      System.out.println("5.Paprikash de Frango_________________R$35");
    }

    //tirando o pedido 
    public static void pedido() {
      System.out.println("Digite o número do prato escolhido: ");
      pedido=input.nextInt();
      switch (pedido) {
        case 1:
         System.out.println("Você escolheu Shawarma"); 
         System.out.println("Digite a quantidade desejada: ");
         Quantity=input.nextInt();
         total=total+(Quantity*25);
         System.out.println("O total do seu pedido é de: R$" + total);
          break;
        case 2:
        System.out.println("Você escolheu Banquete Asgardiano"); 
         System.out.println("Digite a quantidade desejada: ");
         Quantity=input.nextInt();
         total=total+(Quantity*100);
         System.out.println("O total do seu pedido é de: R$" + total);
         break;
        case 3:
        System.out.println("Você escolheu Manjar Turco"); 
         System.out.println("Digite a quantidade desejada: ");
         Quantity=input.nextInt();
         total=total+(Quantity*5);
         System.out.println("O total do seu pedido é de: R$" + total);
         break;
        case 4:
        System.out.println("Você escolheu Explosão de manga"); 
         System.out.println("Digite a quantidade desejada: ");
         Quantity=input.nextInt();
         total=total+(Quantity*15);
         System.out.println("O total do seu pedido é de: R$" + total);
         break;
        case 5:
        System.out.println("Você escolheu Paprokash de Frango"); 
         System.out.println("Digite a quantidade desejada: ");
         Quantity=input.nextInt();
         total=total+(Quantity*35);
         System.out.println("O total do seu pedido é de: R$" + total);
        default:
        System.out.println("A opção escolhida é inválida");
          break;
      }

      }

      //metodo de pagamento 
      public static void MetodoPagamento() {
        System.out.println("Escolha um método de pagamento: ");
        System.out.println("1.Débito");
        System.out.println("2.Crédito");
        opcaoPagar=input.next();
        if (pagamento=="1") {
         System.out.println("Pagamento realizado com sucesso!"); 
        } else {
         System.out.println("Pagamento realizado com sucesso!"); 
        }
      }

      public static void main(String[] args) {
        menu();
        pedido();
        MetodoPagamento();
      }

    }
