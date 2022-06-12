/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import Negocio.Produto;
import Negocio.Venda;
import java.util.ArrayList;

/**
 *
 * @author Luiz
 */
public class RepositorioVendasArrayList implements IRepositorioVendas{

    
    private ArrayList<Venda> vendas = new ArrayList<Venda>();

  

    public ArrayList<Venda> getVenda() {
        return this.vendas;
    }
    
    

    
    @Override
    public void cadastrarVendas(Venda venda) {
        vendas.add(venda);  
    }

    
    
    @Override
    public String listarVendas() {
         String resultado = "";
        
            for(Venda vr: vendas){
               
                    resultado = vr.toString();
              
                 
               }
   
            return resultado;
    }

    
    
    
  
    
    
    
    
       
}
