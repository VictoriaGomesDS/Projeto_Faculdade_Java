import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    boolean ponteiro_1 = true;

    while (ponteiro_1){ // Rodar para tela inicial até o fim -> 5
      
      telaInicial tela_inicial = new telaInicial();
      exercicios_while exe_while = new exercicios_while();
      exercicios_op_ari exe_ope_ari = new exercicios_op_ari();
      exercicios_log_cond exe_log_cond = new exercicios_log_cond();
      exercicios_for exe_for = new exercicios_for();
      exercicios_looping exe_loop = new exercicios_looping();
      exercicios_string exe_str = new exercicios_string();
      
      System.out.println(tela_inicial.tela_inicial);
    
      Scanner user = new Scanner(System.in);
      int usr = user.nextInt();
  
      boolean ponteiro_2 = true;
      boolean ponteiro_3 = true;
      
      while(ponteiro_2){
//------- USR ESCOLHE 1 -----------------------------------------------------
        if (usr == 1){ //Op Aritiméticos
          while(ponteiro_3){
            System.out.println(exe_ope_ari.inicial_ope);
                
            Scanner numero_questao = new Scanner(System.in);
            int num_questao = numero_questao.nextInt();
            
            if(num_questao == 1){
              System.out.println(exe_ope_ari.opa_enum_1);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_1);
                break;
                case "N":
                break;
              } 
              
            } else if (num_questao == 2) {
              System.out.println(exe_ope_ari.opa_enum_2);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_2);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 3) {
              System.out.println(exe_ope_ari.opa_enum_3);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_3);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 4) {
              System.out.println(exe_ope_ari.opa_enum_4);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_4);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 5) {
              System.out.println(exe_ope_ari.opa_enum_5);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_5);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 6) {
              System.out.println(exe_ope_ari.opa_enum_6);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_6);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 7) {
              System.out.println(exe_ope_ari.opa_enum_7);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_7);
                  break;
                case "N":
                  break;
              }
              
            } else if (num_questao == 8) {
              System.out.println(exe_ope_ari.opa_enum_8);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_8);
                  break;
                case "N":
                  break;
              }
              
            } else if (num_questao == 9) {
              System.out.println(exe_ope_ari.opa_enum_9);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_9);
                  break;
                case "N":
                  break;
              }
            
            } else if (num_questao == 10) {
              ponteiro_2 = false;
              ponteiro_3 = false;
            } // fecha else if
            
          } // fecha while
          
//------- USR ESCOLHE 2 -----------------------------------------------------
        } else if (usr == 2){ //Op logicos e cond
          while(ponteiro_3){
            System.out.println(exe_log_cond.inicial_log_cond);
                
            Scanner numero_questao = new Scanner(System.in);
            int num_questao = numero_questao.nextInt();
            
            if(num_questao == 1){
              System.out.println(exe_log_cond.log_cond_enum_1);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_1);
                break;
                case "N":
                break;
              } 
              
            } else if (num_questao == 2) {
              System.out.println(exe_log_cond.log_cond_enum_2);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_2);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 3) {
              System.out.println(exe_log_cond.log_cond_enum_3);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_3);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 4) {
              System.out.println(exe_log_cond.log_cond_enum_4);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_4);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 5) {
              System.out.println(exe_log_cond.log_cond_enum_5);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_5);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 6) {
              System.out.println(exe_log_cond.log_cond_enum_6);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_6);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 7) {
              System.out.println(exe_log_cond.log_cond_enum_7);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_7);
                  break;
                case "N":
                  break;
              }
              
            } else if (num_questao == 8) {
              System.out.println(exe_log_cond.log_cond_enum_8);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_ope_ari.opa_res_8);
                  break;
                case "N":
                  break;
              }
              
            } else if (num_questao == 9) { //LOOPING
              System.out.println(exe_loop.loop_enum_9);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_9);
                  break;
                case "N":
                  break;
              }

            } else if (num_questao == 10) { 
              System.out.println(exe_loop.loop_enum_10);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_10);
                  break;
                case "N":
                  break;
              }

            } else if (num_questao == 11) { 
              System.out.println(exe_loop.loop_enum_11);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_11);
                  break;
                case "N":
                  break;
              }

            } else if (num_questao == 12) { 
              System.out.println(exe_loop.loop_enum_12);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_12);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 13) { 
              System.out.println(exe_loop.loop_enum_13);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_13);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 14) { 
              System.out.println(exe_loop.loop_enum_14);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_14);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 15) { 
              System.out.println(exe_loop.loop_enum_15);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_15);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 16) { 
              System.out.println(exe_loop.loop_enum_16);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_16);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 17) { 
              System.out.println(exe_loop.loop_enum_17);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_17);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 18) { 
              System.out.println(exe_loop.loop_enum_18);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_18);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 19) { 
              System.out.println(exe_loop.loop_enum_19);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_loop.loop_res_19);
                  break;
                case "N":
                  break;
              }


            } else if (num_questao == 20) { // INICIO FOR
              System.out.println(exe_for.f_enum_20);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_20);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 21) { 
              System.out.println(exe_for.f_enum_21);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_21);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 22) { 
              System.out.println(exe_for.f_enum_22);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_22);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 23) { 
              System.out.println(exe_for.f_enum_23);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_23);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 24) { 
              System.out.println(exe_for.f_enum_24);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_24);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 25) { 
              System.out.println(exe_for.f_enum_25);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_25);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 26) { 
              System.out.println(exe_for.f_enum_26);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_26);
                  break;
                case "N":
                  break;
              }

             } else if (num_questao == 27) { 
              System.out.println(exe_for.f_enum_27);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_for.f_res_27);
                  break;
                case "N":
                  break;
              }

              
            } else if (num_questao == 28) { // FIM LISTA COND E LOGICO
              ponteiro_2 = false;
              ponteiro_3 = false;
            } // fecha else if
            
          } // fecha while


          
//------- USR ESCOLHE 3 -----------------------------------------------------
         
        } else if (usr == 3){ // WHILE
          while(ponteiro_3){
            System.out.println(exe_while.inicial_while);
                
            Scanner numero_questao = new Scanner(System.in);
            int num_questao = numero_questao.nextInt();
            
            if(num_questao == 1){
              System.out.println(exe_while.w_enum_1);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_1);
                break;
                case "N":
                break;
              } 
              
            } else if (num_questao == 2) {
              System.out.println(exe_while.w_enum_2);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_2);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 3) {
              System.out.println(exe_while.w_enum_3);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_3);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 4) {
              System.out.println(exe_while.w_enum_4);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_4);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 5) {
              System.out.println(exe_while.w_enum_5);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_5);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 6) {
              System.out.println(exe_while.w_enum_6);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_6);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 7) {
              System.out.println(exe_while.w_enum_7);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_while.w_res_7);
                  break;
                case "N":
                  break;
              }
              
            } else if (num_questao == 8) {
              ponteiro_2 = false;
              ponteiro_3 = false;
            }  //else id questoes
          }    //while  
       

          
//------- USR ESCOLHE 3 -----------------------------------------------------
            
        } else if (usr == 4){   // STRING
          while(ponteiro_3){
            System.out.println(exe_str.inicial_string);
                
            Scanner numero_questao = new Scanner(System.in);
            int num_questao = numero_questao.nextInt();
            
            if(num_questao == 1){
              System.out.println(exe_str.s_enum_1);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_str.s_res_1);
                break;
                case "N":
                break;
              } 
              
            } else if (num_questao == 2) {
              System.out.println(exe_str.s_enum_2);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_str.s_res_1);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 3) {
              System.out.println(exe_str.s_enum_3);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_str.s_res_1);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 4) {
              System.out.println(exe_str.s_enum_4);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_str.s_res_1);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 5) {
              System.out.println(exe_str.s_enum_5);
              
              Scanner sc = new Scanner(System.in);
              String ver_res = sc.next();
              
              switch (ver_res) {
                case "S":
                  System.out.println(exe_str.s_res_1);
                break;
                case "N":
                break;
              }
              
            } else if (num_questao == 6) {
              ponteiro_2 = false;
              ponteiro_3 = false;
            } 
          }  
        //ultimo if   
        } else if (usr == 6){
          ponteiro_2 = false;
          ponteiro_1 = false;
        } // fecha ultimo if geral
        
      } // while questoes geral
      
    } // while geral
    
  } // public static
    
} 
  
  // fecha class