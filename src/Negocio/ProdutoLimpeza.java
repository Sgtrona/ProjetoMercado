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
public class ProdutoLimpeza extends Produto {

    public ProdutoLimpeza(int id,String descricao, int quantidade, double preco) {
        super(id, descricao, quantidade, preco);
    }

    public ProdutoLimpeza() {

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

    
    

/*
    public void acidionarEstoque() {
         
    }


    public void removerEstoque() {
        
    }
*/
    @Override
    public void alterarPreco(double apreco) {
       this.setPrecoUnitario(apreco);
    }
    
}
