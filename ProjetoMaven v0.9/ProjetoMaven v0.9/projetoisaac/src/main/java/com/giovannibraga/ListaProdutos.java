package com.giovannibraga;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Locale;

import net.datafaker.Faker;

public class ListaProdutos {
    public static ArrayList<Produtos> listaProdutos = new ArrayList<>();

    public static final String CAMINHO_PRODUTOS_CSV = "produtos.csv"; 

    public static void ProdutosAleatorios(int numProduto){
        Faker randomFaker = new Faker(new Locale("pt-BR"));

        try {
            FileWriter writer = new FileWriter(CAMINHO_PRODUTOS_CSV);


            for (int i = 0; i < numProduto; i++){
                Produtos newProduto = new Produtos(null, 99.9);

                newProduto.setPilotoBrinquedo(randomFaker.formula1().driver());

                listaProdutos.add(newProduto);

                writer.append(newProduto.getPilotoBrinquedo() + ",");
                writer.append(newProduto.getPrecoBrinquedo() + ",");
                writer.append(newProduto.getEstoqueBrinquedo() + ",");


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
