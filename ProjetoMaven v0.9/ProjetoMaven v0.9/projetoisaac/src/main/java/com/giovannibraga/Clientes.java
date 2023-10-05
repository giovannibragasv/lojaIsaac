package com.giovannibraga;

public class Clientes {
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public Clientes(String nomeCliente, String cpfCliente, String enderecoCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
    }

    public String imprimirClientes() {
        return "\nNome do Cliente: " + nomeCliente +  "\nCPF do Cliente: " + cpfCliente + "\nEndereço do Cliente: " + enderecoCliente + "\n";
    }
}
