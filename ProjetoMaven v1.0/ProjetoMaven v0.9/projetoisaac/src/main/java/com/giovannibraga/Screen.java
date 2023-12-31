package com.giovannibraga;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;

public class Screen extends JFrame implements ActionListener {

  Produtos objProduto;

  Clientes objCliente;

  public Screen() {

    new JFrame();
    setVisible(true);
    setSize(900, 700);
    setTitle("Loja Isaac");
    setLayout(null);

    JLabel textoGrande = new JLabel("Loja Isaac");
    textoGrande.setBounds(20, 20, 400, 100);

    Font fonte = textoGrande.getFont();
    textoGrande.setFont(new Font(fonte.getName(), Font.BOLD, 38));
    add(textoGrande);

    JButton jButton = new JButton("Ver Lista de Clientes");
    jButton.setBounds(10, 200, 250, 70);
    jButton.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton.setBackground(Color.BLACK);
    jButton.setForeground(Color.WHITE);
    jButton.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton);

    JButton jButton2 = new JButton("Cadastrar Novo Cliente");
    jButton2.setBounds(10, 300, 250, 70);
    jButton2.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton2.setBackground(Color.BLACK);
    jButton2.setForeground(Color.WHITE);
    jButton2.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton2);

    JButton jButton3 = new JButton("Cadastrar Novo Produto");
    jButton3.setBounds(10, 400, 250, 70);
    jButton3.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton3.setBackground(Color.BLACK);
    jButton3.setForeground(Color.WHITE);
    jButton3.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton3);

    JButton jButton4 = new JButton("Ver Estoque de Produtos");
    jButton4.setBounds(300, 200, 250, 70);
    jButton4.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton4.setBackground(Color.BLACK);
    jButton4.setForeground(Color.WHITE);
    jButton4.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton4);

    JButton jButton5 = new JButton("Adicionar Produtos ao Estoque");
    jButton5.setBounds(300, 300, 250, 70);
    jButton5.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton5.setBackground(Color.BLACK);
    jButton5.setForeground(Color.WHITE);
    jButton5.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton5);

    JButton jButton6 = new JButton("Cadastrar novo Pedido");
    jButton6.setBounds(300, 400, 250, 70);
    jButton6.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton6.setBackground(Color.BLACK);
    jButton6.setForeground(Color.WHITE);
    jButton6.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton6);

    JButton jButton7 = new JButton("Ver Lista de Pedidos");
    jButton7.setBounds(600, 200, 250, 70);
    jButton7.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton7.setBackground(Color.BLACK);
    jButton7.setForeground(Color.WHITE);
    jButton7.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton7);

    JButton jButton8 = new JButton("Alterar Preço de Produto");
    jButton8.setBounds(600, 300, 250, 70);
    jButton8.setFont(new Font(fonte.getName(), Font.PLAIN, 18));
    jButton8.setBackground(Color.BLACK);
    jButton8.setForeground(Color.WHITE);
    jButton8.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton8);

    JButton jButton9 = new JButton("Fechar App");
    jButton9.setBounds(600, 400, 250, 70);
    jButton9.setFont(new Font(fonte.getName(), Font.ITALIC, 18));
    jButton9.setBackground(Color.RED);
    jButton9.setForeground(Color.WHITE);
    jButton9.setBorder(BorderFactory.createLineBorder(new Color(26, 26, 26)));

    add(jButton9);

    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        JTextArea textArea = new JTextArea(6, 25);
        textArea.setText(ListaClientes.listarClientes());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane);

      }
    });

    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        String input = JOptionPane.showInputDialog("Insira o nome completo do Cliente: ");
        String input2 = JOptionPane.showInputDialog("Insira o CPF do Cliente: ");
        String input3 = JOptionPane.showInputDialog("Insira o endereço completo do Cliente: ");

        objCliente = new Clientes(input, input2, input3);
        ListaClientes.adicionarCliente(objCliente);

      }
    });

    jButton3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        String input = JOptionPane.showInputDialog("Insira o nome do Piloto do Brinquedo: ");
        String input2 = JOptionPane.showInputDialog("Insira o preço do brinquedo: ");
        double aDouble = Double.parseDouble(input2);

        objProduto = new Produtos(input, aDouble);
        ListaProdutos.adicionarProduto(objProduto);

      }
    });

    jButton4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        JTextArea textArea = new JTextArea(6, 25);
        textArea.setText(ListaProdutos.listarProdutos());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane);

      }
    });

    jButton5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        String input = JOptionPane.showInputDialog("Insira o nome do Produto: ");
        String input2 = JOptionPane.showInputDialog("Insira a quantidade que deseja adicionar ao estoque: ");
        int aInt = Integer.parseInt(input2);
 
        if (ListaProdutos.addEstoque(input, aInt)) {
          JOptionPane.showMessageDialog(null, "Quantidade foi adicionada");
        } else {
          JOptionPane.showMessageDialog(null, "Produto nao encontrado");
        }
      }

    });

    jButton6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        String input = JOptionPane.showInputDialog("Insira o CPF do Cliente: ");
        String input2 = JOptionPane.showInputDialog("Insira o nome do Piloto que deseja comprar");
        String input3 = JOptionPane.showInputDialog("Insira a quantidade que deseja comprar: ");
        int qtdProd = Integer.parseInt(input3);

        Pedidos newPedido = new Pedidos(input, input2, qtdProd);
        Pedidos.listaPedidos.add(newPedido);

        String result = Pedidos.venderProduto(input, input2, qtdProd);
        JOptionPane.showMessageDialog(null, result);
      }

    });

    jButton7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        JTextArea textArea = new JTextArea(6, 25);
        textArea.setText(Pedidos.listarPedidos());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane);
      }

    });

    jButton8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        String input = JOptionPane.showInputDialog("Insira o nome do Piloto do Brinquedo: ");
        String input2 = JOptionPane.showInputDialog("Insira o novo preço do brinquedo: ");
        double aDouble = Double.parseDouble(input2);

        objProduto = new Produtos(input, aDouble);
        boolean result = ListaProdutos.setarPreco(input, aDouble);
        if (result) {
          JOptionPane.showMessageDialog(null, "Preço alterado.");
        } else {
          JOptionPane.showMessageDialog(null,
              "Erro na alteração, verifique se o nome foi inserido corretamente e tente novamente.");
        }
      }
    });

    jButton8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        String input = JOptionPane.showInputDialog("Insira o nome do Piloto do Brinquedo: ");
        String input2 = JOptionPane.showInputDialog("Insira o novo preço do brinquedo: ");
        double aDouble = Double.parseDouble(input2);

        objProduto = new Produtos(input, aDouble);
        boolean result = ListaProdutos.setarPreco(input, aDouble);
        if (result) {
          JOptionPane.showMessageDialog(null, "Preço alterado.");
        } else {
          JOptionPane.showMessageDialog(null,
              "Erro na alteração, verifique se o nome foi inserido corretamente e tente novamente.");
        }
      }
    });

    jButton9.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        ListaClientes.escreverCSVClientes();
        ListaProdutos.escreverCSVProdutos();
        dispose();
      }
    });

  }

  public void actionPerformed(ActionEvent e) {

  }

}
