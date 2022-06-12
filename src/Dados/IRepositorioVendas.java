/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Venda;

/**
 *
 * @author Luiz
 */
public interface IRepositorioVendas {
    
     void cadastrarVendas(Venda venda);
     
     String listarVendas();
     
   
    
}
