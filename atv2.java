import java.util.Scanner;




class Main {
  public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
       System.out.print("Digite um numero :");
    int n1 = entrada.nextInt();
    System.out.print("Digite um numero :");
    int n2 = entrada.nextInt();
    System.out.print("Digite um numero :");
    int n3 = entrada.nextInt();
     if (n1>n2 && n1>n3){
       System.out.print(n1);
     } else if (n2>n1 && n2>n3){
       System.out.print(n2);
     }else if (n3>n1 && n3>n2){
       System.out.print(n3);
     }
    
        
        
    }
    

  }
