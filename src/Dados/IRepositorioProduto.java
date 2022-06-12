/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Produto;

/**
 *
 * @author Luiz
 */
public interface IRepositorioProduto {
    
  
    void cadastrarProduto(Produto produto);
    
    void alterarProdutos(Produto produto,int id, String descricao, int quantidade, double preco);
    
    String listarProdutos();
    
    void excluirProduto(Produto produto);
    
    
   

}
