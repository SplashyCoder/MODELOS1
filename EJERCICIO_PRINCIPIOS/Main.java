import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner entradaEscaner;
    String entradaTeclado = "";

    double numeroA = 0.0;
    double numeroB = 0.0;
    boolean bandera = true;

    Suma suma;
    Resta resta;
    Multiplicacion multiplicacion;
    Division division;
    Exponenciacion exponenciacion;

    System.out.print("¡Bienvenido este programa lo ayudara a calcular diferentes operaciones de dos cifras!\n");

    while (bandera){
      
      entradaEscaner = new Scanner (System.in);
      
      System.out.print("\nPor favor escoja la opcion que necesite \n\n 1) Suma\n 2) Resta \n 3) Multplicacion \n 4) Division \n 5) Exponenciacion \n 6) Salir \n");
      System.out.print("\nSelección: ");
      entradaTeclado = entradaEscaner.nextLine(); 

      switch(entradaTeclado){
        case "1": {

          suma = new Suma();
          
          System.out.print("\n¡Seleccionó la suma!\n");
          System.out.print("\nRecuerde que la suma es A + B");
          System.out.print("\nPor favor ingrese:\n");
          System.out.print("\nNúmero A = ");
          numeroA = entradaEscaner.nextDouble();
          System.out.print("\nNúmero B = ");
          numeroB = entradaEscaner.nextDouble();   

          suma.setNumeroA(numeroA);
          suma.setNumeroB(numeroB);
          
          System.out.print ("\n\nLa suma sería: " + numeroA+ " + "+numeroB+" = "+suma.sumar()+"\n\n");   
        
          break;
        }
        case "2": {
          resta = new Resta();
          

          System.out.print("\n¡Seleccionó la resta!\n");
          System.out.print("\nRecuerde que la resta es A - B");
          System.out.print("\nPor favor ingrese:\n");
          System.out.print("\nNúmero A = ");
          numeroA = entradaEscaner.nextDouble();
          System.out.print("\nNúmero B = ");
          numeroB = entradaEscaner.nextDouble();

          resta.setNumeroA(numeroA);
          resta.setNumeroB(numeroB);

          System.out.print ("\n\nLa resta sería: " + numeroA+ " - "+numeroB+" = "+resta.sumar()+"\n\n");
          break;
        }
        case "3": {
          multiplicacion = new Multiplicacion();

          System.out.print("\n¡Seleccionó la mtiplicacion!\n");
          System.out.print("\nRecuerde que la multiplicacion es A * B");
          System.out.print("\nPor favor ingrese:\n");
          System.out.print("\nNúmero A = ");
          numeroA = entradaEscaner.nextDouble();
          System.out.print("\nNúmero B = ");
          numeroB = entradaEscaner.nextDouble();  

          multiplicacion.setNumeroA(numeroA);
          multiplicacion.setNumeroB(numeroB);

          System.out.print ("\n\nLa multiplicación sería: " + numeroA + " X "+numeroB+" = "+multiplicacion.multiplicar()+"\n\n");  
          break;
        }
        case "4": {
          division = new Division();

          System.out.print("\n¡Seleccionó la division!");
          System.out.print("\nRecuerde que la divisiones A / B");
          System.out.print("\nPor favor ingrese:\n");
          System.out.print("\nNúmero A = ");
          numeroA = entradaEscaner.nextDouble();
          System.out.print("\nNúmero B = ");
          numeroB = entradaEscaner.nextDouble();  

          division.setNumeroA(numeroA);
          division.setNumeroB(numeroB);

          System.out.print ("\n\nLa division sería: " + numeroA + " / "+numeroB+" = "+division.dividir()+"\n\n"); 
          break;
        }
        case "5": {
          exponenciacion = new Exponenciacion();


          System.out.print("\n¡Seleccionó la exponenciacion!");
          System.out.print("\nRecuerde que la exponención es A ^ B");
          System.out.print("\nPor favor ingrese:\n");
          System.out.print("\nNúmero A = ");
          numeroA = entradaEscaner.nextDouble();
          System.out.print("\nNúmero B = ");
          numeroB = entradaEscaner.nextDouble();  
          
          exponenciacion.setNumeroA(numeroA);
          exponenciacion.setNumeroB(numeroB);

          System.out.print ("\n\nLa exponenciacion sería: " + numeroA + " X "+numeroB+" = "+exponenciacion.exponenciar()+"\n\n"); 

          break;
        }
        case "6": {
          
          System.out.print("\n\nGracias por usar la cálculadora");
          bandera = false;

          break;
        }
        default: {
          
          System.out.print("Opcion no valida \n");
          System.out.print("."+entradaTeclado+".");
          bandera = true;
        }
      }
      
      
      
    }
    

   
  }
}