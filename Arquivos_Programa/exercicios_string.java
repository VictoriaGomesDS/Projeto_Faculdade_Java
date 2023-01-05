public class exercicios_string {
//  TELA 2
  String inicial_string = """
  
  Trabalhando com String

  Você selecionou para ver os exercícios Trabalhando com String. Veja a relação dos exercícios abaixo:

  1 - Verificando se o texto começa com letra em caixa alta ou não.
  2 - Verificando se o código inicial de um produto começa com “BEB”.
  3 - Verificando qual o último caractere digitado no texto.
  4 - Apagar os pontos e o hífen do CPF e, depois contar quantos caracteres foram inseridos.
  5 - Tente acertar a palavra secreta.
  6 - Voltar a tela inicial.
  
  Selecione a opção desejada:  """;



  
// TELA 3
  
  String s_enum_1 = """
  
  1. Faça um programa que verifica se o texto começa com letra em caixa alta ou não. 
  Você deseja ver a solução? [S/N] 
  
  """;  
  
  String s_enum_2 = """
  
  2. Faça um programa que verifica se o código inicial de um produto começa com “BEB”. 
  Você deseja ver a solução? [S/N] 
  
  """;
    
  String s_enum_3 = """
  
  3. Faça um programa que verifica qual o último caractere digitado no texto. 
  Você deseja ver a solução? [S/N] 
  
  """;

    
  String s_enum_4 = """
  
  4. O usuário insere um CPF seguindo xxx.xxx.xxx-xx. O programa deve apagar os pontos e o hífen e, depois contar quantos caracteres foram inseridos.
  Você deseja ver a solução? [S/N] 
  
  """;
    
  String s_enum_5 = """
  
  5.  Fazer um programa com uma palavra secreta. O usuário deverá tentar adivinhar esta palavra.
  Você deseja ver a solução? [S/N] 
  
  """;



  
  // TELA 4
  
  String s_res_1 = """
  
  1 - Verificando se o texto começa com letra em caixa alta ou não.
  
  Faça um programa que verifica se o texto começa com letra em caixa alta ou não.
  
  class Main {
    public static void main(String[] args) {
  
      // Teste 1
      
      String palavra = "Tomate";
      int indexInic = palavra.indexOf("T");
      String resultado = palavra.substring(indexInic,indexInic + 1);
      System.out.println(resultado);
  
      if (resultado.toUpperCase() == resultado) {
        System.out.println("É em caixa alta.");
      } else {
        System.out.println("É em caixa baixa.");
      }
  
  
      // Teste 2
      
      palavra = "tomate";
      indexInic = palavra.indexOf("t");
      resultado = palavra.substring(indexInic,indexInic + 1);
      System.out.println(resultado);
  
      if (resultado.toUpperCase() == resultado) {
        System.out.println("É em caixa alta.");
      } else {
        System.out.println("É em caixa baixa.");
      }
      
    }
  }
  
  """;

    
  String s_res_2 = """
  
  2 - Verificando se o código inicial de um produto começa com “BEB”.
  
  Faça um programa que verifica se o código inicial de um produto começa com “BEB”.
  
  class Main {
    public static void main(String[] args) {
  
      // Teste 1
      
      String produto = "BEBIDA";
      int indexInic = produto.indexOf("B");
      String resultado = produto.substring(indexInic,indexInic + 3);
      System.out.println(resultado);
  
      if (resultado.startsWith("BEB")) {
        System.out.println("Começa com BEB.");
      } else {
        System.out.println("Não começa com BEB.");
      }
  
      // Teste 2
      
      produto = "TOMATE";
      indexInic = produto.indexOf("T");
      resultado = produto.substring(indexInic,indexInic + 3);
      System.out.println(resultado);
  
      if (resultado.startsWith("BEB")) {
        System.out.println("Começa com BEB.");
      } else {
        System.out.println("Não começa com BEB.");
      }
      
    }
  }
  
  """;
    
  String s_res_3 = """
  
  3 - Verificando qual o último caractere digitado no texto.
  
  Faça um programa que verifica qual o último caractere digitado no texto.
  
  class Main {
    public static void main(String[] args) {
  
      String palavra = "Borboleta";
      int tamanho = palavra.length(); 
      String ultimoDig = palavra.substring(tamanho-1, tamanho); 
      
      System.out.println("Último caracter da String: " + ultimoDig);
      
    }
  }
  
  """;
    
  String s_res_4 = """
  
  4 - Apagar os pontos e o hífen do CPF e, depois contar quantos caracteres foram inseridos.
  
  O usuário insere um CPF seguindo xxx.xxx.xxx-xx. O programa deve apagar os pontos e o hífen e, depois contar quantos caracteres foram inseridos.
  
  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
  
      Scanner cpf = new Scanner(System.in); 
      System.out.print("Entre com um número: "); 
      String CPF_Scanner = cpf.next(); 
      
      String CPF_tratat1 = CPF_Scanner.replace(".", "");
      String CPF_final = CPF_tratat1.replace("-", "");
  
      int tamanho = CPF_final.length();
      
      System.out.println("Tamanho do CPF: " + tamanho);
      System.out.println("Número do CPF: " + CPF_final);
    }
  }
  
  """;
    
  String s_res_5 = """
  
  5 - Tente acertar a palavra secreta.
  
  Fazer um programa com uma palavra secreta. O usuário deverá tentar adivinhar esta palavra.  
    
  import java.util.Scanner;
  
  class Main {
    public static void main(String[] args) {
  
      String palavraSecreta = "batom";
      
      Scanner TENTATIVA = new Scanner(System.in); 
      System.out.print("Tente acertar a palavra secreta: "); 
      String tentativa = TENTATIVA.next(); 
      
      tentativa = tentativa.toLowerCase();
      
      if (tentativa.contains(palavraSecreta)) {
        System.out.println("Acertou!");
      } else {
        System.out.println("Errou!");
      }
  
    }
  }
  
  """;


  
}