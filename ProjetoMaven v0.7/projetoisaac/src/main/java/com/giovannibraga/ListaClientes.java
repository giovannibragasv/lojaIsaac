package com.giovannibraga;

import java.util.ArrayList;

public class ListaClientes {
    public static ArrayList<Clientes> listaClientes = new ArrayList<>();

    public static void adicionarCliente(Clientes newCliente){
        listaClientes.add(newCliente);
    }

    public static String listarClientes(){
        String saidaString = "";

        for(Clientes newCliente: listaClientes){
            saidaString += newCliente.imprimirClientes();
        }

        return saidaString;
    }

    public static ArrayList<Clientes> checarClientes(){
        return listaClientes;
    }
}
