package Perpustakaan;
/*
Kalvina Gabriella
*/

import java.awt.Image; 
import java.awt.Toolkit;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUD extends javax.swing.JFrame {
    
    /*
    Creates new form databaseperpustakaan
     */
    private void Kosongkan_Form() {
        txtKode.setEditable(true);
        txtKode.setText(null);
        txtJudul.setText(null);
        txtPenulis.setText(null);
        txtPenerbit.setText(null);
        txtLokasi.setText(null);
        txtStok.setText(null);

    }

    private void Tampilkan_Data() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("Kode Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Genre");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Lokasi");
        model.addColumn("Stok");

        try {

            int no = 1;
            String sql = "SELECT * FROM perpustakaan where kode like '%"
                    + txtCari.getText() + "%'"
                    + "or judul_buku like '%" + txtCari.getText()
                    + "%'" + "or penulis_buku like '%" + txtCari.getText()
                    + "%'" + "or penerbit_buku like '%" + txtCari.getText()
                    + "%'" + "or lokasi_buku like '%" + txtCari.getText()
                    + "%'" + "or stok_buku like '%" + txtCari.getText()+ "%'";;
            java.sql.Connection conn = (Connection) Connector.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)});
            }
            TabPerpustakaan.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());

        }

    }

    /**
     * Creates new form CRUD
     */
    public CRUD() {
        initComponents();
        //Menampilkan icon gambar
       /* Image icon = Toolkit.getDefaultToolkit().getImage("src/gambar/buku.jpg");
        setIconImage(icon); */
                
        
        
        Tampilkan_Data();
        Kosongkan_Form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtKode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGenre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPenulis = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtLokasi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabPerpustakaan = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 153));
        getContentPane().setLayout(null);

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtKode);
        txtKode.setBounds(108, 58, 269, 20);

        jLabel1.setText("Kode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 61, 70, 14);

        jLabel2.setText("Judul Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 92, 70, 14);

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });
        getContentPane().add(txtJudul);
        txtJudul.setBounds(107, 89, 269, 20);
        
        jLabel3.setText("Genre ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 126, 70, 14);


        jLabel4.setText("Penulis Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 154, 70, 14);

        jLabel5.setText("Penerbit Buku");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(107, 123, 269, 20);
        
        getContentPane().add(txtPenulis);
        txtPenulis.setBounds(107, 154, 269, 20);

        txtPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(107, 185, 269, 20);

        txtLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLokasiActionPerformed(evt);
            }
        });
        getContentPane().add(txtLokasi);
        txtLokasi.setBounds(107, 215, 269, 20);

        jLabel6.setText("Lokasi Buku");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 185, 70, 14);

        btnSave.setBackground(new java.awt.Color(255, 204, 204));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(413, 186, 80, 23);

        btnEdit.setBackground(new java.awt.Color(255, 204, 204));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(534, 186, 80, 23);

        btnCancel.setBackground(new java.awt.Color(255, 204, 204));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(413, 220, 80, 23);

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(530, 220, 80, 23);

        TabPerpustakaan.setBackground(new java.awt.Color(255, 204, 255));
        TabPerpustakaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabPerpustakaan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabPerpustakaanAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TabPerpustakaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabPerpustakaanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabPerpustakaan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(19, 253, 595, 206);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(19, 477, 51, 23);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(549, 477, 65, 23);
        getContentPane().add(txtCari);
        txtCari.setBounds(371, 478, 160, 20);

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Perpustakaan Yogyakarta");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(108, 11, 320, 41);

        jLabel8.setText("Stok Buku");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(19, 226, 70, 14);

        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });
        getContentPane().add(txtStok);
        txtStok.setBounds(107, 223, 269, 20);

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, -70, 1141, 575);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPenerbitActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLokasiActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            String sql = " INSERT INTO perpustakaan VALUES ('" + txtKode.getText() 
                    + "','" + txtJudul.getText() 
                    + "','" + txtGenre.getText()
                    + "','" + txtPenulis.getText()
                    + "','"+ txtPenerbit.getText()
                    + "','"+ txtLokasi.getText()
                    + "','"+ txtStok.getText() + "')";
            java.sql.Connection conn = (Connection) Connector.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Berhasil");
            Tampilkan_Data();
            Kosongkan_Form();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Kosongkan_Form();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void TabPerpustakaanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabPerpustakaanAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TabPerpustakaanAncestorAdded

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try {          
            String sql = "SELECT * FROM perpustakaan where kode like '%"
                    + txtCari.getText() + "%'"
                    + "or judul_buku like '%" + txtCari.getText()
                    + "%'" + "or genre_buku like '%" + txtCari.getText()
                    + "%'" + "or penulis_buku like '%" + txtCari.getText()
                    + "%'" + "or penerbit_buku like '%" + txtCari.getText()
                    + "%'" + "or lokasi_buku like '%" + txtCari.getText()
                    + "%'" + "or stok_buku like '%" + txtCari.getText() + "%'";
            
            java.sql.Connection conn = (Connection) Connector.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
           
        } catch (HeadlessException | SQLException e) {
           
        }
        Tampilkan_Data();
        Kosongkan_Form();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM perpustakaan WHERE kode ='" + txtKode.getText() + "'";
            java.sql.Connection conn = (Connection) Connector.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "HAPUS DATA BERHASIL...");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        Tampilkan_Data();
        Kosongkan_Form();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE perpustakaan SET kode='" + txtKode.getText()
                    + "',judul_buku='" + txtJudul.getText() 
                    + "',genre_buku='" + txtGenre.getText()
                    + "',penulis_buku='" + txtPenulis.getText()
                    + "',penerbit_buku='" + txtPenerbit.getText()
                    + "',lokasi_buku='" + txtLokasi.getText()
                    + "',stok_buku='" + txtStok.getText()
                    + "' WHERE kode = '" + txtKode.getText() + "'";
            java.sql.Connection conn = (Connection) Connector.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "EDIT DATA BERHASIL...");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        Tampilkan_Data();
        Kosongkan_Form();
    }//GEN-LAST:event_btnEditActionPerformed

    private void TabPerpustakaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabPerpustakaanMouseClicked
        // TODO add your handling code here:
        int baris = TabPerpustakaan.rowAtPoint(evt.getPoint());
        String kode = TabPerpustakaan.getValueAt(baris, 1).toString();
        txtKode.setText(kode);

        String judul = TabPerpustakaan.getValueAt(baris, 2).toString();
        txtJudul.setText(judul);
        
        String genre = TabPerpustakaan.getValueAt(baris, 3).toString();
        txtGenre.setText(genre);

        String penulis = TabPerpustakaan.getValueAt(baris, 4).toString();
        txtPenulis.setText(penulis);

        String penerbit = TabPerpustakaan.getValueAt(baris, 5).toString();
        txtPenerbit.setText(penerbit);

        String lokasi = TabPerpustakaan.getValueAt(baris, 6).toString();
        txtLokasi.setText(lokasi);
        
        String stok = TabPerpustakaan.getValueAt(baris, 7).toString();
        txtStok.setText(stok);
    }//GEN-LAST:event_TabPerpustakaanMouseClicked

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabPerpustakaan;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
