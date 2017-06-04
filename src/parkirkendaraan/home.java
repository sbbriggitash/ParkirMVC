package parkirkendaraan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Briggita
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        selectData();
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
        jLabel2 = new javax.swing.JLabel();
        Jkeluar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tiket = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Plat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tarif = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jmasuk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tkeluar = new com.toedter.calendar.JDateChooser();
        Tmasuk = new com.toedter.calendar.JDateChooser();
        Print = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        Mobil = new javax.swing.JRadioButton();
        Motor = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Nomor Tiket");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(Jkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 240, 40));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("Nomor Plat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(Tiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, 40));

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Jenis Kendaraan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(Plat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 240, 40));

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Jam Keluar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));
        getContentPane().add(Tarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 240, 40));

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Tanggal Keluar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("Tanggal Masuk");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));
        getContentPane().add(Jmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 240, 40));

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Jam Masuk");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("Tarif Harga");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        getContentPane().add(Tkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 240, 40));
        getContentPane().add(Tmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 240, 40));

        Print.setBackground(new java.awt.Color(255, 102, 51));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        getContentPane().add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 100, 40));

        Save.setBackground(new java.awt.Color(255, 102, 51));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, 40));

        Delete.setBackground(new java.awt.Color(255, 102, 51));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 100, 40));

        Clear.setBackground(new java.awt.Color(255, 102, 51));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 100, 40));

        Refresh.setBackground(new java.awt.Color(255, 102, 51));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 100, 40));

        Tabel.setBackground(new java.awt.Color(153, 204, 255));
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tiket", "Plat", "Jenis", "Tmasuk", "Jmasuk", "Tkeluar", "Jkeluar", "Tarif"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 790, 200));

        Mobil.setBackground(new java.awt.Color(255, 153, 51));
        buttonGroup1.add(Mobil);
        Mobil.setText("Mobil");
        getContentPane().add(Mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, 40));

        Motor.setBackground(new java.awt.Color(255, 153, 51));
        buttonGroup1.add(Motor);
        Motor.setText("Motor");
        getContentPane().add(Motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, 40));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("INPUT DATA KENDARAAN");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String masuk = dateFormat.format(Tmasuk.getDate());
        String keluar = dateFormat.format(Tkeluar.getDate());
        String Jenis = "";
            if(Motor.isSelected())
            {
                Jenis = "Motor";
            }
            else
            {
                Jenis = "Mobil";
            }
        
        if("".equals(Tiket.getText()) || "".equals(Plat.getText()) || Jenis.equals("") || masuk.equals("") || "".equals(Jmasuk.getText()) || keluar.equals("") || "".equals(Jkeluar.getText()) || "".equals(Tarif.getText()))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else
        {
            String SQL = "INSERT INTO input (Tiket,Plat,Jenis,Tmasuk,Jmasuk,Tkeluar,Jkeluar,Tarif) " + "VALUES ('"+Tiket.getText()+"', '"+Plat.getText()+"', '"+Jenis+"', '"+masuk+"', '"+Jmasuk.getText()+"', '"+keluar+"', '"+Jkeluar.getText()+"', '"+Tarif.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else
            {
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan!", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // TODO add your handling code here:
        int baris = Tabel.getSelectedRow();
        if(baris != -1)
        {
            Tiket.setText(Tabel.getValueAt(baris, 0).toString());
            Plat.setText(Tabel.getValueAt(baris, 1).toString());
            if("Motor".equals(Tabel.getValueAt(baris, 2).toString()))
            {
                Motor.setSelected(true);
            } else
            {
                Mobil.setSelected(true);
            }
            Tmasuk.setDate((Date) Tabel.getValueAt(baris, 3));
            Jmasuk.setText(Tabel.getValueAt(baris, 4).toString());
            Tkeluar.setDate((Date) Tabel.getValueAt(baris, 5));
            Jkeluar.setText(Tabel.getValueAt(baris, 6).toString());
            Tarif.setText(Tabel.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_TabelMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int baris = Tabel.getSelectedRow();
        if(baris != -1)
        {
            String Tiket = Tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM input WHERE Tiket='"+Tiket+"'";
            int status = KoneksiDB.execute(SQL);
            if(status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus!", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        Tiket.setText("");
        Plat.setText("");
        buttonGroup1.clearSelection();
        Tmasuk.setDate(null);
        Jmasuk.setText("");
        Tkeluar.setDate(null);
        Jkeluar.setText("");
        Tarif.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_RefreshActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Data Penitipan Kendaraan");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try
        {
            Tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch(java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_PrintActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Jkeluar;
    private javax.swing.JTextField Jmasuk;
    private javax.swing.JRadioButton Mobil;
    private javax.swing.JRadioButton Motor;
    private javax.swing.JTextField Plat;
    private javax.swing.JButton Print;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Save;
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField Tarif;
    private javax.swing.JTextField Tiket;
    private com.toedter.calendar.JDateChooser Tkeluar;
    private com.toedter.calendar.JDateChooser Tmasuk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void selectData()
    {
        String kolom[] = {"Tiket","Plat","Jenis","Tmasuk","Jmasuk","Tkeluar","Jkeluar","Tarif"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM input";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try
        {
            while(rs.next())
            {
                String Tiket = rs.getString(1);
                String Plat = rs.getString(2);
                String Jenis = "";
                    if("Motor".equals(rs.getString(3)))
                    {
                        Jenis = "Motor";
                    }
                    else
                    {
                        Jenis = "Mobil";
                    }
                String Tmasuk = rs.getString(4);
                String Jmasuk = rs.getString(5);
                String Tkeluar = rs.getString(6);
                String Jkeluar = rs.getString(7);
                String Tarif = rs.getString(8);
                String data[] = {Tiket,Plat,Jenis,Tmasuk,Jmasuk,Tkeluar,Jkeluar,Tarif};
                dtm.addRow(data);
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tabel.setModel(dtm);
    }
}
