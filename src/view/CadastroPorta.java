/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.bean.Pet;
import model.bean.Porta;
import model.bean.Usuario;
import model.dao.PetDAO;
import model.dao.PortaDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author user
 */
public class CadastroPorta extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    String userLogin;
    
    public CadastroPorta() {
        initComponents();
        MinhasPortas minhasPortas = new MinhasPortas();
        minhasPortas.readJTablePortas();
    }
    
    public void lbl_welcome_porta(String string){
        userLogin = string;
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
        jPanel2 = new javax.swing.JPanel();
        panel_Home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_Portas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel_Pets = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbl_Close = new javax.swing.JLabel();
        btn_minhasPortas = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txt_localizacao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Home.setBackground(new java.awt.Color(255, 153, 0));
        panel_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_HomeMouseClicked(evt);
            }
        });
        panel_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pet-hotel-sign-with-a-dog-and-a-cat-under-a-roof-line.png"))); // NOI18N
        panel_Home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 64, 64));

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        panel_Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 64));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Home.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 20, -1, -1));

        jPanel2.add(panel_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 64));

        panel_Portas.setBackground(new java.awt.Color(255, 153, 0));
        panel_Portas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ragdoll-cat.png"))); // NOI18N
        panel_Portas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 64, 64));

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setOpaque(true);
        panel_Portas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 64));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Portas");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Portas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 20, -1, -1));

        jPanel2.add(panel_Portas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 198, 180, 64));

        panel_Pets.setBackground(new java.awt.Color(255, 153, 0));
        panel_Pets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_PetsMouseClicked(evt);
            }
        });
        panel_Pets.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jack-russel-terrier.png"))); // NOI18N
        panel_Pets.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 64, 64));

        jLabel8.setBackground(new java.awt.Color(255, 102, 0));
        panel_Pets.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 64));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pets");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pets.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 20, -1, -1));

        jPanel2.add(panel_Pets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, 180, 64));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 550));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("<html>\n<body>\n<p style=\"text-align: center\">Cadastre suas portas</p>\n</body>\n</html>");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 330, 100));

        lbl_Close.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Close.setForeground(new java.awt.Color(255, 102, 0));
        lbl_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        lbl_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Close.setPreferredSize(new java.awt.Dimension(50, 50));
        lbl_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        btn_minhasPortas.setBackground(new java.awt.Color(102, 153, 0));
        btn_minhasPortas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_minhasPortas.setForeground(new java.awt.Color(255, 255, 255));
        btn_minhasPortas.setText("Minhas portas");
        btn_minhasPortas.setBorder(null);
        btn_minhasPortas.setContentAreaFilled(false);
        btn_minhasPortas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minhasPortas.setOpaque(true);
        btn_minhasPortas.setPreferredSize(new java.awt.Dimension(51, 30));
        btn_minhasPortas.setRequestFocusEnabled(false);
        btn_minhasPortas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minhasPortasMouseClicked(evt);
            }
        });
        jPanel3.add(btn_minhasPortas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 290, -1));

        btn_cadastrar.setBackground(new java.awt.Color(255, 102, 0));
        btn_cadastrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setBorder(null);
        btn_cadastrar.setContentAreaFilled(false);
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.setOpaque(true);
        btn_cadastrar.setPreferredSize(new java.awt.Dimension(51, 30));
        btn_cadastrar.setRequestFocusEnabled(false);
        btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 290, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 290, 10));

        txt_localizacao.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_localizacao.setBorder(null);
        txt_localizacao.setOpaque(false);
        txt_localizacao.setPreferredSize(new java.awt.Dimension(59, 30));
        jPanel3.add(txt_localizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 290, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("Localização da porta:");
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 200, 30));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 540));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Buscar");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 105, -1));

        jLabel13.setBackground(new java.awt.Color(255, 102, 0));
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawprint.png"))); // NOI18N
        jLabel13.setOpaque(true);
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 105, 105));

        jLabel12.setBackground(new java.awt.Color(255, 102, 0));
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setOpaque(true);
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paw-bg.png"))); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 550));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 550));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_PetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_PetsMouseClicked
        CadastroPet cadastroPet = new CadastroPet();
        cadastroPet.lbl_welcome_pet(userLogin);
        cadastroPet.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_PetsMouseClicked

    private void panel_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_HomeMouseClicked
        Home home = new Home();
        Home.lbl_welcome.setText(userLogin);
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_HomeMouseClicked

    private void btn_minhasPortasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minhasPortasMouseClicked
        MinhasPortas minhasPortas = new MinhasPortas();
        minhasPortas.lbl_welcome_porta(userLogin);
        minhasPortas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_minhasPortasMouseClicked

    private void lbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseClicked
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza qe deseja sair?", null, JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_lbl_CloseMouseClicked

    private void btn_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarMouseClicked
        if(txt_localizacao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos!", "[ERRO]", JOptionPane.WARNING_MESSAGE);
        } else {
            Porta porta = new Porta();
            MinhasPortas minhasPortas = new MinhasPortas();
            PortaDAO portadao = new PortaDAO();
            porta.setLocalizacao(txt_localizacao.getText());
            portadao.create(porta);
            minhasPortas.readJTablePortas();
        }
    }//GEN-LAST:event_btn_cadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroPorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPorta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_minhasPortas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Close;
    private javax.swing.JPanel panel_Home;
    private javax.swing.JPanel panel_Pets;
    private javax.swing.JPanel panel_Portas;
    private javax.swing.JTextField txt_localizacao;
    // End of variables declaration//GEN-END:variables
}
