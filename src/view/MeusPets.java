/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.PetDAO;
import model.bean.Pet;

/**
 *
 * @author user
 */
public class MeusPets extends javax.swing.JFrame {

    /**
     * Creates new form MeusPets
     */
    
    String userLogin;
    
    public MeusPets() {
        initComponents();
        DefaultTableModel defaultTableModel = (DefaultTableModel) jt_pets.getModel();
        jt_pets.setRowSorter(new TableRowSorter (defaultTableModel));
        readJTablePets();
    }
    
    public void lbl_welcome_pet(String string){
        userLogin = string;
    }
    
   public void readJTablePets(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jt_pets.getModel();
        defaultTableModel.setNumRows(0);
        PetDAO petdao = new PetDAO();
        petdao.read(userLogin).forEach((pet) -> {
            defaultTableModel.addRow(new Object[]{
                pet.getIdTag(),
                pet.getLogin(),
                pet.getNomePet()
            });
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lbl_Close2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_excluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_pets = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Close2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Close2.setForeground(new java.awt.Color(255, 102, 0));
        lbl_Close2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        lbl_Close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Close2.setPreferredSize(new java.awt.Dimension(50, 50));
        lbl_Close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Close2MouseClicked(evt);
            }
        });
        jPanel3.add(lbl_Close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_excluir.setBackground(new java.awt.Color(255, 102, 0));
        btn_excluir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");
        btn_excluir.setBorder(null);
        btn_excluir.setContentAreaFilled(false);
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setOpaque(true);
        btn_excluir.setPreferredSize(new java.awt.Dimension(51, 30));
        btn_excluir.setRequestFocusEnabled(false);
        btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_excluirMouseClicked(evt);
            }
        });
        jPanel4.add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 290, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Meus Pets:");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, -1));

        jt_pets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do Pet:", "Login do Usuário:", "Nome do Pet:"
            }
        ));
        jScrollPane1.setViewportView(jt_pets);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 290, 320));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 500));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cat-Login-Form.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_Close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Close2MouseClicked
        CadastroPet cadastroPet = new CadastroPet();
        cadastroPet.lbl_welcome_pet(userLogin);
        cadastroPet.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_Close2MouseClicked

    private void btn_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_excluirMouseClicked
        if(jt_pets.getSelectedRow() != -1){
            Pet pet = new Pet();
            PetDAO petdao = new PetDAO();
            pet.setIdTag((int) jt_pets.getValueAt(jt_pets.getSelectedRow(), 0));
            petdao.delete(pet);
            readJTablePets();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um pet para excluir!");
        }
    }//GEN-LAST:event_btn_excluirMouseClicked

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
            java.util.logging.Logger.getLogger(MeusPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeusPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeusPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeusPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeusPets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_excluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_pets;
    private javax.swing.JLabel lbl_Close2;
    // End of variables declaration//GEN-END:variables
}
