/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.PaoMassa;
import Negocio.Produto;
import Negocio.ProdutoLimpeza;
import java.util.ArrayList;

/**
 *
 * @author corno
 */

    public class RepositorioProdutoArrayList implements IRepositorioProduto{

    private ArrayList<Produto> prod = new ArrayList<Produto>();


    public ArrayList<Produto> getProduto(){
        return this.prod;
    }

    @Override
    public void cadastrarProduto(Produto produto) {
       
        if(produto instanceof PaoMassa){
         PaoMassa pao = (PaoMassa) produto;
         prod.add(pao); 
            
        }else{
            ProdutoLimpeza produlimp = (ProdutoLimpeza) produto;
            prod.add(produlimp);
         
        }
       
        
        
        
    }


    @Override
    public void alterarProdutos(Produto produto,int id, String descricao, int quantidade, double preco) {
        int contador =0;
             for(Produto pr: prod){
                if(pr.getDescricao().equals(descricao)  || pr.getId() == produto.getId() ){
                            pr.setDescricao(descricao);
                            pr.setId(id);
                            pr.setQuantidade(quantidade);
                            pr.setPrecoUnitario(preco);


                }
                  contador++;               
             }
        
    }

    
    
    
    
    @Override
    public String listarProdutos() {
        String resultado = "";
        
            for(Produto pr: prod){
                
               if(pr instanceof PaoMassa){
                   resultado = resultado + ((PaoMassa) pr).ToString();
               }else{
                   resultado = resultado +  pr.toString();
               }
                    
             }
            return resultado;
    }

    
    
    
    @Override
    public void excluirProduto(Produto produto) {
            int contador=0;
            for(Produto pr: prod){
                if(pr.getId() == produto.getId()){

                    prod.remove(pr);
                }
              contador++;
        }
            
    }

   
    

   
    
    
}
