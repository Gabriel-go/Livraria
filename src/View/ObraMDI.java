package View;

import Controller.AutorController;
import Controller.AuxAutoresController;
import Controller.EditoraController;
import Controller.ObraController;
import Model.AutorBEAN;
import Model.AuxAutoresBEAN;
import Model.EditoraBEAN;
import Model.ObraBEAN;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ObraMDI extends javax.swing.JInternalFrame {

    public ObraMDI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        edtObraConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaObra = new javax.swing.JTable();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaEditora = new javax.swing.JTable();
        edtNomeEditora = new javax.swing.JTextField();
        btnConsultaEditora = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSelecionarEditora = new javax.swing.JButton();
        edtCodEditora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanelAutores = new javax.swing.JPanel();
        btnInserirAutor = new javax.swing.JButton();
        btnExcluirAutor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAutor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("Nome da Obra");

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        edtObraConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtObraConsultaActionPerformed(evt);
            }
        });

        tabelaObra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaObra);

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
                        .addComponent(edtObraConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsulta))
                    .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                            .addComponent(btnInserir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluir))
                        .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtObraConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tabelaEditora.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaEditora.setEnabled(false);
        jScrollPane3.setViewportView(tabelaEditora);

        edtNomeEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeEditoraActionPerformed(evt);
            }
        });

        btnConsultaEditora.setText("Consultar");
        btnConsultaEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEditoraActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome Editora");

        btnSelecionarEditora.setText("Selecionar Editora");
        btnSelecionarEditora.setEnabled(false);
        btnSelecionarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarEditoraActionPerformed(evt);
            }
        });

        edtCodEditora.setEditable(false);
        edtCodEditora.setText("0");

        jLabel7.setText("Cod.");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtNome)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCodEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSelecionarEditora)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                                .addComponent(edtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultaEditora))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(162, 162, 162))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaEditora)
                    .addComponent(edtCodEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionarEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados", jPanelDados);

        btnInserirAutor.setText("Inserir Autor");
        btnInserirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirAutorActionPerformed(evt);
            }
        });

        btnExcluirAutor.setText("Exclui Autor");
        btnExcluirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAutorActionPerformed(evt);
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
        jScrollPane2.setViewportView(tabelaAutor);

        javax.swing.GroupLayout jPanelAutoresLayout = new javax.swing.GroupLayout(jPanelAutores);
        jPanelAutores.setLayout(jPanelAutoresLayout);
        jPanelAutoresLayout.setHorizontalGroup(
            jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAutoresLayout.createSequentialGroup()
                        .addComponent(btnInserirAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirAutor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanelAutoresLayout.setVerticalGroup(
            jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutoresLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirAutor)
                    .addComponent(btnExcluirAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Autores", jPanelAutores);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Cadastro de Obras");

        jLabel5.setText("Esta tela tem como finalidade cadastrar obras literarias com seus respectivos autores e sua editora.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultaObra(edtObraConsulta.getText());
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void edtObraConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtObraConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtObraConsultaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserir();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        inativa();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        gravar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnInserirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirAutorActionPerformed
        insereAutor();
    }//GEN-LAST:event_btnInserirAutorActionPerformed

    private void edtNomeEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeEditoraActionPerformed

    private void btnConsultaEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEditoraActionPerformed
        consultaEditora(edtNomeEditora.getText());
    }//GEN-LAST:event_btnConsultaEditoraActionPerformed

    private void btnSelecionarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarEditoraActionPerformed
        selecionaEditora();
    }//GEN-LAST:event_btnSelecionarEditoraActionPerformed

    private void btnExcluirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAutorActionPerformed
        deletaAutor();
    }//GEN-LAST:event_btnExcluirAutorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);
        this.edtNome.setEnabled(false);
        this.edtObraConsulta.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnConsultaEditora;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirAutor;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnInserirAutor;
    private javax.swing.JButton btnSelecionarEditora;
    private javax.swing.JTextField edtCod;
    private javax.swing.JTextField edtCodEditora;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNomeEditora;
    private javax.swing.JTextField edtObraConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAutores;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tabelaAutor;
    private javax.swing.JTable tabelaEditora;
    private javax.swing.JTable tabelaObra;
    // End of variables declaration//GEN-END:variables

    private void consultaObra(String nome){
        DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaObra.getModel();
        ObraController controle = new ObraController();        
        
        ArrayList<ObraBEAN> lista = controle.listaObraes(nome);
        
        dtmPrincipal.setNumRows(0);
        
        for (int i=0; i<lista.size(); i++){
            Object[] linha = {lista.get(i).getIdObra(),lista.get(i).getNomeObra()};
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
        if (tabelaObra.getRowCount() >= 1){
            int n = (Integer) (tabelaObra.getModel().getValueAt(tabelaObra.getSelectedRow() ,0));
            
            //verifico se tem algum selecionado
            if (n > 0){
                ObraController controle = new ObraController();
                controle.inativaObra(n);
                consultaObra(edtObraConsulta.getText());
            }
        }
    }
    
    private void editar(){
        //verifico se tem algum pesquisado
        if (tabelaObra.getRowCount() >= 1){
        
            ObraController controle = new ObraController();
            EditoraController controleEditora = new EditoraController();
            
            
            int n = (Integer) (tabelaObra.getModel().getValueAt(tabelaObra.getSelectedRow() ,0));
            
            //verifico se tem algum selecionado
            if (n > 0){
                //campos referente a obra
                ObraBEAN Obra = controle.buscaPessoaId(n);
                edtCod.setText(Integer.toString(Obra.getIdObra()));
                edtNome.setText(Obra.getNomeObra());
                
                //campos referente a editora
                EditoraBEAN Editora = controleEditora.buscaPessoaId(Obra.getEditoraObra());                
                edtCodEditora.setText(Integer.toString(Editora.getIdEditora()));                
                edtNomeEditora.setText(Editora.getNomeEditora());
                
                //campos referente aos autores
                consultaAutor();
                
                this.jTabbedPane1.setSelectedIndex(1);
                this.edtNome.setEnabled(true);
                this.edtNome.requestFocus();
            }
        }
    }
    
    private void gravar(){
        //criando os obj
        Scanner teclado = new Scanner(System.in);
        ObraBEAN Obra = new ObraBEAN();
        ObraController controle = new ObraController();

        Obra.setNomeObra(edtNome.getText());
        Obra.setStatusObra(0);  
        Obra.setEditoraObra(Integer.parseInt(edtCodEditora.getText()));
               
        //verifico se o Obra e diferente de zero
        //se for zero eu insiro caso contrario populo o id e mando editar
        if (Integer.parseInt(edtCod.getText()) == 0){
            controle.addObra(Obra);   
        }else{
            Obra.setIdObra(Integer.parseInt(edtCod.getText()));
            controle.alteraObra(Obra);
        }
        
        JOptionPane.showMessageDialog(null,"Registro salvo com sucesso!");
        
        consultaObra(edtObraConsulta.getText());  
        this.edtCod.setText("0");
        this.edtNome.setText("");
        this.edtCodEditora.setText("0");
        this.edtNomeEditora.setText("");
        tabelaEditora.clearSelection();
        this.jTabbedPane1.setSelectedIndex(0);
        this.edtNome.setEnabled(false);
        this.edtObraConsulta.requestFocus();  
        
                   
    }
    
    private void consultaEditora(String nome){
        DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaEditora.getModel();
        EditoraController controle = new EditoraController();        
        
        ArrayList<EditoraBEAN> lista = controle.listaEditoraes(nome);
        
        dtmPrincipal.setNumRows(0);
        
        for (int i=0; i<lista.size(); i++){
            Object[] linha = {lista.get(i).getIdEditora(),lista.get(i).getNomeEditora()};
            dtmPrincipal.addRow(linha);
        }
        tabelaEditora.setEnabled(true);
        btnSelecionarEditora.setEnabled(true);
    }
    
    private void selecionaEditora(){
        //verifico se tem algum pesquisado
        if (tabelaEditora.getRowCount() >= 1){
        
            EditoraController controle = new EditoraController();
            
            int id = (Integer) (tabelaEditora.getModel().getValueAt(tabelaEditora.getSelectedRow() ,0));
            String nome = (String) (tabelaEditora.getModel().getValueAt(tabelaEditora.getSelectedRow() ,1));
            //verifico se tem algum selecionado
            if (id > 0){
                edtCodEditora.setText(Integer.toString(id));
                edtNomeEditora.setText(nome);
                tabelaEditora.clearSelection();
            }
        }
        tabelaEditora.setEnabled(false);
        btnSelecionarEditora.setEnabled(false);
        
    }
    
    private void insereAutor(){
        int id =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID de seu autor: "));
        
        AutorController controleAutor = new AutorController();
        AuxAutoresController controleAux = new AuxAutoresController();
        
        AutorBEAN autor = new AutorBEAN();
        AuxAutoresBEAN auxAutor = new AuxAutoresBEAN();
        
        autor = controleAutor.buscaPessoaId(id);
        
        auxAutor.setIdAutores(autor.getIdAutor());
        auxAutor.setNomeautor(autor.getNomeAutor());
        auxAutor.setIdLivros(Integer.parseInt(edtCod.getText()));
        controleAux.addAutor(auxAutor);  
        consultaAutor();
    }
    
    private void deletaAutor(){
        //int id =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID de seu autor: "));
      
        AuxAutoresController controleAux = new AuxAutoresController();
        
        AuxAutoresBEAN auxAutor = new AuxAutoresBEAN();
        
        int idAutor = (Integer) (tabelaAutor.getModel().getValueAt(tabelaAutor.getSelectedRow() ,0));
        
        auxAutor.setIdAutores(idAutor);
        auxAutor.setIdLivros(Integer.parseInt(edtCod.getText()));
        
        AuxAutoresController.deleteContato(auxAutor);
        
        consultaAutor();
              
    }
    
    
    private void consultaAutor(){
        DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaAutor.getModel();
        AuxAutoresController controle = new AuxAutoresController();        
        AuxAutoresBEAN auxAutor = new AuxAutoresBEAN();
        
        //int idAutor = (Integer) (tabelaObra.getModel().getValueAt(tabelaObra.getSelectedRow() ,0));
        int IdLivro = (Integer) (tabelaObra.getModel().getValueAt(tabelaObra.getSelectedRow() ,0));
        
        ArrayList<AuxAutoresBEAN> lista = controle.listaAutores(IdLivro);
        
        dtmPrincipal.setNumRows(0);
        
        for (int i=0; i<lista.size(); i++){
            Object[] linha = {lista.get(i).getIdAutores(),lista.get(i).getNomeautor()};
            dtmPrincipal.addRow(linha);
        }
    }

}
