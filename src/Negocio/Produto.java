/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Luiz
 */
public abstract class Produto {
    protected int id;
    protected String descricao;
    protected int quantidade;
    protected double precoUnitario;

    
      public Produto(int id,String descricao, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = preco;
    }

    

    public Produto() {
    }
    
    
    @Override
    public String toString() {
        return "\n Produto Limpeza \n" + " id=" + id + "\n descricao=" + descricao + "\n quantidade=" + quantidade + "\n preco=" + precoUnitario + "\n" ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
   
    
    public void removerEstoque(Produto produto, int quantidade){
        this.quantidade -= quantidade;
    }
    
    
 
    public abstract void alterarPreco(double preco);    
      
    
}
