package com.giovannibraga;

import java.util.ArrayList;

public class ListaProdutos {
    public static ArrayList<Produtos> listaProdutos = new ArrayList<>();

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

    public static void setarPreco(String pilotoBrinquedo, double precoNovo){
        for(Produtos newProduto: listaProdutos){
            if(newProduto.getPilotoBrinquedo().equalsIgnoreCase(pilotoBrinquedo)){
                newProduto.setPrecoBrinquedo(precoNovo);
            }
        }
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
