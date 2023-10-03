package com.giovannibraga;


import java.util.Locale;

import net.datafaker.Faker;

public class App 
{
    public static void main( String[] args )
    {
        funcaoTeste();
        new Screen();
    }



    public static void funcaoTeste(){
        for(int i = 0; i < 50; i++){
            Faker randomFaker = new Faker(new Locale("pt-BR"));
    
            Clientes newCliente = new Clientes(null, null, null);
    
            newCliente.setNomeCliente(randomFaker.name().fullName());
            newCliente.setCpfCliente(randomFaker.cpf().valid());
            newCliente.setEnderecoCliente(randomFaker.address().fullAddress());
    
            ListaClientes.adicionarCliente(newCliente);        
        }

        for(int i = 0; i < 20; i++){
            Faker randomProduto = new Faker();
            Produtos newProduto = new Produtos(null, 99.9);
    
            newProduto.setPilotoBrinquedo(randomProduto.formula1().driver());
    
            ListaProdutos.adicionarProduto(newProduto);
        }
    }
}
