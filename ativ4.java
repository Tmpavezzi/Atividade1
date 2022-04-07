import java.util.Scanner;




class Main {
  public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
    int a = entrada.nextInt();
    int b = entrada.nextInt();
    int c = entrada.nextInt();
    int d = entrada.nextInt();

    if ((b>c) && (d>a) &&(c +d>0)&&(a+b>0) && (a%2==0)  ){
      System.out.print("Valores aceito");
    }else {
     System.out.print("Valores não aceitos");
    }

    
    }
  }
