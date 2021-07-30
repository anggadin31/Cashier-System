package Apps;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dbss037
 */
public class AmiraShop extends javax.swing.JFrame {

    private Connection con;

    /**
     * Creates new form AmiraShop
     */
    public AmiraShop() throws SQLException, ClassNotFoundException {
        initComponents();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        restock = new javax.swing.JFrame();
        ID_supp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID_prod = new javax.swing.JTextField();
        nama_Pr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jml_Pr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga_Pr = new javax.swing.JTextField();
        submitRestock = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        stokProduk = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produk = new javax.swing.JTable();
        tombolTAMPILKAN = new javax.swing.JButton();
        tombolRESTOCK = new javax.swing.JButton();
        tombolTRANSAKSI = new javax.swing.JButton();
        tambah = new javax.swing.JButton();

        ID_supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_suppActionPerformed(evt);
            }
        });

        jLabel1.setText("ID_SUPP");

        jLabel2.setText("ID_PROD");

        ID_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_prodActionPerformed(evt);
            }
        });

        nama_Pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_PrActionPerformed(evt);
            }
        });

        jLabel3.setText("NAMA_PRODUK");

        jLabel4.setText("JUMLAH_PRODUK");

        jml_Pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml_PrActionPerformed(evt);
            }
        });

        jLabel5.setText("HARGA_PRODUK");

        submitRestock.setText("SUBMIT");
        submitRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRestockActionPerformed(evt);
            }
        });

        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout restockLayout = new javax.swing.GroupLayout(restock.getContentPane());
        restock.getContentPane().setLayout(restockLayout);
        restockLayout.setHorizontalGroup(
            restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockLayout.createSequentialGroup()
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(restockLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ID_supp)
                            .addComponent(ID_prod)
                            .addComponent(nama_Pr)
                            .addComponent(jml_Pr)
                            .addComponent(harga_Pr, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addGroup(restockLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(submitRestock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(Update)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        restockLayout.setVerticalGroup(
            restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jml_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(harga_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitRestock)
                    .addComponent(Update))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabel6.setText("PRODUK");

        produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PRODUK", "NAMA_PRODUK", "JUMLAH_PRODUK", "HARGA_PRODUK"
            }
        ));
        jScrollPane1.setViewportView(produk);

        javax.swing.GroupLayout stokProdukLayout = new javax.swing.GroupLayout(stokProduk.getContentPane());
        stokProduk.getContentPane().setLayout(stokProdukLayout);
        stokProdukLayout.setHorizontalGroup(
            stokProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stokProdukLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(stokProdukLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stokProdukLayout.setVerticalGroup(
            stokProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stokProdukLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tombolTAMPILKAN.setText("STOK PRODUK");
        tombolTAMPILKAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTAMPILKANActionPerformed(evt);
            }
        });

        tombolRESTOCK.setText("RESTOCK");
        tombolRESTOCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolRESTOCKActionPerformed(evt);
            }
        });

        tombolTRANSAKSI.setText("TRANSAKSI");
        tombolTRANSAKSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTRANSAKSIActionPerformed(evt);
            }
        });

        tambah.setText("TAMBAH PRODUK");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tombolTAMPILKAN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolRESTOCK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolTRANSAKSI)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolTAMPILKAN)
                    .addComponent(tombolRESTOCK)
                    .addComponent(tombolTRANSAKSI)
                    .addComponent(tambah))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void ID_suppActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void ID_prodActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void nama_PrActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jml_PrActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void submitRestockActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        try {
            String sql = "insert into memasok (ID_supp, ID_prod, nama_Pr, jml_Pr,harga_Pr) "
                    + "values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID_supp.getText());
            pst.setString(2, ID_prod.getText());
            pst.setString(3, nama_Pr.getText());
            pst.setString(4, jml_Pr.getText());
            pst.setString(5, harga_Pr.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Success");
        } catch (SQLException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                             

    private void tombolRESTOCKActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Restock restock;
        try {
            restock = new Restock();
            restock.setVisible(true);
            close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                             

    private void tombolTAMPILKANActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        Tampilkan produk;
        try {
            produk = new Tampilkan();
            produk.setVisible(true);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                               

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String sql2 = "update Produk set jml_Pr=Produk.jml_Pr+" + jml_Pr.getText() + "from dbo.memasok where Produk.ID_Pr=memasok.ID_Prod";
        Statement pst2;
        try {
            pst2 = con.createStatement();
            pst2.addBatch(sql2);
            pst2.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Tambah tambah;
        try {
            tambah = new Tambah();
            tambah.setVisible(true);
            close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void tombolTRANSAKSIActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        Transaksi trans = new Transaksi();
        trans.setVisible(true);
        close();
    }                                               

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
            java.util.logging.Logger.getLogger(AmiraShop.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmiraShop.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmiraShop.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmiraShop.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AmiraShop().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AmiraShop.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField ID_prod;
    private javax.swing.JTextField ID_supp;
    private javax.swing.JButton Update;
    private javax.swing.JTextField harga_Pr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jml_Pr;
    private javax.swing.JTextField nama_Pr;
    private javax.swing.JTable produk;
    private javax.swing.JFrame restock;
    private javax.swing.JFrame stokProduk;
    private javax.swing.JButton submitRestock;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tombolRESTOCK;
    private javax.swing.JButton tombolTAMPILKAN;
    private javax.swing.JButton tombolTRANSAKSI;
    // End of variables declaration                   
}