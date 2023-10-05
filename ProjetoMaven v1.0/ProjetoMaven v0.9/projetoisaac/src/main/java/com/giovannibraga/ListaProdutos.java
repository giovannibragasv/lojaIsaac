package com.giovannibraga;

import java.io.FileWriter;
import java.util.ArrayList;


public class ListaProdutos {
    public static ArrayList<Produtos> listaProdutos = new ArrayList<>();

    public static final String CAMINHO_PRODUTOS_CSV = "produtos.csv"; 

    public static void escreverCSVProdutos(){

        try {
            FileWriter writer = new FileWriter(CAMINHO_PRODUTOS_CSV);


            for (Produtos newProduto: listaProdutos){
                writer.append(newProduto.getPilotoBrinquedo() + ", ");
                writer.append(newProduto.getPrecoBrinquedo() + ", ");
                writer.append(newProduto.getEstoqueBrinquedo() + ", ");
                writer.append("\n");
            }

            writer.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void adicionarProduto(Produtos newProduto){
        listaProdutos.add(newProduto);
    }

    public static boolean addEstoque(String pilotoBrinquedo, int quantidadeAdicionar){
        boolean produtoEst = false;

        for(Produtos newProduto: listaProdutos){
            if(newProduto.getPilotoBrinquedo().equalsIgnoreCase(pilotoBrinquedo)){
                newProduto.setEstoqueBrinquedo(newProduto.getEstoqueBrinquedo() + quantidadeAdicionar);
                produtoEst = true;
                break;
            }
            produtoEst = false;
        }

        return produtoEst;
    }

    public static boolean setarPreco(String pilotoBrinquedo, double precoNovo){
        boolean precoProd = false;

        for(Produtos newProduto: listaProdutos){
            if(newProduto.getPilotoBrinquedo().equalsIgnoreCase(pilotoBrinquedo)){
                newProduto.setPrecoBrinquedo(precoNovo);
                precoProd = true;
            }
        }
        return precoProd;
    }

    public static String listarProdutos(){
        String resultadoLista = "";

        for(Produtos newProduto: listaProdutos){
            resultadoLista += newProduto.imprimirProdutos();
        }

        return resultadoLista;
    }

    public static ArrayList<Produtos> checarProdutos(){
        return listaProdutos;
    }
}
