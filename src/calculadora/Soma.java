/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Admin
 */
public class Soma extends JFrame{

    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar;
    JButton multiplicacao;
    JButton divisao;
    JButton subtracao;
    JButton limpar;
    public Soma() {
        super("Exemplo de soma");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        multiplicacao = new JButton("Multiplicação");
        divisao = new JButton("Divisão");
        subtracao = new JButton("Subtração");
        limpar = new JButton("Limpar");
        
        rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,120,200,20); somar.setBounds(50,100,80,20);
        multiplicacao.setBounds(130, 100, 80, 20); divisao.setBounds(210, 100, 80, 20);
        subtracao.setBounds(290, 100, 80, 20);
        limpar.setBounds(170, 150, 80, 20);
        
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1, numero2, soma;
                        soma = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText("A soma é: " +soma);
                    }
                }
            );
        
        multiplicacao.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double numero1, numero2, multiplicacao;
                        multiplicacao = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        multiplicacao = numero1 * numero2;
                        exibir.setVisible(true);
                        exibir.setText("A multiplicação é: " +multiplicacao);
                    }
                }
            );
        divisao.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double numero1, numero2, divisao;
                        divisao = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        divisao = numero1 / numero2;
                        exibir.setVisible(true);
                        exibir.setText("A divisão é: " +divisao);
                    }
                }
            );
        subtracao.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double numero1, numero2, subtracao;
                        subtracao = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        subtracao = numero1 - numero2;
                        exibir.setVisible(true);
                        exibir.setText("A subtração é: " +subtracao);
                    }
                }
            );
        limpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        texto1.setText(null);
                        texto2.setText(null);
                        exibir.setText(null);
                        texto1.requestFocus();
                    }
                }
            );
        exibir.setVisible(false);
        
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(exibir); tela.add(somar);
        tela.add(multiplicacao);
        tela.add(divisao);
        tela.add(subtracao);
        tela.add(limpar);
        
        setSize(400, 250);
        setVisible(true);
    }
    
    
}
