/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project1_perpustakaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project1_perpustakaan.DatabaseKoneksi.DatabaseConnection;

/**
 *
 * @author Arnella
 */
public class DataBuku extends javax.swing.JFrame {

    /**
     * Creates new form DataBuku
     */
    public DataBuku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        layoutDataBuku = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        perbarui = new javax.swing.JButton();
        tampil = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        namaPengarang = new javax.swing.JTextField();
        kodeBuku = new javax.swing.JTextField();
        judulBuku = new javax.swing.JTextField();
        penerbit = new javax.swing.JTextField();
        jumlahHalaman = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tahunTerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDatabaseBuku = new javax.swing.JTable();
        cariText = new javax.swing.JTextField();
        cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_perpustakaan/2.png"))); // NOI18N

        layoutDataBuku.setBackground(new java.awt.Color(153, 204, 255));
        layoutDataBuku.setMinimumSize(new java.awt.Dimension(0, 0));
        layoutDataBuku.setPreferredSize(new java.awt.Dimension(800, 450));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kode Buku");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Judul Buku");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nama Pengarang");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Penerbit");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Jumlah Halaman");

        tambah.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        tambah.setForeground(new java.awt.Color(0, 51, 102));
        tambah.setText("Tambah ");
        tambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        simpan.setForeground(new java.awt.Color(0, 51, 102));
        simpan.setText("Simpan");
        simpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        hapus.setForeground(new java.awt.Color(0, 51, 102));
        hapus.setText("Hapus");
        hapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        perbarui.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        perbarui.setForeground(new java.awt.Color(0, 51, 102));
        perbarui.setText("Perbarui");
        perbarui.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perbaruiActionPerformed(evt);
            }
        });

        tampil.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        tampil.setForeground(new java.awt.Color(0, 51, 102));
        tampil.setText("Tampil");
        tampil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(0, 51, 102));
        keluar.setText("Keluar");
        keluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        batal.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        batal.setForeground(new java.awt.Color(0, 51, 102));
        batal.setText("Batal");
        batal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        namaPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPengarangActionPerformed(evt);
            }
        });

        kodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBukuActionPerformed(evt);
            }
        });

        judulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulBukuActionPerformed(evt);
            }
        });

        penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penerbitActionPerformed(evt);
            }
        });

        jumlahHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahHalamanActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tahun Terbit");

        tahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunTerbitActionPerformed(evt);
            }
        });

        tabelDatabaseBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Nama Pengarang", "Penerbit", "Tahun Terbit", "Jumlah Halaman"
            }
        ));
        jScrollPane1.setViewportView(tabelDatabaseBuku);

        cariText.setToolTipText("");
        cariText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTextActionPerformed(evt);
            }
        });

        cari.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        cari.setForeground(new java.awt.Color(0, 51, 102));
        cari.setText("Cari ");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layoutDataBukuLayout = new javax.swing.GroupLayout(layoutDataBuku);
        layoutDataBuku.setLayout(layoutDataBukuLayout);
        layoutDataBukuLayout.setHorizontalGroup(
            layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutDataBukuLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(layoutDataBukuLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutDataBukuLayout.createSequentialGroup()
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambah)
                            .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(perbarui)
                        .addGap(18, 18, 18)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tampil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(layoutDataBukuLayout.createSequentialGroup()
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cariText)
                            .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                        .addGap(91, 91, 91))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutDataBukuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layoutDataBukuLayout.setVerticalGroup(
            layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutDataBukuLayout.createSequentialGroup()
                .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutDataBukuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah)
                            .addComponent(keluar))
                        .addGap(18, 18, 18)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpan)
                            .addComponent(hapus))
                        .addGap(11, 11, 11)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampil)
                            .addComponent(perbarui)
                            .addComponent(batal))
                        .addGap(18, 18, 18)
                        .addComponent(cariText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(cari)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutDataBukuLayout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layoutDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(layoutDataBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(layoutDataBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahunTerbitActionPerformed

    private void jumlahHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahHalamanActionPerformed

    private void penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penerbitActionPerformed

    private void judulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulBukuActionPerformed

    private void kodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeBukuActionPerformed

    private void namaPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPengarangActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        kodeBuku.setText("");
        judulBuku.setText("");
        namaPengarang.setText("");
        penerbit.setText("");
        tahunTerbit.setText("");
        jumlahHalaman.setText("");
        cariText.setText("");
    }//GEN-LAST:event_batalActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        String Menu = "Menu"; 
        switchToFrame(Menu);
    }//GEN-LAST:event_keluarActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        updateTable();
    }//GEN-LAST:event_tampilActionPerformed

    private void perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perbaruiActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tabelDatabaseBuku.getSelectedRow();

        // Memastikan bahwa ada baris yang dipilih sebelum memperbarui
        if (selectedRow != -1) {
            try {
                // Mendapatkan data dari baris yang dipilih
                String kodeBukuToUpdate = tabelDatabaseBuku.getValueAt(selectedRow, 0).toString();
                String judulBukuToUpdate = tabelDatabaseBuku.getValueAt(selectedRow, 1).toString();
                String namaPengarangToUpdate = tabelDatabaseBuku.getValueAt(selectedRow, 2).toString();
                String penerbitToUpdate = tabelDatabaseBuku.getValueAt(selectedRow, 3).toString();
                String tahunTerbitToUpdate = tabelDatabaseBuku.getValueAt(selectedRow, 4).toString();
                String jumlahHalamanToUpdate = tabelDatabaseBuku.getValueAt(selectedRow, 5).toString();

                // Menampilkan data pada JTextField
                kodeBuku.setText(kodeBukuToUpdate);
                judulBuku.setText(judulBukuToUpdate);
                namaPengarang.setText(namaPengarangToUpdate);
                penerbit.setText(penerbitToUpdate);
                tahunTerbit.setText(tahunTerbitToUpdate);
                jumlahHalaman.setText(jumlahHalamanToUpdate);

                // Menyimpan NIM yang akan diperbarui
                // Anda bisa menyimpannya sebagai variabel instance jika diperlukan
                // Contoh: this.nimToUpdate = nimToUpdate;

                // Tambahkan logika lain yang diperlukan untuk proses perbarui
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            // Menampilkan pesan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diperbarui", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_perbaruiActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tabelDatabaseBuku.getSelectedRow();

        // Memastikan bahwa ada baris yang dipilih sebelum menghapus
        if (selectedRow != -1) {
            try {
                // Mendapatkan NIM dari baris yang dipilih
                String kode_bukuToDelete = tabelDatabaseBuku.getValueAt(selectedRow, 0).toString();

                // Menghapus data dari database
                Connection koneksi = DatabaseConnection.getConnection();
                String query = "DELETE FROM data_buku WHERE kode_buku = ?";
                PreparedStatement preparedStatement = koneksi.prepareStatement(query);
                preparedStatement.setString(1, kode_bukuToDelete);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    // Menampilkan pesan sukses dan mengupdate tabel
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus dari database", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    updateTable();
                } else {
                    // Menampilkan pesan kesalahan jika penghapusan gagal
                    JOptionPane.showMessageDialog(this, "Gagal menghapus data dari database", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Menutup resources
                preparedStatement.close();
            } catch (SQLException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        } else {
            // Menampilkan pesan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            // Mendapatkan koneksi dari kelas DatabaseConnection
            Connection koneksi = DatabaseConnection.getConnection();

            // Membuat PreparedStatement untuk menghindari SQL injection
            String query = "UPDATE data_buku SET judul_buku=?, nama_pengarang=?, penerbit=?, tahun_terbit=?, jumlah_halaman=? WHERE kode_buku=?";
            PreparedStatement preparedStatement = koneksi.prepareStatement(query);

            // Mengatur nilai untuk parameter-parameter
            preparedStatement.setString(1, judulBuku.getText());
            preparedStatement.setString(2, namaPengarang.getText());
            preparedStatement.setString(3, penerbit.getText());
            preparedStatement.setString(4, tahunTerbit.getText());
            preparedStatement.setString(5, jumlahHalaman.getText());
            preparedStatement.setString(6, kodeBuku.getText()); 

            // Menjalankan query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // Menampilkan pesan sukses menggunakan JOptionPane
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui di database", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                // Menyegarkan tabel
                updateTable();

                // Mengosongkan JTextField setelah pembaruan berhasil
                kodeBuku.setText("");
                judulBuku.setText("");
                namaPengarang.setText("");
                penerbit.setText("");
                tahunTerbit.setText("");
                jumlahHalaman.setText("");
                cariText.setText("");
            } else {
                // Menangani kasus jika tidak ada baris yang terpengaruh (pembaruan gagal)
                JOptionPane.showMessageDialog(this, "Gagal memperbarui data di database", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Menutup sumber daya
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        try {
            // Getting a connection from your DatabaseConnection class
            Connection koneksi = DatabaseKoneksi.DatabaseConnection.getConnection();

            // Creating a PreparedStatement to avoid SQL injection
            String query = "INSERT INTO data_buku (kode_buku, judul_buku, nama_pengarang, penerbit, tahun_terbit, jumlah_halaman) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = koneksi.prepareStatement(query);

            // Setting values for the parameters
            preparedStatement.setString(1, kodeBuku.getText());
            preparedStatement.setString(2, judulBuku.getText());
            preparedStatement.setString(3, namaPengarang.getText());
            preparedStatement.setString(4, penerbit.getText());
            preparedStatement.setString(5, tahunTerbit.getText());
            preparedStatement.setString(6, jumlahHalaman.getText());

            // Executing the query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // Display a success message using a JOptionPane
                JOptionPane.showMessageDialog(this, "Data berhasil dimasukkan ke database", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                
                updateTable();
                 
                kodeBuku.setText("");
                judulBuku.setText("");
                namaPengarang.setText("");
                penerbit.setText("");
                tahunTerbit.setText("");
                jumlahHalaman.setText("");
                // You can add additional actions for success here

                // Closing resources
                preparedStatement.close();
            } else {
                // Handle the case where no rows were affected (insertion failed)
                JOptionPane.showMessageDialog(this, "Gagal memasukkan data ke database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void cariTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariTextActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed

        try {
            // Mendapatkan koneksi dari kelas DatabaseConnection
            Connection koneksi = DatabaseConnection.getConnection();

            // Membuat PreparedStatement untuk menghindari SQL injection
            String query = "SELECT * FROM data_buku WHERE kode_buku=? OR judul_buku=?";
            PreparedStatement preparedStatement = koneksi.prepareStatement(query);

            // Mengatur nilai untuk parameter
            preparedStatement.setString(1, cariText.getText());
            preparedStatement.setString(2, cariText.getText());
            
            // Menjalankan query
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Menampilkan data yang ditemukan ke dalam JTextField
                kodeBuku.setText(resultSet.getString("kode_buku"));
                judulBuku.setText(resultSet.getString("judul_buku"));
                namaPengarang.setText(resultSet.getString("nama_pengarang"));
                penerbit.setText(resultSet.getString("penerbit"));
                tahunTerbit.setText(resultSet.getString("tahun_terbit"));
                jumlahHalaman.setText(resultSet.getString("jumlah_halaman"));

                // Menampilkan pesan sukses menggunakan JOptionPane
                JOptionPane.showMessageDialog(this, "Data ditemukan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Menampilkan pesan jika data tidak ditemukan
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }

            // Menutup sumber daya
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cariActionPerformed

    private void switchToFrame(String frameName) {
        try {
            this.dispose(); 
            if (frameName.equals("Menu")) { 
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
     private void updateTable() {
        try {
            Connection koneksi = DatabaseKoneksi.DatabaseConnection.getConnection();
            String query = "SELECT * FROM data_buku";
            PreparedStatement preparedStatement = koneksi.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabelDatabaseBuku.getModel();
            model.setRowCount(0); // Hapus data yang sudah ada di tabel

            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getString("kode_buku"),
                        resultSet.getString("judul_buku"),
                        resultSet.getString("nama_pengarang"),
                        resultSet.getString("penerbit"),
                        resultSet.getString("tahun_terbit"),
                        resultSet.getString("jumlah_halaman")
                };
                model.addRow(row);
            }
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton cari;
    private javax.swing.JTextField cariText;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judulBuku;
    private javax.swing.JTextField jumlahHalaman;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kodeBuku;
    private javax.swing.JPanel layoutDataBuku;
    private javax.swing.JTextField namaPengarang;
    private javax.swing.JTextField penerbit;
    private javax.swing.JButton perbarui;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelDatabaseBuku;
    private javax.swing.JTextField tahunTerbit;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tampil;
    // End of variables declaration//GEN-END:variables
}
