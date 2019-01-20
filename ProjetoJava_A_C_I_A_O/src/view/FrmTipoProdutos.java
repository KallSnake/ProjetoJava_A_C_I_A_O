package view;

import controller.ConexaoDB;
import controller.ControllerTipoProdutos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import model.ModelTabela;
import model.ModelTipoProdutos;


public class FrmTipoProdutos extends javax.swing.JFrame {
    
     ConexaoDB conectaTipoProd = new ConexaoDB();
     ModelTipoProdutos mtipoprod = new ModelTipoProdutos();
     ControllerTipoProdutos controlTipoProd = new ControllerTipoProdutos();
     int flag = 0;
     
     

    /**
     * Creates new form FrmCategoriaEventos
     */
    public FrmTipoProdutos() {
        initComponents();
        
        
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/ss.jpg")).getImage());
        
        //conectaCategoriaEventos.conexao();
        
        preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        aaa = new javax.swing.JLabel();
        dddd = new javax.swing.JLabel();
        txtCodTipoProd = new javax.swing.JTextField();
        txtNomeTipoProd = new javax.swing.JTextField();
        btnPesquisarTipoProd = new javax.swing.JButton();
        txtCampoPesquisaTipoProd = new javax.swing.JTextField();
        btnNovoTipoProd = new javax.swing.JButton();
        btnSalvarTipoProd = new javax.swing.JButton();
        btnAlterarTipoProd = new javax.swing.JButton();
        btnExcluirTipoProd = new javax.swing.JButton();
        btnCancelarTipoProd = new javax.swing.JButton();
        btnSairTipoProd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTipoProduto = new javax.swing.JTable();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Tipos de Produto");
        setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        setResizable(false);

        aaa.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        aaa.setText("Cod:");

        dddd.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        dddd.setText("Nome da Categoria*:");

        txtCodTipoProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCodTipoProd.setEnabled(false);

        txtNomeTipoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeTipoProd.setEnabled(false);

        btnPesquisarTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnPesquisarTipoProd.setText("Buscar");
        btnPesquisarTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTipoProdActionPerformed(evt);
            }
        });

        txtCampoPesquisaTipoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnNovoTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnNovoTipoProd.setText("Novo");
        btnNovoTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTipoProdActionPerformed(evt);
            }
        });

        btnSalvarTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnSalvarTipoProd.setText("Salvar");
        btnSalvarTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarTipoProd.setEnabled(false);
        btnSalvarTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTipoProdActionPerformed(evt);
            }
        });

        btnAlterarTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnAlterarTipoProd.setText("Alterar");
        btnAlterarTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarTipoProd.setEnabled(false);
        btnAlterarTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTipoProdActionPerformed(evt);
            }
        });

        btnExcluirTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnExcluirTipoProd.setText("Excluir");
        btnExcluirTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirTipoProd.setEnabled(false);
        btnExcluirTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTipoProdActionPerformed(evt);
            }
        });

        btnCancelarTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCancelarTipoProd.setText("Cancelar");
        btnCancelarTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarTipoProd.setEnabled(false);
        btnCancelarTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTipoProdActionPerformed(evt);
            }
        });

        btnSairTipoProd.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnSairTipoProd.setText("Sair");
        btnSairTipoProd.setToolTipText("Fechar janela");
        btnSairTipoProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSairTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairTipoProdActionPerformed(evt);
            }
        });

        jTableTipoProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableTipoProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableTipoProduto.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTableTipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableTipoProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(txtCampoPesquisaTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarTipoProd))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dddd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirTipoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarTipoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoTipoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarTipoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarTipoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSairTipoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnNovoTipoProd)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarTipoProd)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarTipoProd)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirTipoProd)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarTipoProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairTipoProd))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dddd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisarTipoProd)
                            .addComponent(txtCampoPesquisaTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(407, 292));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTipoProdActionPerformed
         // BOTÃO PESQUISAR
        
        if ( txtCampoPesquisaTipoProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o nome para busca!");
            txtCampoPesquisaTipoProd.requestFocusInWindow();
            
        } else if ( !txtCampoPesquisaTipoProd.getText().isEmpty() ) {
           
        // ABILITANDO/DESABILITANDO OS BOTÕES ANTES DE PESQUISAR
        btnNovoTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(!true);
        btnExcluirTipoProd.setEnabled(!true);
        btnCancelarTipoProd.setEnabled(!true);
        
        
        ModelTipoProdutos modelTipoProdutos = controlTipoProd.buscarTipoProdutos(mtipoprod);
        
        /*
        txtCodEventos.setText(String.valueOf(modelCategoriaEventos.getCod_cateven()));
        txtNomedaCategoriaEvento.setText(modelCategoriaEventos.getNome_cateven());
        */
        
        mtipoprod.setPesquisa(txtCampoPesquisaTipoProd.getText());
        
        
        preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS WHERE NOME_TIPO LIKE '%" + mtipoprod.getPesquisa() + "%'");
        
        
        txtCampoPesquisaTipoProd.setText("");
        
        
        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS PESQUISAR
        btnNovoTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(!true);
        btnSalvarTipoProd.setEnabled(false);
        btnExcluirTipoProd.setEnabled(!true);
        btnCancelarTipoProd.setEnabled(false);
        btnPesquisarTipoProd.setEnabled(true);
        
        // DESABILITANDO OS CAMPOS APÓS PESQUISAR
        txtCodTipoProd.setEnabled(false);
        txtNomeTipoProd.setEnabled(false);

        
        // LIMPANDO OS CAMOPS APÓS PESQUISAR
        txtCodTipoProd.setText("");
        txtNomeTipoProd.setText("");
  
        
        
        } else if ( mtipoprod.getPesquisa().equals("")) {
            
            preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        }
        
       // preencherTabelaUsuario("select * from  usuarios where nome_usuario like '%" + musuario.getPesquisa() + "%'");
       
    }//GEN-LAST:event_btnPesquisarTipoProdActionPerformed

    private void btnAlterarTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTipoProdActionPerformed
        // BOTÃO ALTERAR

        flag = 2;

        // ABILITANDO/DESABILITANDO OS CAMPOS
        txtNomeTipoProd.setEnabled(true);
        txtCampoPesquisaTipoProd.setEnabled(false);

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR NO BOTÃO
        btnNovoTipoProd.setEnabled(false);
        btnSalvarTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(false);
        btnExcluirTipoProd.setEnabled(false);
        btnCancelarTipoProd.setEnabled(true);
        btnPesquisarTipoProd.setEnabled(false);

        preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        
        
    }//GEN-LAST:event_btnAlterarTipoProdActionPerformed

    private void btnSairTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairTipoProdActionPerformed
        // BOTÃO SAIR
        
        
        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS SAIR
        btnNovoTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(!true);
        btnSalvarTipoProd.setEnabled(false);
        btnExcluirTipoProd.setEnabled(!true);
        btnCancelarTipoProd.setEnabled(false);
        btnPesquisarTipoProd.setEnabled(true);

        // DESABILITANDO OS CAMPOS APÓS SAIR
        txtCodTipoProd.setText("");
        txtNomeTipoProd.setEnabled(false);
        txtCampoPesquisaTipoProd.setEnabled(true);

        // LIMPANDO OS CAMPOS APÓS CLICAR EM SAIR
        txtCodTipoProd.setText("");
        txtNomeTipoProd.setText("");
        txtCampoPesquisaTipoProd.setText("");

        
        dispose();
        
        preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        
        
        //conectaCategoriaEventos.desconecta();
        
        
    }//GEN-LAST:event_btnSairTipoProdActionPerformed

    private void btnNovoTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTipoProdActionPerformed
        // BOTÃO NOVO

        flag = 1;

        // LIMPANDO OS CAMPOS APÓS CLICAR
        txtCodTipoProd.setText("");
        txtNomeTipoProd.setText("");
        txtCampoPesquisaTipoProd.setText("");

        // ABILITANDO OS CAMPOS
        txtNomeTipoProd.setEnabled(true);
        txtCampoPesquisaTipoProd.setEnabled(false);

        // COLOCANDO FOCO NOS CAMPOS
        txtNomeTipoProd.requestFocusInWindow();

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR NO BOTÃO
        btnNovoTipoProd.setEnabled(false);
        btnAlterarTipoProd.setEnabled(false);
        btnSalvarTipoProd.setEnabled(true);
        btnExcluirTipoProd.setEnabled(false);
        btnCancelarTipoProd.setEnabled(true);
        btnPesquisarTipoProd.setEnabled(false);

        
        preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        
        
    }//GEN-LAST:event_btnNovoTipoProdActionPerformed

    private void btnExcluirTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTipoProdActionPerformed
         // BOTÃO EXCLUIR
        
        int resposta;
        
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir!");
        
        if ( resposta == JOptionPane.YES_OPTION ) {
           
            mtipoprod.setCod_tipo(Integer.parseInt(txtCodTipoProd.getText()));
         
            controlTipoProd.excluir(mtipoprod);
            
            // ABILITANDO/DESABILITANDO OS BOTÕES APÓS EXLUIR
            btnNovoTipoProd.setEnabled(true);
            btnAlterarTipoProd.setEnabled(!true);
            btnSalvarTipoProd.setEnabled(false);
            btnExcluirTipoProd.setEnabled(!true);
            btnCancelarTipoProd.setEnabled(false);
            btnPesquisarTipoProd.setEnabled(true);
            
            // LIMPANDO OS CAMPOS APÓS EXLCUIR
            txtCodTipoProd.setText("");
            txtNomeTipoProd.setText("");
            txtCampoPesquisaTipoProd.setText("");

            // ABILITANDO/DESABILITANDO OS CAMPOS APÓS EXCLUIR
            txtNomeTipoProd.setEnabled(false);
            txtCampoPesquisaTipoProd.setEnabled(true);
            
            
            preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
            
      
        } else {
        
            // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CLICAR EM "NÃO" EXLUIR
            btnNovoTipoProd.setEnabled(true);
            btnAlterarTipoProd.setEnabled(!true);
            btnSalvarTipoProd.setEnabled(false);
            btnExcluirTipoProd.setEnabled(!true);
            btnCancelarTipoProd.setEnabled(false);
            btnPesquisarTipoProd.setEnabled(true);

            // DESABILITANDO OS CAMPOS APÓS CLICAR EM "NÃO" EXCLUIR
            txtNomeTipoProd.setEnabled(false);
            txtCampoPesquisaTipoProd.setEnabled(true);

            // LIMPANDO OS CAMPOS APÓS CLICAR EM "NÃO" EXLCUIR
            txtCodTipoProd.setText("");
            txtNomeTipoProd.setText("");
            txtCampoPesquisaTipoProd.setText("");
            
            
            preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        
        }
            
        
         //preencherTabelaUsuario("select * from  usuarios where nome_usuario like '%" + musuario.getPesquisa() + "%'");
         
         
    }//GEN-LAST:event_btnExcluirTipoProdActionPerformed

    private void btnSalvarTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTipoProdActionPerformed
        // BOTÃO SALVAR

        // VALIDANDO OS CAMPOS ANTES DE SALVAR
        if (txtNomeTipoProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe nome do tipo de produto!");
            txtNomeTipoProd.requestFocusInWindow();

        } else {

            if (flag == 1) {

                // SALVANDO OS DADOS NA BASE DE DADOS
                mtipoprod.setNome_tipo(txtNomeTipoProd.getText());
                

                controlTipoProd.salvar(mtipoprod);
                

                // ABILITANDO/DESABILITANDO OS BOTÕES APÓS SALVAR
                btnNovoTipoProd.setEnabled(true);
                btnAlterarTipoProd.setEnabled(!true);
                btnSalvarTipoProd.setEnabled(false);
                btnExcluirTipoProd.setEnabled(!true);
                btnCancelarTipoProd.setEnabled(false);
                btnPesquisarTipoProd.setEnabled(true);

                // DESABILITANDO OS CAMPOS APÓS SALVAR
                txtNomeTipoProd.setEnabled(false);
                txtCampoPesquisaTipoProd.setEnabled(true);

                // LIMPANDO OS CAMPOS APÓS SALVAR
                txtCodTipoProd.setText("");
                txtNomeTipoProd.setText("");
                txtCampoPesquisaTipoProd.setText("");

                preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");

            } else {

                if (flag == 2) {

                    // DESABILITANDO O CAMPO PESQUISA
                    txtCampoPesquisaTipoProd.setEnabled(false);
                    btnPesquisarTipoProd.setEnabled(false);

                    mtipoprod.setCod_tipo(Integer.parseInt(txtCodTipoProd.getText()));
                    mtipoprod.setNome_tipo(txtNomeTipoProd.getText());
                

                    controlTipoProd.editar(mtipoprod);

                    // ABILITANDO/DESABILITANDO OS BOTÕES APÓS EDITAR
                    btnNovoTipoProd.setEnabled(true);
                    btnAlterarTipoProd.setEnabled(!true);
                    btnSalvarTipoProd.setEnabled(false);
                    btnExcluirTipoProd.setEnabled(!true);
                    btnCancelarTipoProd.setEnabled(false);
                    btnPesquisarTipoProd.setEnabled(true);

                    // ABILITANDO/DESABILITANDO OS CAMPOS APÓS EDITAR
                    txtNomeTipoProd.setEnabled(false);
                    txtCampoPesquisaTipoProd.setEnabled(true);

                    // LIMPANDO OS CAMPOS APÓS EDITAR
                    txtCodTipoProd.setText("");
                    txtNomeTipoProd.setText("");
                    txtCampoPesquisaTipoProd.setText("");

                    preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
                }

            }

        }


         //preencherTabelaUsuario("select * from  usuarios where nome_usuario like '%" + musuario.getPesquisa() + "%'");
         
         
    }//GEN-LAST:event_btnSalvarTipoProdActionPerformed

    private void btnCancelarTipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTipoProdActionPerformed
        // BOTÃO CANCELAR         

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS CANCELAR
        btnNovoTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(!true);
        btnSalvarTipoProd.setEnabled(false);
        btnExcluirTipoProd.setEnabled(!true);
        btnCancelarTipoProd.setEnabled(false);
        btnPesquisarTipoProd.setEnabled(true);

        // DESABILITANDO OS CAMPOS APÓS CANCELAR
        txtCodTipoProd.setText("");
        txtNomeTipoProd.setEnabled(false);
        txtCampoPesquisaTipoProd.setEnabled(true);

        // LIMPANDO OS CAMPOS APÓS CLICAR EM "NÃO" EXLCUIR
        txtCodTipoProd.setText("");
        txtNomeTipoProd.setText("");
        txtCampoPesquisaTipoProd.setText("");

        
        preencherTabelaTipoProduto("SELECT * FROM TIPO_PRODUTOS ORDER BY COD_TIPO");
        
        
    }//GEN-LAST:event_btnCancelarTipoProdActionPerformed

    private void jTableTipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoProdutoMouseClicked
        // EVENTO NA TABELA QUE AO CLICAR SELECIONA O ITEM
        
        String nome_tipoprod = "" + jTableTipoProduto.getValueAt(jTableTipoProduto.getSelectedRow(), 1);

        // JOptionPane.showMessageDialog(rootPane, nome_cateven);
        
        // ABILITANDO/DESABILITANDO OS CAMPOS ANTES DE PESQUISAR
        btnNovoTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(!true);
        btnExcluirTipoProd.setEnabled(!true);
        btnCancelarTipoProd.setEnabled(true);

        mtipoprod.setPesquisa(txtCampoPesquisaTipoProd.getText());

        // ABILITANDO/DESABILITANDO OS BOTÕES APÓS SELECIONAR ITEM NA TABELA
        btnNovoTipoProd.setEnabled(true);
        btnAlterarTipoProd.setEnabled(true);
        btnSalvarTipoProd.setEnabled(false);
        btnExcluirTipoProd.setEnabled(true);
        btnCancelarTipoProd.setEnabled(!false);
        btnPesquisarTipoProd.setEnabled(true);

        // DESABILITANDO OS CAMPOS APÓS SELECIONAR ITEM NA TABELA
        txtNomeTipoProd.setEnabled(false);
        txtCampoPesquisaTipoProd.setEnabled(true);

        conectaTipoProd.conexao();

        conectaTipoProd.executaSQL("SELECT * FROM TIPO_PRODUTOS WHERE NOME_TIPO = '" + nome_tipoprod + "'");

        try {

            conectaTipoProd.rs.first();

            txtCodTipoProd.setText(String.valueOf(conectaTipoProd.rs.getInt("COD_TIPO")));
            txtNomeTipoProd.setText(conectaTipoProd.rs.getString("NOME_TIPO"));

            conectaTipoProd.desconecta();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao seleciona os dados! \n ERRO: " + ex);
            conectaTipoProd.desconecta();
        }

        //conectaCategoriaEventos.desconecta();
        
       
    }//GEN-LAST:event_jTableTipoProdutoMouseClicked

    
    
    public void preencherTabelaTipoProduto(String SQL) {
        
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[] {"Código","Tipo de Produto" };
        
        conectaTipoProd.conexao();
        
        conectaTipoProd.executaSQL(SQL);
        
        try {
            
            conectaTipoProd.rs.first();
            
            do {
                
                dados.add(new Object[]{conectaTipoProd.rs.getInt("COD_TIPO"), 
                    conectaTipoProd.rs.getString("NOME_TIPO") });
            
               }while(conectaTipoProd.rs.next());
            
        } catch (SQLException e) {

            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a lista de tipos de produto!");
            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList! \n ERRO" + e);

        }
        
        ModelTabela mtabelatipoprod = new ModelTabela(dados, Colunas);
        
        jTableTipoProduto.setModel(mtabelatipoprod);
        jTableTipoProduto.getColumnModel().getColumn(0).setPreferredWidth(132);
        jTableTipoProduto.getColumnModel().getColumn(0).setResizable(false);
        jTableTipoProduto.getColumnModel().getColumn(1).setPreferredWidth(140);
        jTableTipoProduto.getColumnModel().getColumn(1).setResizable(false);
        jTableTipoProduto.getTableHeader().setReorderingAllowed(false);
        jTableTipoProduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableTipoProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // conectaTipoProd.desconecta();
        
      
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
            java.util.logging.Logger.getLogger(FrmTipoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTipoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTipoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTipoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmTipoProdutos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aaa;
    private javax.swing.JButton btnAlterarTipoProd;
    private javax.swing.JButton btnCancelarTipoProd;
    private javax.swing.JButton btnExcluirTipoProd;
    private javax.swing.JButton btnNovoTipoProd;
    private javax.swing.JButton btnPesquisarTipoProd;
    private javax.swing.JButton btnSairTipoProd;
    private javax.swing.JButton btnSalvarTipoProd;
    private javax.swing.JLabel dddd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableTipoProduto;
    private javax.swing.JTextField txtCampoPesquisaTipoProd;
    private javax.swing.JTextField txtCodTipoProd;
    private javax.swing.JTextField txtNomeTipoProd;
    // End of variables declaration//GEN-END:variables
}
