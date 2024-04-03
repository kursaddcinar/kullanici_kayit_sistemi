import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class kullanici_kayit_sistemi extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    public kullanici_kayit_sistemi() {
        //String[] eleman;
        int kisi=0;
        initComponents();
        int index=0;
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        hkc098_jLabel1 = new javax.swing.JLabel();
        hkc098_jLabel2 = new javax.swing.JLabel();
        hkc098_jLabel3 = new javax.swing.JLabel();
        hkc098_jLabel4 = new javax.swing.JLabel();
        hkc098_jLabel5 = new javax.swing.JLabel();
        hkc098_jLabel6 = new javax.swing.JLabel();
        hkc098_jLabel7 = new javax.swing.JLabel();
        hkc098_jLabel8 = new javax.swing.JLabel();
        hkc098_jTextField1 = new javax.swing.JTextField();
        hkc098_jTextField2 = new javax.swing.JTextField();
        hkc098_jTextField3 = new javax.swing.JTextField();
        hkc098_jTextField4 = new javax.swing.JTextField();
        hkc098_jRadioButton1 = new javax.swing.JRadioButton();
        hkc098_jRadioButton2 = new javax.swing.JRadioButton();
        hkc098_jButton1 = new javax.swing.JButton();
        hkc098_jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        hkc098_jTextArea1 = new javax.swing.JTextArea();
        hkc098_jMenuBar1 = new javax.swing.JMenuBar();
        hkc098_jMenu1 = new javax.swing.JMenu();
        hkc098_jMenuItem1 = new javax.swing.JMenuItem();
        hkc098_jMenuItem2 = new javax.swing.JMenuItem();
        hkc098_jMenu2 = new javax.swing.JMenu();
        hkc098_jMenu3 = new javax.swing.JMenu();
        hkc098_jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("211213098");

        hkc098_jLabel1.setText("Kullanıcı Bilgileri");

        hkc098_jLabel2.setText("Ad");

        hkc098_jLabel3.setText("Soyad");

        hkc098_jLabel4.setText("Telefon");

        hkc098_jLabel5.setText("E-posta");

        hkc098_jLabel6.setText("Cinsiyet");

        hkc098_jLabel7.setText("İl");

        hkc098_jLabel8.setText("Kullanıcı Listesi");

        buttonGroup1.add(hkc098_jRadioButton1);
        hkc098_jRadioButton1.setText("Erkek");
        hkc098_jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hkc098_jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(hkc098_jRadioButton2);
        hkc098_jRadioButton2.setText("Kadın");

        hkc098_jButton1.setText("Listeye Ekle");
        hkc098_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hkc098_jButton1ActionPerformed(evt);
            }
        });

        hkc098_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İl Seçiniz...", "Adana", "Ankara", "Bursa", "Denizli", "Edirne", "Giresun", "Hatay", "İstanbul", "İzmir", "Konya", "Mersin", "Osmaniye", "Rize", "Van" }));
        hkc098_jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hkc098_jComboBox1ActionPerformed(evt);
            }
        });

        hkc098_jTextArea1.setColumns(20);
        hkc098_jTextArea1.setRows(5);
        jScrollPane1.setViewportView(hkc098_jTextArea1);

        hkc098_jMenu1.setText("Dosya");

        hkc098_jMenuItem1.setText("Aç");
        hkc098_jMenu1.add(hkc098_jMenuItem1);

        hkc098_jMenuItem2.setText("Kaydet");
        hkc098_jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hkc098_jMenuItem2ActionPerformed(evt);
            }
        });
        hkc098_jMenu1.add(hkc098_jMenuItem2);

        hkc098_jMenuBar1.add(hkc098_jMenu1);

        hkc098_jMenu2.setText("Düzenle");
        hkc098_jMenuBar1.add(hkc098_jMenu2);

        hkc098_jMenu3.setText("Görüntü");
        hkc098_jMenuBar1.add(hkc098_jMenu3);

        hkc098_jMenu4.setText("Yardım");
        hkc098_jMenuBar1.add(hkc098_jMenu4);

        setJMenuBar(hkc098_jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hkc098_jLabel7)
                            .addComponent(hkc098_jLabel5)
                            .addComponent(hkc098_jLabel4)
                            .addComponent(hkc098_jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hkc098_jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hkc098_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hkc098_jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(hkc098_jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hkc098_jTextField3, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(hkc098_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hkc098_jButton1)))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hkc098_jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hkc098_jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(hkc098_jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hkc098_jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hkc098_jLabel8))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(hkc098_jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hkc098_jLabel2)
                            .addComponent(hkc098_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hkc098_jLabel3)
                            .addComponent(hkc098_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hkc098_jLabel4)
                            .addComponent(hkc098_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hkc098_jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hkc098_jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hkc098_jLabel6)
                            .addComponent(hkc098_jRadioButton1)
                            .addComponent(hkc098_jRadioButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(hkc098_jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hkc098_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hkc098_jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(hkc098_jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hkc098_jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hkc098_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hkc098_jRadioButton1ActionPerformed

    private void hkc098_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hkc098_jButton1ActionPerformed
        int index=0;
        
        String eleman ="AD: "+hkc098_jTextField1.getText()+"  Soyad: "+hkc098_jTextField2.getText()+"  Telefon: "+hkc098_jTextField3.getText()+"  E-posta: "+hkc098_jTextField4.getText()+" Sehir: "+hkc098_jComboBox1.getSelectedItem().toString();
        if(hkc098_jRadioButton1.isSelected()){
            eleman+="  Cinsiyet: "+ hkc098_jRadioButton1.getText();
        }
        else eleman+="  Cinsiyet: "+ hkc098_jRadioButton2.getText();
        
        hkc098_jTextArea1.append("\n"+eleman);
        index++;
    }//GEN-LAST:event_hkc098_jButton1ActionPerformed

    private void hkc098_jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hkc098_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jFileChooser1.setVisible(true);
        FileWriter fw = null;
        try {
            fw = new FileWriter("kisi.txt",true);
        } catch (IOException ex) {
            System.err.println("dosya acilmadi");
        }
        
        try {
            fw.write(hkc098_jTextArea1.getText());
        } catch (IOException ex) {
            System.err.println("hata");
        }
        
        
    }//GEN-LAST:event_hkc098_jMenuItem2ActionPerformed

    private void hkc098_jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hkc098_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hkc098_jComboBox1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_kayit_sistemi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton hkc098_jButton1;
    private javax.swing.JComboBox<String> hkc098_jComboBox1;
    private javax.swing.JLabel hkc098_jLabel1;
    private javax.swing.JLabel hkc098_jLabel2;
    private javax.swing.JLabel hkc098_jLabel3;
    private javax.swing.JLabel hkc098_jLabel4;
    private javax.swing.JLabel hkc098_jLabel5;
    private javax.swing.JLabel hkc098_jLabel6;
    private javax.swing.JLabel hkc098_jLabel7;
    private javax.swing.JLabel hkc098_jLabel8;
    private javax.swing.JMenu hkc098_jMenu1;
    private javax.swing.JMenu hkc098_jMenu2;
    private javax.swing.JMenu hkc098_jMenu3;
    private javax.swing.JMenu hkc098_jMenu4;
    private javax.swing.JMenuBar hkc098_jMenuBar1;
    private javax.swing.JMenuItem hkc098_jMenuItem1;
    private javax.swing.JMenuItem hkc098_jMenuItem2;
    private javax.swing.JRadioButton hkc098_jRadioButton1;
    private javax.swing.JRadioButton hkc098_jRadioButton2;
    private javax.swing.JTextArea hkc098_jTextArea1;
    private javax.swing.JTextField hkc098_jTextField1;
    private javax.swing.JTextField hkc098_jTextField2;
    private javax.swing.JTextField hkc098_jTextField3;
    private javax.swing.JTextField hkc098_jTextField4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
