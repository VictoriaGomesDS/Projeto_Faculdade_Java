public class exercicios_op_ari {
//  TELA 2
  String inicial_ope = """
  
  Operadores Aritméticos

  Você selecionou para ver os exercícios sobre Operadores Aritméticos. Veja a relação dos exercícios abaixo:

  1 - Lendo um número inteiro e o imprimindo.
  2 - Lendo um número real e o imprimindo.
  3 - Digitando e somando numeros.
  4 - Digitando uma letra e retornando um UNICODE.
  5 - Convertendo °C em °F.
  6 - Convertendo velocidade de km/h para m/s. 
  7 - Inserindo um número inteiro e imprimindo o seu antecessor.
  8 - Descobrindo a idade através da data de nascimento.
  9 - Calcula a área de uma circunferência.
  10 - Voltar a tela inicial.
  
  Selecione a opção desejada:  """;

  


  
// TELA 3
  
  String opa_enum_1 = """
  1. Faça um programa que leia um número inteiro e o imprima.
  Você deseja ver a solução? [S/N] """;

  String opa_enum_2 = """
  2. Faça um programa que leia um número real e o imprima.
  Você deseja ver a solução? [S/N] """;

  String opa_enum_3 = """
  3. Peça ao usuário para digitar três valores inteiros e imprima a soma deles.   
  Você deseja ver a solução? [S/N] """;

  String opa_enum_4 = """
  4. Faça um programa em que o usuário digita uma letra e o programa retorna o número inteiro do código UNICODE referente àquela letra.    
  Você deseja ver a solução? [S/N] """;

  String opa_enum_5 = """
  5. Peça ao usuário inserir a temperatura em °C e imprima a temperatura em °F.
  Você deseja ver a solução? [S/N] """;

  String opa_enum_6 = """
  6. Faça para converter a velocidade de km/h para m/s. 
  Você deseja ver a solução? [S/N] """;

  String opa_enum_7 = """
  7. Peça ao usuário inserir um número inteiro e imprima o seu antecessor.
  Você deseja ver a solução? [S/N] """;

  String opa_enum_8 = """
  8. Peça ao usuário inserir seu ano de nascimento e imprima sua idade.
  Você deseja ver a solução? [S/N] """;

  String opa_enum_9 = """
  9. Faça um programa que calcula a área de uma circunferência com precisão de 2 casas decimais.
  Você deseja ver a solução? [S/N] """;


  
// TELA 4
  
  String opa_res_1 = """
  1 - Lendo um número inteiro e o imprimindo.
  
  Faça um programa que leia um número inteiro e o imprima.
  
  public class Ex01 {

    public static void main(String[] args) {
        int numero = 3;
        System.out.println(numero);
    }

  }
  """;

  
  String opa_res_2 = """
  2 - Lendo um número real e o imprimindo.
   
  Faça um programa que leia um número real e o imprima. 
  
  public class Ex02 {
    public static void main(String[] args) {
  
       double primeiroReal = 5.982038;
       float segundoReal = 16.93874039f;
       
        System.out.println(primeiroReal);
        System.out.println(segundoReal);
    }
  }
  """;

  
  String opa_res_3 = """
  3 - Digitando e somando numeros.
  
  Peça ao usuário para digitar três valores inteiros e imprima a soma deles. 
   
  import java.util.Scanner;
  
  public class Ex03 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        
      System.out.print("Digite o primeiro numero: ");
      int primeiro = teclado.nextInt();
        
      System.out.print("Digite o segundo numero: ");
      int segundo = teclado.nextInt();
      System.out.print("Digite o terceiro numero: ");
      int terceiro = teclado.nextInt();
        
      int soma = primeiro + segundo + terceiro;
      System.out.printf("%d + %d + %d = %d \n", primeiro, segundo, terceiro, soma);
        
      teclado.close();
    }
  }
  """;

  
  String opa_res_4 = """
  4 - Digitando uma letra e retornando um UNICODE.
  
  Faça um programa em que o usuário digita uma letra e o programa retorna o número inteiro do código UNICODE referente àquela letra. 
   
  import java.util.Scanner;

  public class Ex04 {
    public static void main(String[] args) {
      
      Scanner teclado = new Scanner(System.in);
      String entrada;
      System.out.print("Digite uma letra: ");
      entrada = teclado.next().trim();

      int numero = (int) entrada.charAt(0);

      System.out.printf("O numero correspondente a %s: %d \n", entrada, numero);

      teclado.close();
    }
  }
  """;

  
  String opa_res_5 = """
  5 - Convertendo °C em °F.
  
  Peça ao usuário inserir a temperatura em °C e imprima a temperatura em °F.
   
  import java.util.Scanner;
  
  public class Ex05 {
    public static void main(String[] args) {
  
      Scanner teclado = new Scanner(System.in);
        
      float tempCelsius;
      float tempFahrenheit;
        
      System.out.print("Insira uma temperatura em graus Celsius: ");
      tempCelsius = teclado.nextFloat();
        
      tempFahrenheit = tempCelsius * 9.0f/5.0f + 32;
        
      System.out.printf("%.2f graus Celsius = %.2f graus Fahrenheit \n", tempCelsius,tempFahrenheit);
        
      teclado.close();
    }
  }
  """;


  String opa_res_6 = """
  6 - Convertendo velocidade de km/h para m/s. 
  
  Faça para converter a velocidade de km/h para m/s.
 
  import java.util.Scanner;

  public class Ex06 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
       
      float velocidadeKm;
      float velocidadeM;
        
      System.out.print("Insira uma velocidade em km/h: ");
      velocidadeKm = teclado.nextFloat();
        
      velocidadeM = velocidadeKm / 3.6f;
        
      System.out.printf("%.2f km/h corresponde a %.2f m/s \n", velocidadeKm, velocidadeM);
        
      teclado.close();
    }
  }
  """;


  String opa_res_7 = """
  7 - Inserindo um número inteiro e imprimindo o seu antecessor.
  
  Peça ao usuário inserir um número inteiro e imprima o seu antecessor.
 
  import java.util.Scanner;

  public class Ex07 {
    public static void main(String[] args) {
          
      Scanner teclado = new Scanner(System.in);
      int numero;       
        
      System.out.print("Insira um numero inteiro: ");
      numero = teclado.nextInt();
        
      System.out.printf("%d eh antecessor de %d \n",numero-1, numero);
        
      teclado.close();
        
    }

  }
  """;


  String opa_res_8 = """
  8 - Descobrindo a idade através da data de nascimento.
  
  Peça ao usuário inserir seu ano de nascimento e imprima sua idade.
 
  import java.util.Scanner;

  public class Ex08 {
    public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      int anoNascimento;
        
      System.out.print("Insira seu ano de nascimento: ");
      anoNascimento = teclado.nextInt();
        
      int idade = 2022 - anoNascimento;
      System.out.printf("Voce tem %d anos\n", idade);
        
      teclado.close();
    }
    
  }
  """;


  String opa_res_9 = """
  9 - Calcula a área de uma circunferência.
  
  Faça um programa que calcula a área de uma circunferência com precisão de 2 casas decimais.

  import java.util.Scanner;

  public class Ex09 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      float raio;
      final double PI = Math.PI;
            
      System.out.print("Entre com um raio: ");
      raio = teclado.nextFloat();
            
      float area = (float) (PI * Math.pow(raio, 2));
      System.out.printf("The area is %.2f \n", area);
            
      teclado.close();
    }

  }
  """;



  
  
}

