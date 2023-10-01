//          Engenharia de software III - Design Patterns Facade
//                            Kauã Asher Ribeiro da Silva

public class Produto{
    
    //Atributos
    private String descricao;
    private double preco;

    //Métodos Especiais
    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double p){
        this.preco = preco;
    }
}