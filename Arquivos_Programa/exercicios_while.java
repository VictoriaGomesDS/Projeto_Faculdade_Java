public class exercicios_while {
//  TELA 2
  String inicial_while = """
  
  Lógica de laços de repetição While

  Você selecionou para ver os exercícios sobre Lógica de laços de repetição While. Veja a relação dos exercícios abaixo:

  1 - Imprimindo 11 vezes Hello World.
  2 - Exibindo números pares de 1 até 50 na tela.
  3 - Lendo 3 notas e mostrando a média delas.
  4 - Escrevendo um programa com um looping indeterminado.
  5 - Fazendo um programa que só aceite valores válidos entre 12 e 20.
  6 - Usando Random.
  7 - Fazendo um programa que só aceite valores válidos, acumúle-os e retorne a media ao final.
  8 - Voltar a tela inicial.
  
  Selecione a opção desejada:  """;



  
// TELA 3
  
  String w_enum_1 = """
  
  1. Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma estrutura sequencial e uma 
estrutura de repetição while. 
  Você deseja ver a solução? [S/N] 
  
  """;

  String w_enum_2 = """
  
  2. Escrever um programa para exibir os números pares de 1 até 50 na tela.  
  Você deseja ver a solução? [S/N]
  
  """;

  String w_enum_3 = """
  
  3. Crie um programa para ler 3 notas e mostrar a média delas.   
  Você deseja ver a solução? [S/N]
  
  """;

  String w_enum_4 = """
  
  4. Escreva um programa com um looping indeterminado em que enquanto o usuário não pedir para o programa 
sair, ele continua printando um contador na tela.    
  Você deseja ver a solução? [S/N]
  
  """;

  String w_enum_5 = """
  
  5. Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número diferente, 
mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número 
digitado.     
  Você deseja ver a solução? [S/N]
  
  """;

  String w_enum_6 = """
  
  6. Usando o laço while para pedir ao usuário que tente acertar um número aleatório entre 0 e 10 (incluindo) e 
mostrar a quantidade de tentativas feitas. Dica: Usar o comando Random numero = new Random().     
  Você deseja ver a solução? [S/N] 
  
  """;

  String w_enum_7 = """
  
  7. O usuário vai digitar uma nota válida (de 0 até 10). O programa deverá armazenar estas notas em um 
acumulador. Usar uma segunda variável para contar quantas notas foram armazenadas. Ao final, quando o usuário 
não quiser mais lançar notas, ele pede para sair e o programa imprime na tela a média das notas.     
  Você deseja ver a solução? [S/N] 
  
  """;



  
// TELA 4
  
  String w_res_1 = """
  
  1 - Imprimindo 11 vezes Hello World.
  
  Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma estrutura sequencial e uma estrutura de repetição while. 
  
  class Main { 
   public static void main(String[] args) { 
   
   int ponteiro = 0; 
   while (ponteiro <= 10){ 
   
   System.out.println(" Hello World!"); 
   ponteiro++; 
   
   } 
   
   } 
  }
  
  """;

  
  String w_res_2 = """
  
  2 - Exibindo números pares de 1 até 50 na tela.
  
  Escrever um programa para exibir os números pares de 1 até 50 na tela. 
  
  class Main { 
   public static void main(String[] args) { 
   int i=2; 
   
   while(i<=50){ 
   
   System.out.println("Numero par: " + i); 
   i+=2; 
   
   } 
   
   } 
  } 
  
  """;

  
  String w_res_3 = """
  
  3 - Lendo 3 notas e mostrando a média delas.
  
  Crie um programa para ler 3 notas e mostrar a média delas. 
   
  import java.util.Scanner; 
  class Main { 
   public static void main(String[] args) { 
   
   float media = 0; 
   float soma = 0; 
   int i = 1; 
   
   while(i<=3){ 
   
   Scanner nota = new Scanner(System.in); 
   System.out.print("Entre com um número: "); 
   
   float notas = nota.nextFloat(); 
   soma += notas; 
   i++; 
   
   } 
   media = soma / 3; 
   System.out.print("A média dos valores é: " + media); 
   
   } 
  } 
  
  """;

  
  String w_res_4 = """
  
  4 - Escrevendo um programa com um looping indeterminado.
  
  Escreva um programa com um looping indeterminado em que enquanto o usuário não pedir para o programa sair, ele continua printando um contador na tela. 
   
  import java.util.Scanner; 
  class Main { 
   public static void main(String[] args) { 
   float continuar = 0; 
   int contador = 1; 
   boolean ponteiro = true; 
   
   while(ponteiro){ 
   Scanner cont = new Scanner(System.in); 
   System.out.println("Deseja continuar? 1 - sim ou 2 - não"); 
   continuar = cont.nextFloat(); 
   
   if (continuar == 1) { 
   System.out.println("Contador: " + contador); 
   contador++; 
   } else { 
   ponteiro = false; 
   } 
   
   } 
   
   } 
  } 
  
  """;

  
  String w_res_5 = """
  
  5 - Fazendo um programa que só aceite valores válidos entre 12 e 20.
  
  Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número digitado. 
   
  import java.util.Scanner; 
  class Main { 
   public static void main(String[] args) { 
   boolean ponteiro = true; 
   while(ponteiro){ 
   Scanner user = new Scanner(System.in); 
   System.out.println("Digite um número entre 12 e 20"); 
   float usr = user.nextFloat(); 
   
   if (12 > usr || usr > 20) { 
   System.out.println("Entrada inválida"); 
   
   } else { 
   System.out.println("Você digitou o número: " + usr); 
   ponteiro = false; 
   
   } 
   
   } 
   
   } 
  } 
  
  """;


  String w_res_6 = """
  
  6 - Usando Random.
  
  Usando o laço while para pedir ao usuário que tente acertar um número aleatório entre 0 e 10 (incluindo) e mostrar a quantidade de tentativas feitas. Dica: Usar o comando Random numero = new Random(); 
 
  import java.util.Scanner; 
  import java.util.Random; 
  class Main { 
   public static void main(String[] args) { 
   int contador = 1; 
   boolean ponteiro = true; 
   
   while(ponteiro){ 
   
   Random randao = new Random(); 
   int numero = randao.nextInt(11); 
   
   Scanner user = new Scanner(System.in); 
   System.out.println("Tente acertar o número aleatório entre 0 e 10. Digite um número!"); 
   int usr = user.nextInt(); 
   System.out.println(numero); 
   
   if ( usr != numero) { 
   System.out.println("Errou!"); 
   contador++; 
   
   } else { 
   System.out.println("Você digitou o número: " + usr); 
   System.out.println("Você fez " + contador + " tentativa(s)"); 
   
   ponteiro = false; 
   
   } 
   
   } 
   
   } 
  }  
  
  """;


  String w_res_7 = """
  
  7 - Fazendo um programa que só aceite valores válidos, acumúle-os e retorne a media ao final.
  
  O usuário vai digitar uma nota válida (de 0 até 10). O programa deverá armazenar estas notas em um acumulador.  Usar uma segunda variável para contar quantas notas foram armazenadas. Ao final, quando o usuário não quiser mais lançar notas, ele pede para sair e o programa imprime na tela a média das notas. 
 
  import java.util.Scanner; 
  class Main { 
   public static void main(String[] args) { 
   int contador = 0; 
   float soma_notas = 0; 
   float media_notas = 0; 
   boolean ponteiro = true; 
   
   while(ponteiro){ 
   
   Scanner nota = new Scanner(System.in); 
   System.out.println("Digite uma nota"); 
   int notas = nota.nextInt(); 
   
   if (notas > 10 || notas < 0) { 
   System.out.println("Digite uma nota válida!"); 
   } else { 
   soma_notas += notas; 
   contador++; 
   } 
   Scanner continuar = new Scanner(System.in); 
   System.out.println("Deseja continuar? 1 - Sim ou 2 - Não"); 
   int cont = continuar.nextInt(); 
   if (cont == 1) { 
   ponteiro = true; 
   } else { 
   media_notas = soma_notas / contador; 
   System.out.println("A média das notas impressas foi de: " + media_notas); 
   ponteiro = false; 
   } 
   
   } 
   
   } 
  }  
  
  """;
  
}

