/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Luiz
 */
public interface IRepositorioCliente {
  
    void cadastrarClientes(Cliente cliente);
    
    void alterarClientes(Cliente cliente, String nome, String cpf, String telefone);
    
    String listarClientes();
    
    void excluirClientes(Cliente cliente);
    
   
}
