/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GUI();
    }
}

class GUI extends JFrame implements ActionListener {

    public String number = "";
    public String operator; 
    public double angka1;

    JTextPane panel = new JTextPane();
    JButton nol = new JButton("0");
    JButton satu = new JButton("1");
    JButton dua = new JButton("2");
    JButton tiga = new JButton("3");
    JButton empat = new JButton("4");
    JButton lima = new JButton("5");
    JButton enam = new JButton("6");
    JButton tujuh = new JButton("7");
    JButton delapan = new JButton("8");
    JButton sembilan = new JButton("9");
    JButton kali = new JButton("x");
    JButton bagi = new JButton("/");
    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton samadengan = new JButton("=");
    JButton clear = new JButton("C");
    JButton koma = new JButton(".");

    public GUI() {
        setTitle("Kalkulator");
        setSize(300, 300);

        //objek kalkulator
        setLayout(null);
        add(panel);
        add(satu);
        add(dua);
        add(tiga);
        add(kali);
        add(empat);
        add(lima);
        add(enam);
        add(bagi);
        add(tujuh);
        add(delapan);
        add(sembilan);
        add(tambah);
        add(nol);
        add(koma);
        add(samadengan);
        add(kurang);
        add(clear);
        
        //ukuran
        panel.setBounds(10, 10, 230, 20);
        satu.setBounds(10, 40, 50, 20);
        dua.setBounds(70, 40, 50, 20);
        tiga.setBounds(130, 40, 50, 20);
        kali.setBounds(190, 40, 50, 20);
        empat.setBounds(10, 80, 50, 20);
        lima.setBounds(70, 80, 50, 20);
        enam.setBounds(130, 80, 50, 20);
        bagi.setBounds(190, 80, 50, 20);
        tujuh.setBounds(10, 120, 50, 20);
        delapan.setBounds(70, 120, 50, 20);
        sembilan.setBounds(130, 120, 50, 20);
        tambah.setBounds(190, 120, 50, 20);
        koma.setBounds(10, 160, 50, 20);
        nol.setBounds(70,160,50,20);
        samadengan.setBounds(130, 160, 50, 20);
        kurang.setBounds(190, 160, 50, 20);
        clear.setBounds(10, 200, 120, 20);

        setVisible(true);

        //event handling
        nol.addActionListener(this);
        satu.addActionListener(this);
        dua.addActionListener(this);
        tiga.addActionListener(this);
        empat.addActionListener(this);
        lima.addActionListener(this);
        enam.addActionListener(this);
        tujuh.addActionListener(this);
        delapan.addActionListener(this);
        sembilan.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        samadengan.addActionListener(this);
        clear.addActionListener(this);
        koma.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nol) {
            number += "0";
            panel.setText(number);
        }
        if (e.getSource() == satu) {
            number += "1";
            panel.setText(number);
        }
        if (e.getSource() == dua) {
            number += "2";
            panel.setText(number);
        }
        if (e.getSource() == tiga) {
            number += "3";
            panel.setText(number);
        }
        if (e.getSource() == empat) {
            number += "4";
            panel.setText(number);
        }
        if (e.getSource() == lima) {
            number += "5";
            panel.setText(number);
        }
        if (e.getSource() == enam) {
            number += "6";
            panel.setText(number);
        }
        if (e.getSource() == tujuh) {
            number += "7";
            panel.setText(number);
        }
        if (e.getSource() == delapan) {
            number += "8";
            panel.setText(number);
        }
        if (e.getSource() == sembilan) {
            number += "9";
            panel.setText(number);
        }
        if(e.getSource() == koma){
            number += ".";
            panel.setText(number);
        }
        
        //operator
        if(e.getSource() == kali){
            String Angka1 = panel.getText();
            angka1 = Double.parseDouble(Angka1);
            operator ="x";
            number="";
            panel.setText("");
        }
        if(e.getSource() == bagi){
            String Angka1 = panel.getText();
            angka1 = Double.parseDouble(Angka1);
            operator ="/";
            number="";
            panel.setText("");   
        }
        if(e.getSource() == tambah){
            String Angka1 = panel.getText();
            angka1 = Double.parseDouble(Angka1);
            operator ="+";
            number="";
            panel.setText("");     
        }
        if(e.getSource() == kurang){
            String Angka1 = panel.getText();
            angka1 = Double.parseDouble(Angka1);
            operator ="-";
            number="";
            panel.setText("");    
        }
        if(e.getSource() == clear){
                panel.setText(null);
                number="";
            }
        
        //hasil
        if(e.getSource() == samadengan){
            double hasil,angka2;
            if(operator =="+"){
                angka2=Double.parseDouble(panel.getText());
                hasil = angka1 + angka2;
                panel.setText(""+hasil);
            }
            if(operator =="-"){
                angka2=Double.parseDouble(panel.getText());
                hasil = angka1 - angka2;
                panel.setText(""+hasil);
            }
            if(operator =="x"){
                angka2=Double.parseDouble(panel.getText());
                hasil = angka1 * angka2;
                panel.setText(""+hasil);
            }
            if(operator =="/"){
                angka2=Double.parseDouble(panel.getText());
                hasil = angka1 / angka2;
                panel.setText(""+hasil);
            }
        }
            
    }

}
