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
public class PaoMassa extends Produto{
      private int peso;
      private double valorPeso;

   

    public PaoMassa() {
        
    }

   
   
   
  

    public double getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(double valorPeso) {
        this.valorPeso = valorPeso;
    }
    public PaoMassa( int id, String descricao, int quantidade, double preco, int peso) {
        super(id, descricao, quantidade, preco);
        this.peso = peso;
        this.valorPeso = peso * preco;
        
        
    }
    
  
    
    
    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String ToString(){
        return "\n Produto Categoria Pao e Massa " + "\n id=" + this.getId() + "\n descricao=" + this.getDescricao() + "\n quantidade=" + this.getQuantidade() + "\n preco=" + this.precoUnitario + "\n valor por peso=" + this.valorPeso +" R$/KG\n" ;
    }
 
    @Override
    public void alterarPreco(double preco) {
        this.valorPeso = preco * peso;
    }
    
}