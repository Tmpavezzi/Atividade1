import java.util.Scanner;




class Main {
  public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
       System.out.print("Digite um numero :");
    int n1 = entrada.nextInt();
    System.out.print("Digite um numero :");
    int n2 = entrada.nextInt();
    
   if (n1>n2){
     System.out.print(n1/n2);
   }else{
     System.out.print (n2/n1);
   }
    
        
        
    }
    

  }
