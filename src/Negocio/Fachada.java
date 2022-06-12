/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dados.RepositorioClienteArrayList;
import Dados.RepositorioProdutoArrayList;
import Dados.RepositorioVendasArrayList;
import java.util.ArrayList;
/**
 *
 * @author Luiz
 */
public class Fachada {
    private RepositorioClienteArrayList repositorioC;
    private RepositorioProdutoArrayList repositorioP;
    private RepositorioVendasArrayList repositorioV;
            
    private static Fachada instance;

    public Fachada(RepositorioClienteArrayList repositorioC, RepositorioProdutoArrayList repositorioP, RepositorioVendasArrayList repositorioV) {
        this.repositorioC = repositorioC;
        this.repositorioP = repositorioP;
        this.repositorioV = repositorioV;
    }  
    

   
   
    
    public static Fachada getInstance(){
       if(Fachada.instance ==null){
          Fachada.instance = new Fachada(new RepositorioClienteArrayList(), new RepositorioProdutoArrayList(), new RepositorioVendasArrayList());
   
          
       } 
       return Fachada.instance;
    }    
    
    
    public void CadastrarCliente(String nome, String cpf, String telefone){
        Cliente cliente = new Cliente(nome,cpf,telefone);
        repositorioC.cadastrarClientes(cliente);
        
    }
    
    public String ListarClientes(){
      String resultado="";
      for(Cliente cl: repositorioC.getClientes()){
          resultado += cl.toString();
         
      }
          
      return resultado;
    }
    
    
    
    
    public Cliente ConsultarCliente(String nome, String cpf){
       Cliente resultado = null;
        for(Cliente cl: repositorioC.getClientes()){
            if(cl.getNome().equals(nome) || cl.getCpf().equals(cpf)){
                  resultado = cl; 
            }  
      }
        
     return resultado;
    }
    
    public void alterarCliente(Cliente cliente, String nome, String cpf, String telefone){
      int contador =0;
        for(Cliente cl: repositorioC.getClientes()){
            if(cl.getNome().equals(cliente.getNome()) || cl.getCpf().equals(cliente.getCpf()) ){
                  repositorioC.alterarClientes(cliente, nome, cpf, telefone);
            }
            contador++;
      }
   }  
    
    
    public void excluirCliente(Cliente cliente){
        int contador =0;
        for(Cliente cl: repositorioC.getClientes()){
            if(cl.getNome().equals(cliente.getNome()) || cl.getCpf().equals(cliente.getCpf()) ){
                  repositorioC.excluirClientes(cl);
            }
            contador++;
      }
     
    }
      
        
   
    
    
    
    public void CadastrarProduto(Produto produto){
        
        if(produto instanceof PaoMassa){
           PaoMassa pao = (PaoMassa) produto;
           
           repositorioP.cadastrarProduto(pao);
       
        }else{
          
          ProdutoLimpeza produlimp = (ProdutoLimpeza) produto;
          repositorioP.cadastrarProduto(produlimp);
          
        }
       
    }
    
    
    
     public Produto ConsultarProduto(String descricao, int id){
       Produto resultado = null;
          for(Produto pr: repositorioP.getProduto()){
            if(pr.getDescricao().equals(descricao) || pr.getId() == id){
                  resultado = pr; 
            }  
      }
       return resultado;   
    
     }
     
     
     
     public void alterarProduto(Produto produto, int id, String descricao, int quantidade,double preco){
      int contador =0;
        for(Produto pr: repositorioP.getProduto()){
         
                if(produto instanceof PaoMassa){
                 PaoMassa pao = new PaoMassa();
                 pao = (PaoMassa) produto;
                 repositorioP.alterarProdutos(pao,id, descricao, quantidade, preco); 
                 
                 
                }else if(produto instanceof ProdutoLimpeza){
                    ProdutoLimpeza prod = new ProdutoLimpeza();
                    prod = (ProdutoLimpeza) produto;
                    repositorioP.alterarProdutos(prod,id, descricao, quantidade, preco); 
                }
     
            
            contador++;
      }
   }  
     
     
     
       public void excluirProduto(Produto produto){
        int contador =0;
        for(Produto pr: repositorioP.getProduto()){
            if(pr.getId() == produto.getId() || pr.getDescricao().equals(produto.getDescricao()) ){
                if(produto instanceof PaoMassa){
                   PaoMassa pao = (PaoMassa) produto; 
                   repositorioP.excluirProduto(pao);
                   
                }else if(produto instanceof ProdutoLimpeza){
                    ProdutoLimpeza produlimp = (ProdutoLimpeza) produto;
                    repositorioP.excluirProduto(produlimp);
                } 
                
                
                
            }
            contador++;
      }
     
    }
     
     
       
       
        
    public String ListarProduto(){
      String resultado="";
      for(Produto pr: repositorioP.getProduto()){
          
          if(pr instanceof PaoMassa){
             return  repositorioP.listarProdutos(); 
          }else if(pr instanceof ProdutoLimpeza){
             return repositorioP.listarProdutos(); 
          }
          
              
          }
          
      return resultado;
    }

    public void excluirCliente(Produto resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

    
    
    
    public void CadastrarVenda(Cliente cliente, Produto produto, int quantidade,int id){
        Venda venda = new Venda(cliente,produto,quantidade,id);
        repositorioV.cadastrarVendas(venda);
        
    }
    
    
    
    
    
    
    
    
    public Venda ConsultarVenda(int id){
       Venda resultado = null;
          for(Venda vr: repositorioV.getVenda()){
            if(vr.getId() == id){
                  resultado = vr; 
            }  
      }
       return resultado;   
     }
     
       
    
    
    
    
    
    
    public String ListarVendas(){
      String resultado="";
      for(Venda vr: repositorioV.getVenda()){
          resultado += vr.toString();
         
      }
          
      return resultado;
    }
    
    
    
    
    
       
       
       
}
    
    
    
    
    

