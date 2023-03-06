package clientserverapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClientUygulamasi extends javax.swing.JFrame {

    public ClientUygulamasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gonder_Client = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        portNoGiris_Client = new javax.swing.JTextField();
        baglan_Client = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        veriGirisi_Client = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ipGiris_Client = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chat_Client = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        gonder_Client.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        gonder_Client.setText("GÖNDER");
        gonder_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonder_ClientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Server İp:");

        portNoGiris_Client.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        baglan_Client.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        baglan_Client.setText("Bağlan");
        baglan_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baglan_ClientActionPerformed(evt);
            }
        });

        veriGirisi_Client.setColumns(20);
        veriGirisi_Client.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        veriGirisi_Client.setRows(5);
        jScrollPane1.setViewportView(veriGirisi_Client);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Port No:");

        ipGiris_Client.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ipGiris_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipGiris_ClientActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("  CLİENT UYGULAMASI");

        chat_Client.setColumns(20);
        chat_Client.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chat_Client.setRows(5);
        jScrollPane2.setViewportView(chat_Client);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gonder_Client))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ipGiris_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portNoGiris_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(baglan_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(portNoGiris_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baglan_Client)
                    .addComponent(jLabel2)
                    .addComponent(ipGiris_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(gonder_Client, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // gönder butonuna basılınca oluşacak action
    private void gonder_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonder_ClientActionPerformed
          //veriGirisi_Client olarak adlandırdığımız textArea içerisine yazılan girdiyi
        //String gelenYazi değişkenine atıyoruz ve trim() metotu yardımıyla 
        //girdinin baştaki ve sondaki boşluk karakterlerini kaldırıyoruz:
        String gelenYazi = veriGirisi_Client.getText().trim();
        tarihVeSaat = new Date();
        SimpleDateFormat tarihVeSaatFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String tarihVeSaatStr = tarihVeSaatFormat.format(tarihVeSaat);
        //if kontrolu kullanmamızın nedeni mesaj göndermeden önce textArea içerisi boş olmasından
        //dolayı bu boşluğuda mesaj olarak ekrana yazdırıyordu, bunun önüne geçmek için bir
        //if kontrolü sağladık:
        if (!gelenYazi.equals("")) {
            //Client'in kendi yolladığı mesajı append komutuyla chat_Client textAreasına yazdırdık:
            chat_Client.append("Client: " + veriGirisi_Client.getText() + "\n");
            //Mesajı ascii sifreleme sinifiyla sifreleme islemleri:
            String mesaj = veriGirisi_Client.getText();
            //Aldığımız mesajı ve kaydırma değerini sifreleme metotuna yolladık:
            String sifreli_mesaj = asciisif.sifreleme(mesaj, 5);
            //Veri Girisinin içini boşalttık böylece her mesaj sonrası boş bir ekrana tekrar
            //mesaj yazılabilir:
            veriGirisi_Client.setText("");
            print_writer.write("\n(sifreli):" + sifreli_mesaj);
            //cozümleme metodu ile çözümlüyoruz:
            mesaj = asciisif.cozumleme(sifreli_mesaj, 5);
            //Cözülmüs mesaj printwriter nesnesinin writer ile ekrana yazılır:
            print_writer.write("\nClient(cözülmüs) - " + mesaj);
            print_writer.flush();
            print_writer.println(veriGirisi_Client.getText());
            //Clientin kendi gönderdiği mesajların dosyaya yazılması:
            String text = veriGirisi_Client.getText();
            try {
                File dosya = new File("mesajlar.txt");
                FileWriter yazici = new FileWriter(dosya, true);
                BufferedWriter yaz = new BufferedWriter(yazici);
                yaz.write(String.format("[%s][Client][%s]\n", tarihVeSaatStr, mesaj));
                yaz.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        
        
    }//GEN-LAST:event_gonder_ClientActionPerformed

    // bağlan butonuna basınca oluşacak action
    private void baglan_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baglan_ClientActionPerformed
           //portNoGiris ve ipGiris isimli textField'dan kullanıcının girdiği değerleri getText metotuyla aldık:
        port = Integer.parseInt(portNoGiris_Client.getText());
        host = ipGiris_Client.getText();

        //Dosya işlemlerinde her kullanıcının gönderdiği tarih ve saat tutulacağı için gerekli tanımlamaları
        //oluşturduk:
        tarihVeSaat = new Date();
        SimpleDateFormat tarihVeSaatFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String tarihVeSaatStr = tarihVeSaatFormat.format(tarihVeSaat);

        try {
            //Socket nesnesi oluşturularak bu nesne üzerinden host adresi ve 
            //port numarası ile bağlanacak socketi oluşturuyoruz:
            socket = new Socket(host, port);
            //PrintWriter nesnesi oluşturarak socket üzerinden veri gönderiyoruz:
            print_writer = new PrintWriter(socket.getOutputStream(), true);
            //Scanner nesnesi oluşturarak socket üzerinden veri alıyoruz:
            scanner = new Scanner(socket.getInputStream());
            //Yeni Thread oluşturarak, bu thread'in içine bir Runnable nesnesi verdik ve run() metodunu override ettik
            //metodun içerisine döngü oluşturduk, bu döngü sonsuza kadar süreceğinden dolayı
            //Thread'in run() metodu sonsuza kadar çalışmaya devam edeceğinden dolayı kilitlenme yaşanmayacaktır:
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    //bir sunucudan gelen mesajları algılamak için bir döngü içinde çalışır. 
                    //Döngü sürekli olarak çalışır ve sunucudan gelen mesajları algılar.
                    while (true) {
                        try {
                            //Serverdan gelen mesajlar girdi değişkenine atanır:
                            String girdi = scanner.nextLine();
                            //if koşuluyla sunucudan gelen mesajın boş olup olmadığını kontrol ediyoruz: 
                            if (!girdi.trim().equals("")) {
                                //Eğer mesaj boş değilse, chat_Client textAreasına "Server: " + girdi şeklinde ekler:
                                chat_Client.append("Server: " + girdi + "\n");
                                //Eğer mesaj "(sifreli):" içeriyorsa, dosyaya yazılmamasını istiyorum:
                                if (!girdi.contains("(sifreli):")) {
                                    File dosya = new File("mesajlar.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write(String.format("[%s][Server][%s]\n", tarihVeSaatStr, girdi));
                                    yaz.close();
                                }
                            }
                        } catch (Exception hata) {
                            JOptionPane.showMessageDialog(null, "Server Çalışmayı Durdurdu!", "Hata", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
            t.start(); //Thread nesnesi "start()" metodu ile çalıştırıyoruz:
        } catch (BindException e) {
            //Dolu port numarası girilirse hata mesajı ekrana yazılır:
            JOptionPane.showMessageDialog(null, "Hata: Bu port kullanıldığından dolayı bağlanılamaz!!", "Hata", JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex) {
            Logger.getLogger(ClientUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }//GEN-LAST:event_baglan_ClientActionPerformed

    private void ipGiris_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipGiris_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipGiris_ClientActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baglan_Client;
    private javax.swing.JTextArea chat_Client;
    private javax.swing.JButton gonder_Client;
    private javax.swing.JTextField ipGiris_Client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField portNoGiris_Client;
    private javax.swing.JTextArea veriGirisi_Client;
    // End of variables declaration//GEN-END:variables
    int port; // sınıf değişkenlerinin oluşturulması 
    String host;
    private Socket socket;
    private PrintWriter print_writer;
    private Scanner scanner;
    Date tarihVeSaat;
    AsciiSifreleme asciisif = new AsciiSifreleme(); // şifreleme işlemi için nesne oluşturulması
}