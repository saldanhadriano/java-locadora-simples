package cliente;          //pacote classe principal cliente

import java.util.ArrayList;           //importando uma arraylist

public class Locadora {          //iniciando a classe
    
    private ArrayList<Cliente>movies;    //atributo com arraylist
    private int quantidade;              //atributos INT e Double
    private Double valorUnitario;
    private String novoFilme;
    public int opcao1;

    public String getNovoFilme() {
        return novoFilme;
    }

    public void setNovoFilme(String novoFilme) {
        this.novoFilme = novoFilme;
    }
    
    
    public void setQuantidade(int quantidade) {     //set
        this.quantidade = quantidade;
    }

    public int getQuantidade() {    //get 
        return quantidade;
    }

    public Double getValorUnitario() {    //get
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {   //set
        this.valorUnitario = valorUnitario;
    }
    
   
    
    
    public Locadora(){                     //Constrútor da ArrayList
        movies = new ArrayList<Cliente>();
    }
    
   
    public ArrayList<Cliente> getMovies() {     //get do arraylist
        return movies;
    }

    public void setMovies(ArrayList<Cliente> movies) {     //set do arraylist
        this.movies = movies;
    }
    public void adcionarProduto(Cliente c1){
        this.movies.add(c1);//add método pronto que insere elemento
    }
    public int obterQuantidadeDeProdutos() {
        return movies.size();//size método pronto que retorna a quantidade de elementos
    }
    public Cliente getMovies(int indice){
        return movies.get(indice);
    }
    public void apagarTudo() {
        this.movies.clear();// clear, método pronto que limpa a lista
    }
    public double calcularTotal(){                 //metodo calcular a pagar
        return this.quantidade*this.valorUnitario;
    } 
    public double calcularTotalDaLista(){          //calcula todos valores
        double soma=0;
        for(int i=0; i<this.movies.size(); i++){
            soma=soma+this.movies.get(i).calcularTotal();
        }
        return soma;
    }   //chave fecha metodo calcularTotalDaLista
   
    public Cliente pesquisaPeloCodigo(String codigo){ //Metodo pesquisa
      Cliente result = null;
      for(int i=0; i<movies.size() && result==null; i++){
            if(this.movies.get(i).getCodigo().equals(codigo)){
                result=this.movies.get(i);
            }
             
        }
       return result;
   
    }  
     public String toString(){
       return "\n FILMES ESCOLHIDOS: "+"Lista: =>"+calcularTotalDaLista();    //método toString
   } 

   
   

}   //chave fim da classe Locadora
