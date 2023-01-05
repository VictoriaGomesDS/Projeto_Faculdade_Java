public class exercicios_for {

  String f_enum_20 = """
  
  20. Escrever um programa para mostrar os números de 1 a 50.
  Você deseja ver a solução? [S/N] 
  
  """;

  String f_enum_21 = """
  
  21. Crie um programa que calcule o fatorial de um número. Mas o incremento do FOR deve ser recessivo. 
  Você deseja ver a solução? [S/N] 
  
  """;

  String f_enum_22 = """
  
  22. Fazer um programa para achar todos os numeros pares entre 1 a 100.
  Você deseja ver a solução? [S/N] 
  
  """;

  String f_enum_23 = """
  
  23. Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
  Você deseja ver a solução? [S/N]
  
  """;

  String f_enum_24 = """
  
  24. Leia várias idades e calcule a média entre as idades (Usar uma váriavel por idade). 
  Você deseja ver a solução? [S/N]
  
  """;

  String f_enum_25 = """
  
  25. Ler 10 números e imprimir quantos são pares e quantos são impares.  
  Você deseja ver a solução? [S/N]
  
  """;

  String f_enum_26 = """
  
  26. Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração. O usuário deve conseguir reconhecer que são três contas diferentes. 
  Você deseja ver a solução? [S/N]
  
  """;

  String f_enum_27 = """
  
  27. Neste exercício você deverá projetar um programa que imprime na tela numéros de 1 a 100, mas: 
     A. Sempre que o numéro for divisível por 3, aparece fizz 
     B. Sempre que um numéro for divisível por 5, aparece buzz 
     C. Quando for divisível pelos 2, aparece fizz buzz. 
  Você deseja ver a solução? [S/N]
  
  """; 

  // RESOLUÇÃO
  
  String f_res_20 = """
  
  20 - Escrevendo valores com for.
  
  Escrever um programa para mostrar os números de 1 a 50.
  
  class Main { 
    public static void main(String[] args) { 
  
      int numero; 
      System.out.println("Os números de 1 a 50:"); 
       
      for (numero = 1; numero < 51; numero++){ 
        System.out.println(numero); 
      } 
  
    }
  }
  
  """;

  String f_res_21 = """
  
  21 - Calculando fatorial.
  
  Crie um programa que calcule o fatorial de um número. Mas o incremento do FOR deve ser recessivo.  
    
  class Main { 
    public static void main(String[] args) { 
    
     int numero = 1; 
     int fatorial; 
     
     for (fatorial = 1; fatorial<50; fatorial++){ 
       numero= numero * fatorial; 
       System.out.println(numero); 
     } 

    }
  }
  
  
  """;

  String f_res_22 = """
  
  22 - Numeros pares entre 1 a 100 com for.
  
  Fazer um programa para achar todos os numeros pares entre 1 a 100.
  
  class Main { 
    public static void main(String[] args) { 
    
      int numero; 
    
      for (numero = 2; numero<101; numero+=2){ 
        System.out.println(numero); 
      }

    }
  }  
  
  """;

  String f_res_23 = """
  
  23 - Escrevendo tabuada.
  
  Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.

  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
    
      int inteiro; 
      int multi = 1; 
      int resultado; 
   
      for(int i = 0;;){ 
        System.out.println("Dígite um número de 1 a 10: "); 
        Scanner tc = new Scanner(System.in); 
        inteiro = tc.nextInt(); 
    
        if(inteiro <11 || inteiro <1){ 
          for(multi = 1; multi < 11; multi++){ 
            resultado = inteiro*multi; 
            System.out.println(inteiro + " X " + multi + " = " + resultado); 
          } 
        break; 
        
        } else { 
        System.out.println("Esse número não é válido: "); 
        } 
  
      } 

    }
  }  
  
  """;

  String f_res_24 = """
  
  24 - Calculando média entre idades.

  Leia várias idades e calcule a média entre as idades (Usar uma váriavel por idade). 

  import java.util.Scanner;
  
  class Main { 
    public static void main(String[] args) { 
    
      Scanner tc = new Scanner(System.in); 
 
      int idade1 = 0, idade2 = 0, idade3 = 0, idade4 = 0, idade5 = 0; 
      int media; 
  
      System.out.println("Digíte várias idades para calcular a média: "); 
      idade1 = tc.nextInt(); 
  
      for(int i = 0;;){ 
        System.out.println("Digíte outra idade: "); 
        
        if(idade2 == 0){ 
          idade2 = tc.nextInt(); 
        } else if(idade3 ==0){ 
          idade3 = tc.nextInt(); 
        } else if(idade4 ==0){ 
          idade4 = tc.nextInt(); 
        } else { 
          idade5 = tc.nextInt(); 
          break; 
        } 
        
        media = idade1 + idade2 + idade3 + idade4 + idade5 / 5; 
        System.out.println("A média entre as idades é de " + media); 
      } 

    }
  }
  
  """;

  String f_res_25 = """
  
  25 - Lendo e imprimindo quantos são pares e quantos são impares. 
  
  Ler 10 números e imprimir quantos são pares e quantos são impares. 

  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
    
    int num, contPar = 0, contImpar = 0; 
 
       for(int i = 1; i <= 10; i++){ 
         System.out.println("Digite o " + i + "º número"); 
         num = ent.nextInt(); 
         
         if(num % 2 == 0){ 
           contPar++; 
         } 
         
         if(num % 2 == 1){ 
           contImpar++; 
         } 
         
       } 
       
       System.out.println("Foram digitados " + contPar + " números pares \n"); 
       System.out.println("E " + contImpar + " números ímpares"); 

    }
  }  
  
  """;

  String f_res_26 = """
  
  26 - Fazendo contas de subtração.
  
  Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração. O usuário deve conseguir reconhecer que são três contas diferentes. 

  import java.util.Scanner;
  
  class Main { 
    public static void main(String[] args) { 
    
      Scanner entrada = new Scanner(System.in); 
  
      int num1, num2, result; 
  
      for(int i = 0; i < 3; i++){ 
        System.out.println("*****************************************"); 
  
        System.out.println("Digíte dois números para serem subtraídos. "); 
        num1 = entrada.nextInt(); 
  
        System.out.println("Digíte outro número. "); 
        num2 = entrada.nextInt(); 
  
        result = num1 - num2; 
  
        System.out.println(num1 + " - " + num2 + " = " + result); 
  
        System.out.println(" "); 
        
      } 

    }
  }  
  
  
  
  """;

  String f_res_27 = """
  
  27 - Fizz e Buzz.
  
  Neste exercício você deverá projetar um programa que imprime na tela numéros de 1 a 100, mas: 
     A. Sempre que o numéro for divisível por 3, aparece fizz 
     B. Sempre que um numéro for divisível por 5, aparece buzz 
     C. Quando for divisível pelos 2, aparece fizz buzz.

  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
  
    Scanner entrada = new Scanner(System.in); 
    
    for(int i = 0; i < 101; i++){ 
      if(i % 15 == 0){ 
        System.out.println(i + " fizz buzz "); 
    
      } else if(i % 3 == 0){ 
        System.out.println(i + " fizz. "); 
     
      } else if(i % 5 == 0){ 
        System.out.println(i + " buzz "); 
    
      } else { 
        System.out.println(i); 
      } 
    
  
    } 
  }
  
  """;
  
}