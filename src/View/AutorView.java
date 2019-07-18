/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AutorController;
import Model.AutorBEAN;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AutorView extends javax.swing.JFrame {

    public AutorView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        edtAutorConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutor = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        edtCod = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome Autor");

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        edtAutorConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAutorConsultaActionPerformed(evt);
            }
        });

        tabelaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAutor);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(edtAutorConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsulta))
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtAutorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanelPesquisa);

        jPanelDados.setEnabled(false);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        edtCod.setEditable(false);
        edtCod.setText("0");

        edtNome.setEnabled(false);

        jLabel2.setText("Cod.");

        jLabel3.setText("Nome");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGap(0, 249, Short.MAX_VALUE)
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edtNome))))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados", jPanelDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtAutorConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAutorConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtAutorConsultaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserir();          
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        gravar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultaAutor(edtAutorConsulta.getText());               
    }//GEN-LAST:event_btnConsultaActionPerformed
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        inativa();
        consultaAutor(edtAutorConsulta.getText());  
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JTextField edtAutorConsulta;
    private javax.swing.JTextField edtCod;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaAutor;
    // End of variables declaration//GEN-END:variables
    
  
    private void consultaAutor(String nome){
        DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaAutor.getModel();
        AutorController controle = new AutorController();        
        
        ArrayList<AutorBEAN> lista = controle.listaAutores(nome);
        
        dtmPrincipal.setNumRows(0);
        
        for (int i=0; i<lista.size(); i++){
            Object[] linha = {lista.get(i).getIdAutor(),lista.get(i).getNomeAutor()};
            dtmPrincipal.addRow(linha);
        }
    }
    
    private void inserir(){
        this.jTabbedPane1.setSelectedIndex(1);
        this.edtNome.setEnabled(true);
        this.edtNome.requestFocus();
    }
    
    private void inativa(){
        //verifico se tem algum pesquisado
        if (tabelaAutor.getRowCount() >= 1){
            int n = (Integer) (tabelaAutor.getModel().getValueAt(tabelaAutor.getSelectedRow() ,0));
            
            //verifico se tem algum selecionado
            if (n > 0){
                AutorController controle = new AutorController();
                controle.inativaAutor(n);
                consultaAutor(edtAutorConsulta.getText());
            }
        }
    }
    
    private void editar(){
        //verifico se tem algum pesquisado
        if (tabelaAutor.getRowCount() >= 1){
        
            AutorController controle = new AutorController();
            
            int n = (Integer) (tabelaAutor.getModel().getValueAt(tabelaAutor.getSelectedRow() ,0));
            
            //verifico se tem algum selecionado
            if (n > 0){
                AutorBEAN autor = controle.buscaPessoaId(n);

                edtCod.setText(Integer.toString(autor.getIdAutor()));
                edtNome.setText(autor.getNomeAutor());

                this.jTabbedPane1.setSelectedIndex(1);
                this.edtNome.setEnabled(true);
                this.edtNome.requestFocus();
            }
        }
    }
    
    private void gravar(){
        //criando os obj
        Scanner teclado = new Scanner(System.in);
        AutorBEAN autor = new AutorBEAN();
        AutorController controle = new AutorController();

        autor.setNomeAutor(edtNome.getText());
        autor.setStatusAutor(0);        
        
        //verifico se o autor e diferente de zero
        //se for zero eu insiro caso contrario populo o id e mando editar
        if (Integer.parseInt(edtCod.getText()) == 0){
            controle.addAutor(autor);   
        }else{
            autor.setIdAutor(Integer.parseInt(edtCod.getText()));
            controle.alteraAutor(autor);
        }
        
        JOptionPane.showMessageDialog(null,"Autor cadastrado com sucesso!");
        
        consultaAutor(edtAutorConsulta.getText());  
        
        this.edtCod.setText("0");
        this.edtNome.setText("");
        
        this.jTabbedPane1.setSelectedIndex(0);
        this.edtNome.setEnabled(false);
        this.edtAutorConsulta.requestFocus();  
        
                   
    }
}
