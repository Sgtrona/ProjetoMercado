/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
 
/**
 *
 * @author Luiz
 */

public class Venda {
    private int id;
    private Cliente cliente;
    private Produto produto;
    private double valorTotal;

    @Override
    public String toString() {
        return "\n Venda \n" + "id=" + id + "\n Cliente:" + cliente.getNome() + "\n Produto:" + produto.getDescricao() + "\n  valorTotal= " + valorTotal + "R$";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }
    
    private ArrayList<Venda> vendas = new ArrayList<Venda>();

    public Venda(Cliente cliente, Produto produto, int quantidade,int id) {
        this.cliente = cliente;
        this.produto = produto;
        this.valorTotal = produto.getPrecoUnitario() * quantidade ;
        this.id = id;
    }

    public Venda(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
   
  
    
    
    public Venda consultarVenda(String cpf){
       int cont = 0;
       for(Venda vend: vendas){
           if(this.vendas.get(cont).getCliente().getCpf().equals(cpf)){
               return vend; 
           }
               cont++;
       }
        return null;
       
       
    }
   
    
    
    
}
