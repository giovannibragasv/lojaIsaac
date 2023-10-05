package com.giovannibraga;

import java.util.ArrayList;
import java.util.Locale;
import java.io.FileWriter;
import net.datafaker.Faker;

public class ListaClientes {
    public static ArrayList<Clientes> listaClientes = new ArrayList<>();

    //Adicionando o caminho para o arquivo csv em uma variavel do tipo String

    public static final String CAMINHO_CLIENTES_CSV = "clientes.csv"; 


    public static void ClientesAleatorios(int numClientes){
        Faker randomFaker = new Faker(new Locale("pt-BR"));

        try {
            FileWriter writer = new FileWriter(CAMINHO_CLIENTES_CSV);


            //laço for para criar os clientes

            for (int i = 0; i < numClientes; i++){
                Clientes newCliente= new Clientes(null, null, null);

                newCliente.setNomeCliente(randomFaker.name().fullName());
                newCliente.setCpfCliente(randomFaker.cpf().valid());
                newCliente.setEnderecoCliente(randomFaker.address().fullAddress());

                //add cliente para a lista
                listaClientes.add(newCliente);

                //salvando o cliente no arquivo csv
                writer.append(newCliente.getNomeCliente() + ",");
                writer.append(newCliente.getCpfCliente() + ",");
                writer.append(newCliente.getEnderecoCliente() + ",");
                writer.append("\n");  // Adicionando nova linha após cada cliente

            }

            writer.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
