package cliente;    //pacote

public class Cliente {      //inicio da classe

  private String nome;        //atributos para classe cliente
  private String codigo;
  
    
  public String getNome() {       //get
        return nome;
    }

    public void setNome(String nome) {   //set
        this.nome = nome;
    }

    public String getCodigo() {        //get
        return codigo;
    }

    public void setCodigo(String codigo) {    //set
        this.codigo = codigo;
    }
  
 
    double calcularTotal() {
        throw new UnsupportedOperationException(""); //verificar

    }  
     public String toString()  {      //usando o metodo toString
    return "\nOlá seja bem vindo:"+this.nome+"\ncodigo cliente N:"+this.codigo;
  }  
      
     
    
}          //chave fim da classe Cliente
