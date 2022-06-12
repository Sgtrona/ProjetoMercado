/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Negocio.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Luiz
 */
public class RepositorioClienteArrayList implements IRepositorioCliente{

    private ArrayList<Cliente> clientes= new ArrayList<Cliente>();

  

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

   
    

   
    
    @Override
    public void cadastrarClientes(Cliente cliente) {
            clientes.add(cliente);  
    }

    @Override
    public void alterarClientes(Cliente cliente,String nome, String cpf, String telefone) {
             int contador =0;
             for(Cliente cl: clientes){
                if(cl.getNome().equals(cliente.getNome())  || cl.getCpf().equals(cliente.getCpf()) ){
                   cl.setNome(nome);
                   cl.setCpf(cpf);
                   cl.setTelefone(telefone);

                }
                  contador++;               
             }
    }

    @Override
    public String listarClientes() {
        String resultado = "";
        
            for(Cliente cl: clientes){
                
                return cl.toString();
                    
             }
            return resultado;
    }
    
    
       public Cliente consultarCliente(String nome, String cpf) {
              Cliente result = null;
              int contador =0;
             for(Cliente cl: clientes){
                if(this.clientes.get(contador).getNome() == nome || this.clientes.get(contador).getCpf() == cpf){
                         result = cl;
                   }
                            
                   
             }
             return result;
    }
    
    
    

    @Override
    public void excluirClientes(Cliente cliente) {
        int contador=0;
        for(Cliente cl: clientes){
                if(this.clientes.get(contador).getNome().equals(cliente.getNome())|| this.clientes.get(contador).getCpf().equals(cliente.getCpf())){
                   clientes.remove(cl);
                }
              contador++;
        }
    }
    
    
    
    
    
}
