package com.giovannibraga;

import java.util.ArrayList;
import java.io.FileWriter;

public class ListaClientes {
    public static ArrayList<Clientes> listaClientes = new ArrayList<>();


    public static final String CAMINHO_CLIENTES_CSV = "clientes.csv";

    public static void escreverCSVClientes() {

        try {
            FileWriter writer = new FileWriter(CAMINHO_CLIENTES_CSV);

            for (Clientes newCliente : listaClientes) {
                writer.append(newCliente.getNomeCliente() + ", ");
                writer.append(newCliente.getCpfCliente() + ", ");
                writer.append(newCliente.getEnderecoCliente() + ", ");
                writer.append("\n");
            }

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void adicionarCliente(Clientes newCliente) {

        listaClientes.add(newCliente);

    }

    public static String listarClientes() {
        String saidaString = "";

        for (Clientes newCliente : listaClientes) {
            saidaString += newCliente.imprimirClientes();
        }

        return saidaString;
    }

    public static ArrayList<Clientes> checarClientes() {
        return listaClientes;
    }
}
