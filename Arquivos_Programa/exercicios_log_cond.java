public class exercicios_log_cond {
  
//  TELA 2
  String inicial_log_cond = """
  
  Operadores Lógicos e Lógica Condicional

  Você selecionou para ver os exercícios sobre Operadores Lógicos e Lógica Condicional. Veja a relação dos exercícios abaixo:

  OPERADORES LOGICOS
  1 - Verdadeiro ou Falso 1.
  2 - Verdadeiro ou Falso 2.
  3 - Verdadeiro ou Falso 3.
  4 - O número é par ou ímpar e se é positivo ou negativo?
  5 - Calculadora de peso ideal.
  6 - Calculando multa. 
  7 - Conferindo a hemoglobina.
  8 - Que tipo de sangue posso receber?

  LOOPING
  9 - Valores válidos entre 0 e 10. 
  10 - Usuário e senha.
  11 - Validando informações.
  12 - Crescimento populacional.
  13 - Continuação... Crescimento populacional.
  14 - Imprimindo valores.
  15 - Informando o maior valor.
  16 - Média de valores.
  17 - Imprimindo números ímpares.
  18 - Calculando intervalo entre dois valores.
  19 - Soma de valores.

  FOR
  20 - Escrevendo valores com for.                   
  21 - Calculando fatorial com for.
  22 - Numeros pares entre 1 a 100 com for.
  23 - Escrevendo tabuada.
  24 - Calculando média entre idades.
  25 - Lendo e imprimindo quantos são pares e quantos são impares. 
  26 - Fazendo contas de subtração.
  27 - Fizz e Buzz.
  
  28 - Voltar a tela inicial.
  
  Selecione a opção desejada:  """;

  
  
// TELA 3 - CONDICIONAL
  
  String log_cond_enum_1 = """
  
  1. Tendo as variáveis salario, ir e salliq, e considerando os valores abaixo, informe se as expressões são verdadeiras ou falsas:
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String log_cond_enum_2 = """
  
  2. Sabendo que a = 3, b = 7 e c = 4, informe se as expressões abaixo são verdadeiras ou falsas:
  
  Você deseja ver a solução? [S/N]
  
  """;

  String log_cond_enum_3 = """
  
  3. Sabendo que a = 5, b = 4, c = 3 e d = 6, informe se as expressões abaixo são verdadeiras ou falsas:   
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String log_cond_enum_4 = """
  
  4. Faça um programa que leia um número inteiro e retorna ao usuário uma mensagem informando se o número é par ou ímpar e se é positivo ou negativo.  
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String log_cond_enum_5 = """
  
  5. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa que calcule seu peso ideal utilizando as seguintes fórmulas:
  a. Homens: Peso Ideal = (72,7 * altura) - 58
  b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String log_cond_enum_6 = """
  
  6. João é pescador e um microcomputador para controlar o seu rendimento diário. 
Toda vez que ele traz um peso de peixe maior do que o estabelecido no regimento de pesca do Estado de SP (50 quilos), ele deve pagar uma multa de R$ 4,00 por quilo excedente. Faça um programa que, quando João informar o peso de peixes que trouxe no dia, o programa retorna o valor da multa. 
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String log_cond_enum_7 = """
  
  7. Faça um programa de resultado de exames em que o usuário digitará Nome, idade, sexo e quantidade de hemoglobina em g/gL. O programa deverá, com base na tabela abaixo, informar se o resultado está normal ou se há alguma alteração.
  Crianças de 2 a 6 anos -> 11,5 a 13,5 g/dL
  Crianças de 6 a 12 anos -> 11,5 a 15,5 g/dL
  Homens -> 14 a 18 g/dL
  Mulheres -> 12 a 16 g/dL
  Grávidas -> 11 g/dL
  
  Você deseja ver a solução? [S/N] 
  
  """;

  String log_cond_enum_8 = """
  
  8. Faça um programa para um banco de sangue em que o usuário informará qual o tipo sanguíneo de um paciente e o programa retornará que tipo de sangue este paciente pode receber.

  Sangue tipo: A+.
  Pode doar para: AB+ e A+.
  Pode receber doação de: A+, A-, O+ e O-.
  
  Sangue tipo: A-.
  Pode doar para: A+, A-, AB+ e AB-.
  Pode receber doação de: A- e O-.
  
  Sangue tipo: B+.
  Pode doar para: B+ e AB+.
  Pode receber doação de: B+, B-, O+ e O-.
  
  Sangue tipo: B-.
  Pode doar para: B+, B-, AB+ e AB-.
  Pode receber doação de: B- e O-.
  
  Sangue tipo: AB+.
  Pode doar para: AB+.
  Pode receber doação de: Todos.
  
  Sangue tipo: AB-.
  Pode doar para: AB+ e AB-.
  Pode receber doação de: A-, B-, O- e AB-.
  
  Sangue tipo: O+.
  Pode doar para: A+, B+, O+ e AB+.
  Pode receber doação de: O+ e O-.
  
  Sangue tipo: O-.
  Pode doar para: Todos.
  Pode receber doação de: O-.
  
  Você deseja ver a solução? [S/N] 
  
  """; 
  
// TELA 4
  
  String log_cond_res_1 = """
  
  1 - Verdadeiro ou Falso 1.
  
  Tendo as variáveis salario, ir e salliq, e considerando os valores abaixo, informe se as expressões são verdadeiras ou falsas:

  class Main {
    public static void main(String[] args) {
  
      int salario1 = 100;
      int salario2 = 200;
      int salario3 = 300;
  
      int ir1 = 0;
      int ir2 = 10;
      int ir3 = 15;
  
      int salliq1 = 100;
      int salliq2 = 190;
      int salliq3 = 285;
  
      // expressão 1
      if (salliq1 >= 100){
        System.out.println("Expressão 1: True");
      } else {
        System.out.println("Expressão 1: False");
      }
  
      // expressão 2
      if (salliq2 < 190){
        System.out.println("Expressão 2: True");
      } else {
        System.out.println("Expressão 2: False");
      }
  
      // expressão 3
      if (salliq3 == salario3 + ir3){
        System.out.println("Expressão 3: True");
      } else {
        System.out.println("Expressão 3: False");
      }
      
    }
  }
  
  """;

  
  String log_cond_res_2 = """
  
  2 - Verdadeiro ou Falso 2.
   
  Sabendo que a = 3, b = 7 e c = 4, informe se as expressões abaixo são verdadeiras ou falsas:

  class Main {
    public static void main(String[] args) {
  
      int a = 3;
      int b = 7;
      int c = 4;
  
      // expressão 1
      int aux1 = a + c;
      if (aux1 > b){
        System.out.println("Expressão 1: True");
      } else {
        System.out.println("Expressão 1: False");
      }
  
      // expressão 2
      int aux2 = a + 2;
      if (b >= aux2){
        System.out.println("Expressão 2: True");
      } else {
        System.out.println("Expressão 2: False");
      }
  
      // expressão 3
      int aux3 = b - a;
      if (c == aux3){
        System.out.println("Expressão 3: True");
      } else {
        System.out.println("Expressão 3: False");
      }
  
      // expressão 4
      int aux4 = b + a; 
      if (aux4 <= c){
        System.out.println("Expressão 4: True");
      } else {
        System.out.println("Expressão 4: False");
      }
  
      // expressão 5
      int aux5 = c + a;
      if (aux5 > b){
        System.out.println("Expressão 5: True");
      } else {
        System.out.println("Expressão 5: False");
      }
      
    }
  }
  
  """;

  
  String log_cond_res_3 = """
  
  3 - Verdadeiro ou Falso 3.
  
  Sabendo que a = 5, b = 4, c = 3 e d = 6, informe se as expressões abaixo são verdadeiras ou falsas:

  class Main {
    public static void main(String[] args) {
  
      int a = 5;
      int b = 4;
      int c = 3;
      int d = 6;
  
      // expressão 1
      if (a > c && c <= d){
        System.out.println("Expressão 1: True");
      } else {
        System.out.println("Expressão 1: False");
      }
  
      // expressão 2
      if ((a + b) > 10 || (a + b) == (c + +d)){
        System.out.println("Expressão 2: True");
      } else {
        System.out.println("Expressão 2: False");
      }
  
      // expressão 3
      if ((a >= c) && (d >= c)){
        System.out.println("Expressão 3: True");
      } else {
        System.out.println("Expressão 3: False");
      }
  
    }
  }
  
  """;

  
  String log_cond_res_4 = """
  
  4 - O número é par ou ímpar e se é positivo ou negativo?
  
  Faça um programa que leia um número inteiro e retorna ao usuário uma mensagem informando se o número é par ou ímpar e se é positivo ou negativo.

  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
      
      Scanner user = new Scanner(System.in);
      System.out.print("Digite um número inteiro: ");
      int usr = user.nextInt();
  
      if (usr % 2 != 0){
        System.out.println(usr + " é um número impar!");      
      } else {
        System.out.println(usr + " é um número par!");  
      }
  
      if (usr > 0){
        System.out.println(usr + " é um número positivo!");      
      } else if (usr < 0){
        System.out.println(usr + " é um número negativo!");  
      } else {
        System.out.println(usr + " é um número neutro, ou seja, não é um número nem positivo e nem negativo!");
      }
      
    }
  }
  
  """;

  
  String log_cond_res_5 = """
  
  5 - Calculadora de peso ideal.
  
  Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa que calcule seu peso ideal utilizando as seguintes fórmulas:
  a. Homens: Peso Ideal = (72,7 * altura) - 58
  b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7

  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      System.out.println("Digite seu sexo: 1 - Feminino ou 2 - Masculino.");
      int sexo = s.nextInt();
  
      Scanner altura = new Scanner(System.in);
      System.out.println("Digite sua altura: ");
      double alt = altura.nextDouble();
  
      double peso_ideal_f = 0;
      double peso_ideal_m = 0;
      
      if(sexo == 1) {
        peso_ideal_f = 62.1 * alt;
        peso_ideal_f -= 44.7;
        System.out.println("Seu peso ideal é: " + peso_ideal_f);
  
      } else if (sexo == 2) {
        peso_ideal_m = 72.7 * alt;
        peso_ideal_m -= 58.0;
        System.out.println("Seu peso ideal é: " + peso_ideal_m);
        
      } else {
        System.out.println("Digite 1 ou 2");
      }

    }
  }
  
  """;


  String log_cond_res_6 = """
  
  6 - Calculando multa. 
  
  João é pescador e um microcomputador para controlar o seu rendimento diário. 
Toda vez que ele traz um peso de peixe maior do que o estabelecido no regimento de pesca do Estado de SP (50 quilos), ele deve pagar uma multa de R$ 4,00 por quilo excedente. Faça um programa que, quando João informar o peso de peixes que trouxe no dia, o programa retorna o valor da multa. 

  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
      
      Scanner PESO = new Scanner(System.in);
      System.out.println("Digite o peso do peixe: ");
      double peso = PESO.nextDouble();
  
      double resto = 0; 
      double multa = 0;
      
      if (peso > 50) {
        resto = peso - 50;
        multa = resto * 4;
        System.out.println("O valor da multa pelo peso excedente é de " + multa + " reais");
      } else {
        System.out.println("Peso não excede 50kg, não há multa!");
      }
      
    }
  }
  
  """;


  String log_cond_res_7 = """
  
  7 - Conferindo a hemoglobina.
  
  Faça um programa de resultado de exames em que o usuário digitará Nome, idade, sexo e quantidade de hemoglobina em g/gL. O programa deverá, com base na tabela abaixo, informar se o resultado está normal ou se há alguma alteração.
  Crianças de 2 a 6 anos -> 11,5 a 13,5 g/dL
  Crianças de 6 a 12 anos -> 11,5 a 15,5 g/dL
  Homens -> 14 a 18 g/dL
  Mulheres -> 12 a 16 g/dL
  Grávidas -> 11 g/dL

  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
      
      Scanner NOME = new Scanner(System.in);
      System.out.println("Digite seu nome: ");
      String nome = NOME.next();
  
      Scanner IDADE = new Scanner(System.in);
      System.out.println("Digite sua idade: ");
      int idade = IDADE.nextInt();
  
      Scanner SEXO = new Scanner(System.in);
      System.out.println("Digite seu sexo: 1 - Feminino ou 2 - Masculino.");
      int sexo = SEXO.nextInt();
  
      int grav = 0;
      
      if (sexo == 1) {
        Scanner GRAV = new Scanner(System.in);
        System.out.println("Está gravida? 1 - Sim ou 2 - Não. ");
        grav = GRAV.nextInt();
      } else {
        grav = 2;
      }
  
      Scanner HEMOG = new Scanner(System.in);
      System.out.println("Digite a sua quantidade de hemoglobina em g/gL: ");
      double hemog = HEMOG.nextDouble();
  
  
      if (idade >= 2 && idade < 6){
        if (hemog >= 11.5 && hemog <= 13.5) { // CRIANÇAS
          System.out.println(nome + ", o resultado está normal.");
        } else {
          System.out.println(nome + ", o resultado está alterado!");
        }
        
      } else if (idade >= 6 && idade <= 12){ // CRIANÇAS
        if (hemog >= 11.5 && hemog <= 15.5) {
          System.out.println(nome + ", o resultado está normal.");
        } else {
          System.out.println(nome + ", o resultado está alterado!");
        }
        
      } else if (idade > 12 && sexo == 2){ // HOMENS
        if (hemog >= 14 && hemog <= 18) {
          System.out.println(nome + ", o resultado está normal.");
        } else {
          System.out.println(nome + ", o resultado está alterado!");
        }
        
      }  else if (idade > 12 && sexo == 1 && grav == 1){ // GRAVIDAS
        if (hemog >= 11.0 && hemog <= 11.9) { 
          System.out.println(nome + ", o resultado está normal.");
        } else {
          System.out.println(nome + ", o resultado está alterado!");
        }
        
      } else if (idade > 12 && sexo == 1 && grav == 2){ // MULHERES
        if (hemog >= 12 && hemog <= 16) { 
          System.out.println(nome + ", o resultado está normal.");
        } else {
          System.out.println(nome + ", o resultado está alterado!");
        }
      }
  
    }
  }
  
  """;


  String log_cond_res_8 = """
  
  8 - Que tipo de sangue posso receber?

  Faça um programa para um banco de sangue em que o usuário informará qual o 
tipo sanguíneo de um paciente e o programa retornará que tipo de sangue este 
paciente pode receber.
  
  Sangue tipo: A+.
  Pode doar para: AB+ e A+.
  Pode receber doação de: A+, A-, O+ e O-.
  
  Sangue tipo: A-.
  Pode doar para: A+, A-, AB+ e AB-.
  Pode receber doação de: A- e O-.
  
  Sangue tipo: B+.
  Pode doar para: B+ e AB+.
  Pode receber doação de: B+, B-, O+ e O-.
  
  Sangue tipo: B-.
  Pode doar para: B+, B-, AB+ e AB-.
  Pode receber doação de: B- e O-.
  
  Sangue tipo: AB+.
  Pode doar para: AB+.
  Pode receber doação de: Todos.
  
  Sangue tipo: AB-.
  Pode doar para: AB+ e AB-.
  Pode receber doação de: A-, B-, O- e AB-.
  
  Sangue tipo: O+.
  Pode doar para: A+, B+, O+ e AB+.
  Pode receber doação de: O+ e O-.
  
  Sangue tipo: O-.
  Pode doar para: Todos.
  Pode receber doação de: O-.
  
  
  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
  
      String txt = ""
        Digite seu tipo sanguíneo:
        1 - A+
        2 - A-
        3 - B+
        4 - B-
        5 - AB+
        6 - AB-
        7 - O+
        8 - 0-"";
  
      
      Scanner TIPO = new Scanner(System.in);
      System.out.println(txt);
      int tipo = TIPO.nextInt();
  
      if (tipo == 8) {
        System.out.println("Pode receber doação de: A+, A-, O+ e O-.");
      
      } else if (tipo == 7){
        System.out.println("Pode receber doação de: O+ e O-.");
        
      } else if (tipo == 5){
        System.out.println("Pode receber doação de: todos.");
        
      } else if (tipo == 6){
        System.out.println("Pode receber doação de: A-, B-, O- e AB-.");
      
      } else if (tipo == 1){
        System.out.println("Pode receber doação de: A+, A-, O+ e O-.");
      
      } else if (tipo == 2){
        System.out.println("Pode receber doação de: A- e O-.");
      
      } else if (tipo == 3){
        System.out.println("Pode receber doação de: B+, B-, O+ e O-.");
      
      } else if (tipo == 4){
        System.out.println("Pode receber doação de: B- e O-.");
      }
      
    }
  }
  
  """;

  
}

