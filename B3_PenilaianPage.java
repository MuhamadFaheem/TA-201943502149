/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author SUROTO
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
public class B3_PenilaianPage extends javax.swing.JFrame {

    /**
     * Creates new form FormPenilaian
     */
    public B3_PenilaianPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Input Patient Score Page");
        try{
            String sql = "select * from nilai_pasien";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel  tbm = (DefaultTableModel)jTable1.getModel();
            int co = rsmd.getColumnCount();
            String[] cona= new String[co];
            for(int i = 0;i<co;i++){
                cona[i]=rsmd.getColumnName(i+1);
                tbm.setColumnIdentifiers(cona);
                while(rs.next()){
                String kd = rs.getString(1);
                String na = rs.getString(2);
                String nf = String.valueOf(rs.getString(3));
                String nkh = String.valueOf(rs.getString(4));
                String nkt = String.valueOf(rs.getString(5));
                String nkb = String.valueOf(rs.getString(6));
                String tb[] = {kd,na,nf,nkh,nkt,nkb};
                tbm.addRow(tb);
                }
            }
        }catch(Exception a){
            System.out.println(a);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        combofasilitas = new javax.swing.JComboBox<>();
        combokehandalan = new javax.swing.JComboBox<>();
        comboketanggapan = new javax.swing.JComboBox<>();
        combokebersihan = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kode Pasien");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fasilitas");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Kehandalan");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ketanggapan");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Kebersihan");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Pasien", "Nama Pasien", "Fasilitas", "Kehandalan", "Ketanggapan", "Kebersihan"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combofasilitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        combokehandalan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        comboketanggapan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        combokebersihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jButton2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton2.setText("Hitung WASPAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(177, 177, 177)
                        .addComponent(jButton2)
                        .addGap(60, 60, 60)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(combofasilitas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combokehandalan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboketanggapan, 0, 134, Short.MAX_VALUE)
                            .addComponent(combokebersihan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1))
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combofasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combokehandalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboketanggapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combokebersihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{

            int nf=0; int nkh=0;int ntg=0;int nkb=0;
            String v = (String)combofasilitas.getSelectedItem();
            switch(v){
            case "1":
                nf=1;
            break;
            case "2":
                nf=2;
            break;
            case "3":
                nf=3;
            break;
            case "4":
                nf=4;
            break;
            }
            
            String va = (String)combokehandalan.getSelectedItem();
            switch(va){
            case "1":
                nkh=1;
            break;
            case "2":
                nkh=2;
            break;
            case "3":
                nkh=3;
            break;
            case "4":
                nkh=4;
            break;
            }
            
            String val = (String)comboketanggapan.getSelectedItem();
            switch(val){
            case "1":
                ntg=1;
            break;
            case "2":
                ntg=2;
            break;
            case "3":
                ntg=3;
            break;
            case "4":
                ntg=4;
            break;
            }
            
            String valu = (String)combokebersihan.getSelectedItem();
            switch(valu){
            case "1":
                nkb=1;
            break;
            case "2":
                nkb=2;
            break;
            case "3":
                nkb=3;
            break;
            case "4":
                nkb=4;
            break;
            }

            Statement stm = con.createStatement();
            String a = jTextField1.getText();
            String sql = "select * from data_pasien where kode_pasien like '" + a + "'";
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Kode pasien ada");
                sql = "select kode_pasien, nama_pasien from data_pasien where kode_pasien like '" + a + "'";
                rs = stm.executeQuery(sql);
                String nfasilitas = Integer.toString(nf);
                String nkhandalan = Integer.toString(nkh);
                String nketanggapan = Integer.toString(ntg);
                String nkebersihan = Integer.toString(nkb);
                String kd = "";
                String na = "";
               
                while(rs.next()){
                    kd = rs.getString("kode_pasien");
                    na = rs.getString("nama_pasien");
                    sql = "insert into nilai_pasien (kode_pasien,nama_pasien,nilai_fasilitas,nilai_kehandalan,nilai_ketanggapan,nilai_kebersihan) values (?,?,?,?,?,?)";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, kd);
                    ps.setString(2, na);
                    ps.setInt(3, nf);
                    ps.setInt(4, nkh);
                    ps.setInt(5, ntg);
                    ps.setInt(6, nkb);
                    int x = ps.executeUpdate();
                    if (x > 0) {
                        JOptionPane.showMessageDialog(null, "Your data succesfully registered");
                    }
                    String tb[] = {kd,na,nfasilitas,nkhandalan,nketanggapan,nkebersihan}; 
                    DefaultTableModel  tbm = (DefaultTableModel)jTable1.getModel();
                    tbm.addRow(tb);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Kode pasien tidak ada");
            }
            con.close();
        }catch(Exception a){
            //JOptionPane.showMessageDialog(null,"Ada yang salah"+a);
            System.out.println(a);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        B4_PerhitunganPage i = new B4_PerhitunganPage();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        B2_InputPasienPage i = new B2_InputPasienPage();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }     
    
//    JDateChooser chooser = new JDateChooser();
//        chooser.getDate();
//        chooser.setDateFormatString("yyyy-mm-dd");
//        String a = ((JTextField)chooser.getDateEditor().getUiComponent()).getText();
//        jTextField1.setText(a);
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(B3_PenilaianPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B3_PenilaianPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B3_PenilaianPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B3_PenilaianPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B3_PenilaianPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> combofasilitas;
    private javax.swing.JComboBox<String> combokebersihan;
    private javax.swing.JComboBox<String> combokehandalan;
    private javax.swing.JComboBox<String> comboketanggapan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
