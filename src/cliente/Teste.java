package cliente;       // pacote classe principal

import java.util.Scanner;     //importando

public class Teste {    //inicio da classe teste
     
    public static void main(String[] args) {    
        Scanner ler= new Scanner(System.in);     //Scanner
        
        Cliente c1 = new Cliente();       //instanciando objetos
        Locadora l1 = new Locadora();
         
        System.out.println("BEM VINDO A LOCANET ''sua locadora na web''");
        //comando entrar sistema com nome
        System.out.println("DIGITE SEU NOME: ");  
        c1.setNome(ler.nextLine());
        
        // comando para digitar codigo cliente
        System.out.println("DIGITE SEU CODIGO DE CLIENTE: ");  
        c1.setCodigo(ler.nextLine());
       
        
        System.out.println(c1);
        System.out.println("-------------------------------------------------");
        //Escolhendo um genero de filme com o metodo verificarOpçoes..
        
        //fazendo menu usando o DO
        int opcao1;
        do {              
                        
        System.out.println("ESCOLHA UM GENERO DE FILME PREFERIDO OU OPÇãO!!!");
        System.out.println("***PROMOÇÂO FILMES 3R$***");
        System.out.println("(1)  TERROR");
        System.out.println("(2)  COMEDIA");
        System.out.println("(3)  AVENTURA");
        System.out.println("(4)  AÇâO");
        System.out.println("---------------------------------------------");
        System.out.println("(5)  ADICIONAR PEDIDO FILME");
        System.out.println("(6)  VERIFICAR VALOR A PAGAR");
        System.out.println("(7)  VERIFIAR QUANTIDADE DE FILMES CADASTRADOS");
        System.out.println("(8)  VER FILMES CADASTRADOS:");
        System.out.println("(9)  APAGAR TUDO");
        System.out.println("(10) PESQUISAR  CLIENTE PELO CODIGO:");
        System.out.println("(0)  SAIR");
        System.out.println("_________________________________________________");
        System.out.println("  DIGITE A OPÇÂO: ");
        opcao1=ler.nextInt();
       
      switch(opcao1){
          case 1:
             int op; 
                System.out.println("** FILMES DE TERROR EM CARTAZ**");
                System.out.println("(1) CARRIE");
                System.out.println("(2) JASON ");
                System.out.println("(3) EVIL DEAD ");
                System.out.println("---------------------------------------------");
                System.out.println("(4) SAIR ");
                System.out.println("ESCOLHA UM FILME:");
                ler.nextByte();
                op=ler.nextByte();
             if(op==1){
                System.out.println("-->FILME ESCOLIDO CARRIE");
                 System.out.println("BOM FILME");
                 System.out.println("\n");
             }
             else if(op==2){
                System.out.println("-->FILME ESCOLIDO JASON");
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(op==3){
                 System.out.println("-->FILME ESCOLIDO EVIL DEAD");
                 System.out.println("BOM FILME");
                 System.out.println("\n");
             }
             else{
                 System.out.println("sair");
             }
       
             break;
        
          case 2:
             int opc;
                System.out.println("** FILMES DE COMéDIA EM CARTAZ **"); 
                System.out.println("(1)DEBI E LOIDE");
                System.out.println("(2)LOUCADEMIA DE POLICIA");
                System.out.println("(3)TODO MUNDO EM PANICO");
                System.out.println("---------------------------------------------");
                System.out.println("(4)SAIR");
                System.out.println("ESCOLHA UM FILME:");
                opc=ler.nextByte();
             if(opc==1){
                System.out.println("-->FILME ESCOLIDO DEBI E LOIDE"); 
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(opc==2){
                System.out.println("-->FILME ESCOLIDO LOUCADEMIA DE POLICIA");
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(opc==3){
                 System.out.println("-->FILME ESCOLIDO TODO MUNDO EM PANICO");
                 System.out.println("BOM FILME");
                 System.out.println("\n");
             }
             else{
                 System.out.println("sair");
             }
       
             break;
         case 3:
               int opc1;
                System.out.println("** FILMES DE AVENTURA EM CARTAZ **"); 
                System.out.println("(1)pERCY JACKSON");
                System.out.println("(2)LOTR");
                System.out.println("(3)INVICTUS");
                System.out.println("---------------------------------------------");
                System.out.println("(4)SAIR");
                System.out.println("ESCOLHA UM FILME:");
                opc1=ler.nextByte();
             if(opc1==1){
                System.out.println("-->FILME ESCOLIDO PERCY JACKSON"); 
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(opc1==2){
                System.out.println("-->FILME ESCOLIDO LOTR");
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(opc1==3){
                 System.out.println("-->FILME ESCOLIDO EVIL DEAD");
                 System.out.println("BOM FILME");
                 System.out.println("\n");
             }
             else{
                 System.out.println("sair");
             }
       
             break;
         case 4:
               int opc2;
                System.out.println("** FILMES DE AÇÂO EM CARTAZ **"); 
                System.out.println("(1)BLADE");
                System.out.println("(2)RAMBO");
                System.out.println("(3)ROCKY BALBOA");
                System.out.println("---------------------------------------------");
                System.out.println("(4)SAIR");
                System.out.println("ESCOLHA UM FILME:");
                opc2=ler.nextByte();
         if(opc2==1){
                System.out.println("-->FILME ESCOLIDO BLADE"); 
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(opc2==2){
                System.out.println("-->FILME ESCOLIDO RAMBO");
                System.out.println("BOM FILME");
                System.out.println("\n");
             }
             else if(opc2==3){
                 System.out.println("-->FILME ESCOLIDO ROCKY BALBOA");
                 System.out.println("BOM FILME");
                 System.out.println("\n");
             }
             else{
                 System.out.println("sair");
             }
       
             break;
         case 5:
             System.out.println("COLOQUE O NOME DO SEU PEDIDO DE FILME:");
             ler.nextLine();
             l1.setNovoFilme(ler.nextLine());
             l1.adcionarProduto(c1);
             System.out.println("##FILME ADICIONADO COM SUCESSO##");
             System.out.println("\n");
             break;
         case 6:    //metodo mostrar total a pagar com case
             System.out.println("DIGITE QUANTIDADE DE FILMES ALUGADOS:");
             l1.setQuantidade(ler.nextInt());
             System.out.println("DIGITE O VALOR FILME:");
             l1.setValorUnitario(ler.nextDouble());
             System.out.println("Total a pagar é "+l1.calcularTotal());
             System.out.println("\n");
            break;
        case 7:
             if(l1.getMovies().isEmpty()){
                 System.out.println("Não há produtos!!!");
             }  else{
                 System.out.println("total de cadastros é:"+l1.obterQuantidadeDeProdutos());
                 System.out.println("\n");
             }    
             
             break; 
            
        case 8:
            
            if(l1.obterQuantidadeDeProdutos()>0){
           for(int i=0; i<l1.obterQuantidadeDeProdutos(); i++){
                   System.out.println(l1.getMovies(i));
                   System.out.println("");
                   }
           }else{
                   System.out.println("Nao há filmes cadastrados");
                    }
                    
            
            break;
        
        case 9:
            if(l1.getMovies().isEmpty()){
            System.out.println("NÂO HÀ FILMES!!!");
          } 
            else {
                int confirma;
                System.out.println("VOCê DESEJA MESMO EXCLUIR???");
                System.out.println("(1) SIM");
                System.out.println("(2) NãO");
                confirma=ler.nextInt();
                     if(confirma==1){
                     l1.apagarTudo();
                       System.out.println("PEDIDOS DE FILMES APAGADOS!!!!!");
                     }
                     else {
                       System.out.println("CANCELADO!!");
                     }
         } //fecha else do case9
        case 10:
            System.out.println("Informe o CODIGO do Cliente para efetuar a pesquisa");
                    String codigo=ler.next();
                    Cliente ret = l1.pesquisaPeloCodigo(codigo);
                    if(ret==null){
                        System.out.println("Não Há este Cliente na Fila.");
                    }else{
                        System.out.println(ret);
                    }
                    break;
      }  //fecha switch
         
    }  while(opcao1!=0);     //Chave fecha do
      
        
   }   //fecha o static void
} //fecha classe teste
