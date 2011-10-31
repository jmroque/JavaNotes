/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JdlgNote.java
 *
 * Created on 10/29/2011, 04:50:45 PM
 */

package javanotes;

/**
 *
 * @author Juan Manuel
 */
public class JdlgNote extends javax.swing.JDialog {

    /** Creates new form JdlgNote */
    public JdlgNote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JpnTitle.setVisible(false);
        //JtxtNote.setSize(this.getSize());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JpnTitle = new javax.swing.JPanel();
        JlblClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtxtNote = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        JpnTitle.setBackground(new java.awt.Color(204, 204, 255));
        JpnTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JpnTitleMouseDragged(evt);
            }
        });

        JlblClose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JlblClose.setForeground(new java.awt.Color(102, 102, 102));
        JlblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblClose.setText("X");
        JlblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JpnTitleLayout = new javax.swing.GroupLayout(JpnTitle);
        JpnTitle.setLayout(JpnTitleLayout);
        JpnTitleLayout.setHorizontalGroup(
            JpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnTitleLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(JlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JpnTitleLayout.setVerticalGroup(
            JpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnTitleLayout.createSequentialGroup()
                .addComponent(JlblClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        JtxtNote.setBackground(new java.awt.Color(255, 255, 204));
        JtxtNote.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JtxtNoteMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(JtxtNote);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
        JpnTitle.setVisible(true);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void JtxtNoteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtNoteMouseMoved
        // TODO add your handling code here:
        if(evt.getY()>1 && evt.getY()<15){
            JpnTitle.setVisible(true);
           //JtxtNote.setSize(JtxtNote.getWidth(),this.getHeight()-JpnTitle.getHeight());
        }else{
            JpnTitle.setSize(JtxtNote.getWidth(), this.getHeight());
            JpnTitle.setVisible(false);
            
        }
    }//GEN-LAST:event_JtxtNoteMouseMoved

    private void JpnTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpnTitleMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_JpnTitleMouseDragged

    private void JlblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlblCloseMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_JlblCloseMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdlgNote dialog = new JdlgNote(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblClose;
    public javax.swing.JPanel JpnTitle;
    public javax.swing.JEditorPane JtxtNote;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}