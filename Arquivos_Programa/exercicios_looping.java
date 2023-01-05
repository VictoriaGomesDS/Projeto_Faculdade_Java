public class exercicios_looping {
//  CONTINUAÇÃO PARTE DE CONDICIONAIS E LOGICOS

  
  // TELA 3 - LOOPING
  
  String loop_enum_9 = """
  
  9. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

  Você deseja ver a solução? [S/N] 
  
  """;


  String loop_enum_10 = """
  
  10. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_11 = """
  
  11. Faça um programa que leia e valide as seguintes informações:
    a. Nome: maior que 3 caracteres;
    b. Idade: entre 0 e 150;
    c. Salário: maior que zero;
    d. Sexo: 'f' ou 'm';
    e. Estado Civil: 's', 'c', 'v', 'd';
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_12 = """
  
  12. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_13 = """
  
  13. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_14 = """
  
  14. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
  
  Você deseja ver a solução? [S/N] 
  
  """;
  
  String loop_enum_15 = """
  
  15. Faça um programa que leia 5 números e informe o maior número.
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_16 = """
  
  16. Faça um programa que leia 5 números e informe a soma e a média dos números.
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_17 = """
  
  17. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_18 = """
  
  18. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String loop_enum_19 = """
  
  19. Altere o programa anterior para mostrar no final a soma dos números.
  
  Você deseja ver a solução? [S/N] 
  
  """;


  
// TELA 4 - RESOLUÇÃO LOOPING
  
  String loop_res_9 = """
  
  9 - Valores válidos entre 0 e 10.
  
  Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
  
      String nota = "0"; 
      int contador = 0; 
  
      Scanner N = new Scanner(System.in); 
     
      while(contador < 1){ 
  
        System.out.println("Digite uma nota entre 0 e 10:"); 
        nota = N.next(); 
        
        if(nota.equals("0")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("1")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("2")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("3")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("4")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("5")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("6")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("7")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("8")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("9")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else if(nota.equals("10")){ 
          System.out.println("Valor valido!"); 
          contador = 1; 
  
        }else{ 
          System.out.println("Valor invalido!"); 
          contador = 0; 
        } 
      } 
  
    } 
  } 
  
  """;

  String loop_res_10 = """
  
  10 - Usuário e senha.
  
  Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
  
  import java.util.Scanner;
  
  class Main { 
    public static void main(String[] args) { 
  
      String nome = ""; 
      String senha = ""; 
      int contador = 0; 
  
      Scanner input = new Scanner(System.in); 
  
      while(contador<1){ 
  
        System.out.println("Digite seu nome: "); 
        nome = input.next(); 
  
        System.out.println("Digite sua senha: "); 
        senha = input.next(); 
  
        boolean validacao = nome.equals(senha); 
  
        if (validacao == true){ 
        System.out.println("Nome e senha iguais!"); 
        contador = 0; 
  
        }else { 
        System.out.println("Nome e senha diferentes!"); 
        contador = 1; 
      } 
  
    } 
  } 
   
  """;

  
  String loop_res_11 = """
  
  11 - Validando informações.
  
  Faça um programa que leia e valide as seguintes informações:
    a. Nome: maior que 3 caracteres;
    b. Idade: entre 0 e 150;
    c. Salário: maior que zero;
    d. Sexo: 'f' ou 'm';
    e. Estado Civil: 's', 'c', 'v', 'd';

  
  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
  
      String nome = " "; 
      int idade = 0; 
      float salario = 0; 
      String sexo = " "; 
      String e_civil = " "; 
      int contador = 0; 
      
      Scanner input = new Scanner(System.in); 
  
      while(contador < 1){ 
  
        System.out.println("Digite seu nome: "); 
        nome = input.next(); 
  
        System.out.println("Digite sua idade: "); 
        idade = input.nextInt(); 
  
        System.out.println("Digite seu salario: "); 
        salario = input.nextFloat(); 
  
        System.out.println("Digite seu sexo (m/f): "); 
        sexo = input.next(); 
  
        System.out.println("Digite seu estado civíl (s/c/v/d): "); 
        e_civil = input.next(); 
  
        boolean sexo_m = sexo.equals("m"); 
        boolean sexo_f = sexo.equals("f"); 
        boolean civil_s = e_civil.equals("s"); 
        boolean civil_c = e_civil.equals("c"); 
        boolean civil_v = e_civil.equals("v"); 
        boolean civil_d = e_civil.equals("d"); 
  
        if(nome.length() < 3){ 
          System.out.println("Nome invalido!"); 
          contador = 0; 
        }else{ 
          System.out.println("Nome valido!"); 
          contador = 1; 
        } 
  
        if(idade > 150 | idade < 0){ 
          System.out.println("Idade invalida!"); 
          contador =0; 
        }else{ 
          System.out.println("Idade valida!"); 
            if(contador == 0){
              contador = 0;
            }else{
              contador = 1;
            } 
        } 
  
        if (sexo_m == true|sexo_f == true){ 
          System.out.println("Sexo valido!"); 
          if(contador == 0){
            contador = 0;
          }else{
            contador = 1;
          } 
        }else{ 
          System.out.println("Sexo invalido!"); 
          contador =0; 
        } 
  
        if (civil_s == true|civil_c==true|civil_v==true|civil_d){ 
          System.out.println("Estado cívil válido!"); 
          if(contador == 0){
            contador = 0;
          }else{
            contador = 1;
          } 
        }else{ 
          System.out.println("Estado cívil invalido!"); 
          contador =0; 
        } 
      } 
  
    } 
  } 
  
  """;
  
  String loop_res_12 = """
  
  12 - Crescimento populacional.
  
  Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

class Main { 
  public static void main(String[] args) { 
  
    double pais_a = 80000; 
    double pais_b = 200000; 
    double taxa_a = 0.30; 
    double taxa_b = 0.15; 
  
    while (pais_a<200000) { 
      System.out.println("Valor pais A:" + pais_a); 
      System.out.println("Taxa de crescimento pais A:" + taxa_a); 
  
      double crescimento = pais_a * taxa_a; 
      pais_a = pais_a + crescimento; 
  
      System.out.println("Crescimento pais A: " + crescimento); 
      System.out.println("Total de crescimento pais A: " + pais_a + "\n"); 
    } 
  
    System.out.println("Vamor superior ou igual ao total de habitantes do pais B, total pais B: "+pais_b +" Total do pais A: " + pais_a); 
  } 
} 
  
  """;

  
  String loop_res_13 = """
  
  13 - Continuação... Crescimento populacional.
  
  Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
  
      Scanner input = new Scanner(System.in); 
  
      double pais_a = 0; 
      double pais_b = 1; 
      double taxa_a = 0; 
      double taxa_b = 0; 
  
      System.out.println("Digite o número de habitantes do pais A: "); 
      pais_a = input.nextDouble(); 
  
      System.out.println("Digite a taxa de crescimento do pais A: "); 
      taxa_a = input.nextDouble(); 
  
      System.out.println("Digite o número de habitantes do pais B: "); 
      pais_b = input.nextDouble(); 
  
      System.out.println("Digite a taxa de crescimento do pais A: "); 
      taxa_b = input.nextDouble(); 
  
      while (pais_a<pais_b) { 
        System.out.println("Valor pais A:" + pais_a); 
        System.out.println("Taxa de crescimento pais A:" + taxa_a); 
  
        double crescimento = pais_a * taxa_a; 
        pais_a = pais_a + crescimento; 
  
        System.out.println("Crescimento pais A: " + crescimento); 
        System.out.println("Total de crescimento pais A: " + pais_a + "\n"); 
      } 
  
      System.out.println("Vamor superior ou igual ao total de habitantes do pais B, total pais B: " + pais_b + " Total do pais A: + pais_a); 
      
    } 
  }
  
  """;


  String loop_res_14 = """
  
  14 - Imprimindo valores.
  
  Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.

  class Main { 
    public static void main(String[] args) { 
  
      int contador = 1; 
    
      while(contador < 21){ 
        System.out.println(contador); 
        contador = contador + 1; 
      } 
    
      System.out.println("\n 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20"); 
    
    } 
  }
  
  """;  


  String loop_res_15 = """
  
  15 - Informando o maior valor.
  
  Faça um programa que leia 5 números e informe o maior número.

  import java.util.Scanner; 
  import java.util.Arrays; 
  import java.util.List; 
    
  class Main { 
    public static void main(String[] args) { 
  
    int num1 = 0; 
    int num2 = 0; 
    int num3 = 0; 
    int num4 = 0; 
    int num5 = 0; 
  
    Scanner input = new Scanner(System.in); 
    System.out.println("Digite o 1° numero"); 
    num1 = input.nextInt(); 
  
    System.out.println("Digite o 2° numero"); 
    num2 = input.nextInt(); 
  
    System.out.println("Digite o 3° numero"); 
    num3 = input.nextInt(); 
  
    System.out.println("Digite o 4° numero"); 
    num4 = input.nextInt(); 
  
    System.out.println("Digite o 5° numero"); 
    num5 = input.nextInt(); 
  
    List<Integer> arrayList = Arrays.asList(num1, num2, num3, num4, num5); 
  
    int maiorvalor = 0; 
  
    for (Integer numint : arrayList) { 
      if (numint > maiorvalor) 
        maiorvalor = numint; 
      } 
  
      System.out.println("Este é o maior valor "+ maiorvalor); 
    } 
  }
  
  """; 


  String loop_res_16 = """
  
  16 - Média de valores.
  
  Faça um programa que leia 5 números e informe a soma e a média dos números.
  
  import java.util.Scanner; 
  
  class Main { 
    public static void main(String[] args) { 
  
      int num1 = 0; 
      int num2 = 0; 
      int num3 = 0; 
      int num4 = 0; 
      int num5 = 0; 
      
      Scanner input = new Scanner(System.in); 
      System.out.println("Digite o 1° numero"); 
      num1 = input.nextInt(); 
  
      System.out.println("Digite o 2° numero"); 
      num2 = input.nextInt(); 
  
      System.out.println("Digite o 3° numero"); 
      num3 = input.nextInt(); 
  
      System.out.println("Digite o 4° numero"); 
      num4 = input.nextInt(); 
  
      System.out.println("Digite o 5° numero"); 
      num5 = input.nextInt(); 
  
      int soma = num1+num2+num3+num4+num5; 
  
      float media = soma/5; 
  
      System.out.println("A soma dos valores: "+soma); 
      System.out.println("A media dos valores: "+media); 
    } 
  } 

  """;  

  String loop_res_17 = """
  
  17 - Imprimindo números ímpares.
  
  Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

  class Main { 
    public static void main(String[] args) { 
    
      int contador = 0; 
    
      while(contador <= 50){ 
        if(contador % 2 != 0){ 
          System.out.println(contador); 
          contador = contador +1; 
    
        }else{ 
          contador = contador + 1; 
        } 
    
      } 
    
    } 
  }
  
  """;


  String loop_res_18 = """
  
  18 - Calculando intervalo entre dois valores.
  
   Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

  import java.util.Scanner; 
    
  class Main { 
    public static void main(String[] args) { 
    
      int num1 = 0; 
      int num2 = 0; 
      int contador = 0; 
    
      Scanner input = new Scanner(System.in); 
      System.out.println("Digite o primeiro número inteiro: "); 
      num1 = input.nextInt(); 
    
      System.out.println("Digite o segundo número inteiro: "); 
      num2 = input.nextInt(); 
    
      if (num1 > num2){ 
        contador = num2; 
    
        while(contador <= num1){ 
          System.out.println(contador); 
          contador = contador +1; 
        } 
    
      }else{ 
        contador = num1; 
    
        while(contador <= num2){ 
          System.out.println(contador); 
          contador = contador +1; 
        } 
    
      } 
    
    } 
  }

  """;

  String loop_res_19 = """
  
  19 - Soma de valores.
  
  Altere o programa anterior para mostrar no final a soma dos números.

  import java.util.Scanner; 
    
  class Main { 
    public static void main(String[] args) { 
    
      int num1 = 0; 
      int num2 = 0; 
      int contador = 0; 
      int soma = 0; 
      
      Scanner input = new Scanner(System.in); 
      System.out.println("Digite o primeiro número inteiro: "); 
      Num1 = input.nextInt(); 
    
      System.out.println("Digite o segundo número inteiro: "); 
      num2 = input.nextInt(); 
    
      if (num1 > num2){ 
        contador = num2; 
    
        while(contador <= num1){ 
          System.out.println(contador); 
          contador = contador +1; 
          soma = soma + contador; 
        } 
    
      }else{ 
        contador = num1; 
  
        while(contador <= num2){ 
          System.out.println(contador); 
          contador = contador +1; 
          soma = soma + contador; 
        } 
    
      System.out.println("A soma dos números é: "+soma); 
      } 
    
    } 
  }
  
  """;
  
  
}