/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_lecture_code;

/**
 *
 * @author nasha
 */
public class mouse_class extends java.awt.Frame {

    /**
     * Creates new form mouse_event
     */
    public mouse_class() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new java.awt.Label();
        t1 = new java.awt.TextField();

        setMinimumSize(new java.awt.Dimension(390, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setAlignment(java.awt.Label.CENTER);
        l1.setBackground(java.awt.Color.red);
        l1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        l1.setName("l1"); // NOI18N
        l1.setText("MOUSE EVENT");
        add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 30));

        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                t1MouseReleased(evt);
            }
        });
        add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        t1.setText("mouse clicked");
    }//GEN-LAST:event_t1MouseClicked

    private void t1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseEntered
        t1.setText("mouse entered");
    }//GEN-LAST:event_t1MouseEntered

    private void t1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseExited
        t1.setText("mouse exited");
    }//GEN-LAST:event_t1MouseExited

    private void t1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MousePressed
        t1.setText("mouse pressed");
    }//GEN-LAST:event_t1MousePressed

    private void t1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseReleased
        t1.setText("mouse released");
    }//GEN-LAST:event_t1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mouse_class().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label l1;
    private java.awt.TextField t1;
    // End of variables declaration//GEN-END:variables
}
