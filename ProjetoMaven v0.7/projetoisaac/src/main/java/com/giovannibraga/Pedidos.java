package com.giovannibraga;

import java.util.ArrayList;

public class Pedidos {
    private String cpfCliente;
    private String pilotoBrinquedo;
    private int quantidadeProduto;
    
 public static ArrayList<Pedidos> listaPedidos = new ArrayList<>();

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getPilotoBrinquedo() {
        return pilotoBrinquedo;
    }

    public void setPilotoBrinquedo(String pilotoBrinquedo) {
        this.pilotoBrinquedo = pilotoBrinquedo;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Pedidos(String cpfCliente, String pilotoBrinquedo, int quantidadeProduto) {
        this.cpfCliente = cpfCliente;
        this.pilotoBrinquedo = pilotoBrinquedo;
        this.quantidadeProduto = quantidadeProduto;
    }

    public static void addPedido(Pedidos newPedido){
        listaPedidos.add(newPedido);
    }

 
    public String venderProduto(String cpfCliente, String nomeProduto, int quantidadeProduto){
        String result = "";
        
        Produtos newProduto = encontrarProduto(nomeProduto);
        Clientes newCliente = encontrarCliente(cpfCliente);

        if(newProduto != null && newCliente != null){
            if(newProduto.getEstoqueBrinquedo() >= quantidadeProduto){
                newProduto.setEstoqueBrinquedo(newProduto.getEstoqueBrinquedo() - quantidadeProduto);
                result = "Cliente: " + newCliente.getNomeCliente() + " comprou " + quantidadeProduto + " unidades do produto " + newProduto.getPilotoBrinquedo();
            } else {
                result = "O cliente tentou comprar mais produtos do que a quantidade disponível no estoque (" + newProduto.getEstoqueBrinquedo() + "). Adicione mais ou compre outro produto.";
            }
        } else {
            result = "Pedido inválido, valide as informações inseridas e tente novamente.";
        }
        
        return result;
    }

    public Produtos encontrarProduto(String nomeProduto){

        for(Produtos newProduto: ListaProdutos.checarProdutos()){
            if(newProduto.getPilotoBrinquedo().equalsIgnoreCase(nomeProduto)){
                return newProduto;
            }
        }

        return null;
    }

    public Clientes encontrarCliente(String cpfCliente){

        for(Clientes newCliente: ListaClientes.checarClientes()){
            if(newCliente.getCpfCliente().equals(cpfCliente)){
                return newCliente;
            }
        }

        return null;
    }

    public static String listarPedidos(){
        String resultadoListar = "";

        for(Pedidos newPedido: listaPedidos){
            resultadoListar += newPedido.venderProduto(newPedido.getCpfCliente(), newPedido.getPilotoBrinquedo(), newPedido.getQuantidadeProduto());
        }

        return resultadoListar;
    }
}
