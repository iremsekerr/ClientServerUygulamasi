package clientserverapplication;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ServerUygulamasi extends javax.swing.JFrame {

    public ServerUygulamasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")// bu kısımda guı arayüzü için gerekli tanımlamalar bulunuyor
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        portNoGiris_Server = new javax.swing.JTextField();
        baslat_Server = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        veriGirisi_Server = new javax.swing.JTextArea();
        gonder_Server = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chat_Server = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Uygulaması");
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Dinlenecek Port Numarası:");

        portNoGiris_Server.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        baslat_Server.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        baslat_Server.setText("Serverı Başlat");
        baslat_Server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslat_ServerActionPerformed(evt);
            }
        });

        veriGirisi_Server.setColumns(20);
        veriGirisi_Server.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        veriGirisi_Server.setRows(5);
        jScrollPane1.setViewportView(veriGirisi_Server);

        gonder_Server.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        gonder_Server.setText("GÖNDER");
        gonder_Server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonder_ServerActionPerformed(evt);
            }
        });

        chat_Server.setColumns(20);
        chat_Server.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chat_Server.setRows(5);
        jScrollPane2.setViewportView(chat_Server);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("  SERVER UYGULAMASI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gonder_Server))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(portNoGiris_Server, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(baslat_Server)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(portNoGiris_Server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baslat_Server))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(gonder_Server, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Bu metot bir ServerSocket oluşturur ve bunu kullanıcı tarafından girilen porta bağlar,
// ardından clientın bağlantısını bekler. Bir client bağlandığında clientla iletişim için yeni bir thread oluşturur
    private void baslat_ServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslat_ServerActionPerformed
        port = Integer.parseInt(portNoGiris_Server.getText()); //portun tanımlamasını yapıyoruz
        tarihVeSaat = new Date();//log dosyası için tarih ve saat değişkenini oluşturduk
        SimpleDateFormat tarihVeSaatFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss") ; // tarih ve saatin hangi formatlarda yazılacağını belirttik
        String tarihVeSaatStr = tarihVeSaatFormat.format(tarihVeSaat);
        try { // try catch ile socket ve port bağlantısını kontrol ettik
            serverSocket = new ServerSocket(port); // serversocketimizi oluşturduk ve içerisine portu gönderdik
            socket = serverSocket.accept(); // serverSocket nesnesinin accept metodnu çağırdık ve döndürülen Socket nesnesini socket değişkeninde tuttuk.Bu işlemi dinlemek için yaptık
// Bu Socket nesnesi servera yeni bağlanan clientla iletişimde kullanılacak .
            setTitle("Bağlantı Sağlandı: " + socket.getInetAddress().getHostAddress() + ":" + socket.getPort()); // bağlantının başarılı olduğunu belirttik
            writer = new PrintWriter(socket.getOutputStream(), true); //socket bağlantısının uzak çıkışına mesajlarımızı iletebilmek için getoutputstream metodunu çağırdık. ve bunu da writr değişkenine atadık
            scanner = new Scanner(socket.getInputStream());//socket bağlantısı üzerinden verileri alabilmek için (yani mesajlarımızı) getınputstream metodunu çağırıp bunu da scanner değişkenine atadık
            Thread t = new Thread(new Runnable() {// threadimizi tanımladık. bizim  thread kullanma amacımız programın threadsiz olarak kilitlenme yaşaması.
                @Override
                public void run() { 
                    while (true) {
                        
                        try {
                            String input = scanner.nextLine(); // input değişkenine scannerı satır satır alıp atadık.
                            if(!input.trim().equals("")){ // input içerisinde başta ve sonra boşluk karakteri yoksa ve boş değilse yazdırma işlemleerini gerçekleştirecek
                        chat_Server.append("Client: " + input + "\n"); // serverın textArea sına clienttan gelen mesajları yazdırdık
                            if(!input.contains("(sifreli):")){ // sifrelenmis mesajları log dosyasına yazdırmak istemediğimiz için (sifreli) ile başlamıyorsa yazdırma işlemlerini gerçekleştirecek
                            File dosya = new File("mesajlar.txt");// text dosyasına yazdırdık
                            FileWriter yazici = new FileWriter(dosya, true);// filewriter ile yazdırma işlemimizi gerçekleştirdik
                            BufferedWriter yaz = new BufferedWriter(yazici); //
                            yaz.write(String.format("[%s][Client][%s]\n", tarihVeSaatStr, input)); //içeriğin yazılacağı formatı belirttik
                            yaz.close();// bufferedwrieterı kapattık
                            }
                            }
                        } catch (Exception hata) { // yazm aişlemi gerçekleşmezse hata fırlattık
                            hata.printStackTrace();
                        }
                    }
                }
            });
            t.start();// threadi başlattık
        } catch (BindException e) { // port kullanılıyorsa bağlanılamayacağını belirttiğimiz hatayı attık
            // Handle the exception here
            JOptionPane.showMessageDialog(null, "Hata: Bu port kullanıldığından dolayı dinlenemez!!", "Hata", JOptionPane.ERROR_MESSAGE);
             return;
        } catch (IOException ex) { 
            Logger.getLogger(ServerUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_baslat_ServerActionPerformed

    //Server tarafından mesaj göndermek için gönder butonuna tıklandığında çalışacak olan metod
    private void gonder_ServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonder_ServerActionPerformed
        String mesaj = veriGirisi_Server.getText(); // textfield a girilen mesajı alır
        chat_Server.append("Server: " + mesaj + "\n"); // textareaya server tarafından gönderilen mesajı yazar
        String sifrelenmis_mesaj = asciisif.sifreleme(mesaj, 5); // Asciisifreleme sınıfından oluşturdğumuz asciisif nesnesiyle mesajımızı 5 birim kaydırma parametresiyle şifreledik
        writer.write("\n(sifreli):" + sifrelenmis_mesaj); // mesajın şifreli halini ekrana yazdırdık
        AsciiSifreleme sifrele_coz = new AsciiSifreleme();//şifrelenmiş mesajı çözmek için yine asciisifreleme sınıfından nesne oluşturduk
        mesaj = sifrele_coz.cozumleme(sifrelenmis_mesaj,5); // oluşturduğumuz nesne üzerinden cozumleme metodunu çağırarak mesajı çözümledik
        writer.write("\n Server(cozulmus) - "); // çözülmüş mesajı ekrana yazdırdık
        writer.flush();
        writer.println(mesaj);
        veriGirisi_Server.setText(""); // textareayı boşalttık
        tarihVeSaat = new Date();
        SimpleDateFormat tarihVeSaatFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String tarihVeSaatStr = tarihVeSaatFormat.format(tarihVeSaat);
        try {// log dosyasına yazma işlemleri
            veriGirisi_Server.setText("");
            File dosya = new File("mesajlar.txt");
            FileWriter yazici = new FileWriter(dosya, true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write(String.format("[%s][Server][%s]\n", tarihVeSaatStr, mesaj));
            yaz.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_gonder_ServerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerUygulamasi().setVisible(true); // server penceresini çağırıp görünür yaptık
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baslat_Server;
    private static javax.swing.JTextArea chat_Server;
    private javax.swing.JButton gonder_Server;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField portNoGiris_Server;
    private javax.swing.JTextArea veriGirisi_Server;
    // End of variables declaration//GEN-END:variables
    int port; // sınıf değişkenlerininin tanımlanması
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter writer;
    private Scanner scanner;
    Date tarihVeSaat;
    String clientGelen;
  
    AsciiSifreleme asciisif = new AsciiSifreleme(); // şifreleme için nesne oluşturulması
}
