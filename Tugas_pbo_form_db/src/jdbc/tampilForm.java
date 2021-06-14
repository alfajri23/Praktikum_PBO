/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author User
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class tampilForm {
    public String no_mk, nama_mk, kelas, nip;
    int jmlData;
    String data[][] = new String[500][99];
    String datas[][] = new String[100][100];
    
    Connector connector = new Connector();    
    
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("JDBC");
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nama","Email","Password","Ttl","Almat","Desc","JK","Username"}; //membuat kolom dgn array tipe object;
    
    public tampilForm(){
        window.setLayout(null);
        window.setSize(550,600);
      //  window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        try{
            int jmlDatas = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `data`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                data[jmlDatas][0] = resultSet.getString("nama"); 
                data[jmlDatas][1] = resultSet.getString("email"); 
                data[jmlDatas][2] = resultSet.getString("password");
                data[jmlDatas][3] = resultSet.getString("ttl");
                data[jmlDatas][4] = resultSet.getString("alamat");
                data[jmlDatas][5] = resultSet.getString("desc");
                data[jmlDatas][6] = resultSet.getString("jk");
                data[jmlDatas][7] = resultSet.getString("username");
                jmlDatas++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        
        tabel = new JTable(data,namaKolom); //tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        window.add(scrollPane);
        
        scrollPane.setBounds(20, 35, 500, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
    }
    
    public int getBanyakData(){ //menghitung jumlah baris yg ada pada db
        int jmlDatad = 0; //nilai awal 0
        try{
            connector.statement = connector.koneksi.createStatement();
            String query = "Select * from `data`";
            ResultSet resultSet = connector.statement.executeQuery(query); //pengambilan data dalam java dari database
            while(resultSet.next()){ //ambil nilai dari baris ke 0 sampai baris akhir
                jmlDatad++;
            }
            return jmlDatad; //mengembalikan jumlah data ke readtiket
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
        
    }
    
    public String[][] readTiket(){ //dua dimensi (baris-kolom)
        try{
            int jmlDatat = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String datap[][] = new String[getBanyakData()][4];//menampung array. barisnya isinya di getBanyakData,kolomnya itu atribut
            String query = "Select * from `data`"; //proses pengambilan data
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                datap[jmlDatat][0] = resultSet.getString("nama"); 
                datap[jmlDatat][1] = resultSet.getString("email"); 
                datap[jmlDatat][2] = resultSet.getString("pasword");
                datap[jmlDatat][3] = resultSet.getString("ttl");
                datap[jmlDatat][4] = resultSet.getString("alamat");
                datap[jmlDatat][5] = resultSet.getString("desc");
                datap[jmlDatat][6] = resultSet.getString("jk");
                datap[jmlDatat][7] = resultSet.getString("username");
                jmlDatat++; 
                
            }
            return datap;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
