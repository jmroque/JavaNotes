
package javanotes;

import Entities.Notes;
import Threads.ActionNote;
import Tools.RandomColor;
import Tools.Serializator;
import Utilities.DateManager;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Manuel
 */
public class JdlgNote extends javax.swing.JDialog  {

    /** Creates new form JdlgNote */
    public JdlgNote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JpnTitle.setVisible(false);
        this.setSize(this.getWidth(), JtxtTitle.getHeight()+ JtxtNote.getHeight());
        new RandomColor(JtxtNote, JtxtTitle, JpnBackgrounNote);
    }

    private boolean pin=false;
    private boolean roll=false;
    public static final String DEFAULT_TITLE="[Untitle Note]";
    private static final float TRANS_LOW=0.95f;
    private static final float TRANS_MEDIUM=0.80f;
    private static final float TRANS_HIGH=0.60f;
    private boolean newNote=true;
    private String myHashCode=String.valueOf(this.hashCode());
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnBackgrounNote = new javax.swing.JPanel();
        JpnTitle = new javax.swing.JPanel();
        JbtnSettings = new javax.swing.JButton();
        JbtnTrash = new javax.swing.JButton();
        JbtnRoll = new javax.swing.JButton();
        JbtnHide = new javax.swing.JButton();
        JbtnPin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtxtNote = new javax.swing.JEditorPane();
        JtxtTitle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.yellow);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JpnBackgrounNote.setBackground(new java.awt.Color(255, 255, 204));
        JpnBackgrounNote.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JpnBackgrounNoteMouseMoved(evt);
            }
        });

        JpnTitle.setBackground(new java.awt.Color(204, 204, 255));
        JpnTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpnTitleMouseEntered(evt);
            }
        });
        JpnTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JpnTitleMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JpnTitleMouseMoved(evt);
            }
        });
        JpnTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JpnTitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JpnTitleFocusLost(evt);
            }
        });

        JbtnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings-icon.png"))); // NOI18N
        JbtnSettings.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JbtnSettings.setBorderPainted(false);
        JbtnSettings.setContentAreaFilled(false);
        JbtnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSettingsActionPerformed1(evt);
            }
        });

        JbtnTrash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bin-closed-icon.png"))); // NOI18N
        JbtnTrash.setToolTipText("Trash note");
        JbtnTrash.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JbtnTrash.setBorderPainted(false);
        JbtnTrash.setContentAreaFilled(false);
        JbtnTrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnTrashActionPerformed(evt);
            }
        });

        JbtnRoll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rolldown note-icon.png"))); // NOI18N
        JbtnRoll.setToolTipText("Roll up/Down");
        JbtnRoll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JbtnRoll.setBorderPainted(false);
        JbtnRoll.setContentAreaFilled(false);
        JbtnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnRollActionPerformed(evt);
            }
        });

        JbtnHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/note-delete-icon.png"))); // NOI18N
        JbtnHide.setToolTipText("Hide note");
        JbtnHide.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JbtnHide.setBorderPainted(false);
        JbtnHide.setContentAreaFilled(false);
        JbtnHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnHideActionPerformed(evt);
            }
        });

        JbtnPin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unpin-icon.png"))); // NOI18N
        JbtnPin.setToolTipText("Stay on top");
        JbtnPin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JbtnPin.setBorderPainted(false);
        JbtnPin.setContentAreaFilled(false);
        JbtnPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnPinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpnTitleLayout = new javax.swing.GroupLayout(JpnTitle);
        JpnTitle.setLayout(JpnTitleLayout);
        JpnTitleLayout.setHorizontalGroup(
            JpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnTitleLayout.createSequentialGroup()
                .addComponent(JbtnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(JbtnPin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbtnHide, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbtnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbtnTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JpnTitleLayout.setVerticalGroup(
            JpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnTitleLayout.createSequentialGroup()
                .addGroup(JpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbtnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnHide, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnPin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        JtxtNote.setBackground(new java.awt.Color(255, 255, 204));
        JtxtNote.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JtxtNote.setFont(new java.awt.Font("Trebuchet MS", 0, 11));
        JtxtNote.setToolTipText("Enter your text");
        JtxtNote.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                JtxtNoteCaretUpdate(evt);
            }
        });
        JtxtNote.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JtxtNoteMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JtxtNoteMouseMoved(evt);
            }
        });
        JtxtNote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtxtNoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtxtNoteFocusLost(evt);
            }
        });
        JtxtNote.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                JtxtNoteCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        JtxtNote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtxtNoteKeyTyped(evt);
            }
        });
        JtxtNote.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                JtxtNoteVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(JtxtNote);

        JtxtTitle.setBackground(new java.awt.Color(255, 255, 204));
        JtxtTitle.setEditable(false);
        JtxtTitle.setForeground(new java.awt.Color(153, 153, 153));
        JtxtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtxtTitle.setText("[Untitle Note]");
        JtxtTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JtxtTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtxtTitleMouseClicked(evt);
            }
        });
        JtxtTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JtxtTitleMouseMoved(evt);
            }
        });
        JtxtTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtxtTitleFocusLost(evt);
            }
        });

        javax.swing.GroupLayout JpnBackgrounNoteLayout = new javax.swing.GroupLayout(JpnBackgrounNote);
        JpnBackgrounNote.setLayout(JpnBackgrounNoteLayout);
        JpnBackgrounNoteLayout.setHorizontalGroup(
            JpnBackgrounNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JtxtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );
        JpnBackgrounNoteLayout.setVerticalGroup(
            JpnBackgrounNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnBackgrounNoteLayout.createSequentialGroup()
                .addComponent(JpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JtxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnBackgrounNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpnBackgrounNote, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getMyHashCode() {
        return myHashCode;
    }

    public void setMyHashCode(String myHashCode) {
        this.myHashCode = myHashCode;
    }

    private void JpnBackgrounNoteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpnBackgrounNoteMouseMoved
        // TODO add your handling code here:
        JpnTitle.setVisible(true);
    }//GEN-LAST:event_JpnBackgrounNoteMouseMoved

    private void JtxtNoteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtNoteMouseMoved
        // TODO add your handling code here:
        if(evt.getY()>1 && evt.getY()<20){
            //JpnTitle.setVisible(true);
            Thread t=new Thread(new ActionNote(this,2));
            t.start();
        }else{
            //JpnTitle.setVisible(false);
            Thread t=new Thread(new ActionNote(this,1));
            t.start();
            this.setSize(this.getWidth(), JtxtTitle.getHeight()+ JtxtNote.getHeight());
        }
    }//GEN-LAST:event_JtxtNoteMouseMoved

    private void JpnTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpnTitleMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_JpnTitleMouseDragged

    private void JbtnTrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnTrashActionPerformed
        // TODO Trash note
        if(JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this note?")==0){
            try {
                //Eliminando nota
                Serializator.deleteSerialFile("@" + getMyHashCode() + ".jnt");
                //Cerrando nota
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(JdlgNote.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JbtnTrashActionPerformed

    private void JtxtTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtTitleMouseClicked
        // TODO Editting title
        if(evt.getClickCount()==2){
            JtxtTitle.setEditable(true);
            JtxtTitle.selectAll();
            JtxtTitle.requestFocus();
            JtxtTitle.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_JtxtTitleMouseClicked

    private void JtxtTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtTitleFocusLost
        // TODO Lost focuts not editting
        if(JtxtTitle.getText().trim().isEmpty()){
            JtxtTitle.setText(DEFAULT_TITLE);
            JtxtTitle.setEditable(false);
        }else{
            JtxtTitle.setEditable(false);
        }
    }//GEN-LAST:event_JtxtTitleFocusLost

    private void JbtnPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnPinActionPerformed
        // TODO pin/unpin note
        if(pin){
            pin=false;
            this.setAlwaysOnTop(pin);
            pinNote(pin);
        }else{
            pin=true;
            this.setAlwaysOnTop(pin);
            pinNote(pin);
        }
    }//GEN-LAST:event_JbtnPinActionPerformed

    private void JpnTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JpnTitleFocusLost
        // TODO add your handling code here:
        //JpnTitle.setVisible(false);
    }//GEN-LAST:event_JpnTitleFocusLost

    private void JbtnHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnHideActionPerformed
        // TODO hide this note
        this.setVisible(false);
    }//GEN-LAST:event_JbtnHideActionPerformed

    private void JbtnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnRollActionPerformed
        // TODO Rollup/down note:
        if(roll){
            //Alargando:
            this.setSize(this.getWidth(),this.getHeight()+ JtxtNote.getHeight());
            JtxtNote.setVisible(true);
            rollNote(roll);
            roll=false;
            com.sun.awt.AWTUtilities.setWindowOpacity (this,0.70f);
        }else{
            //Encogiendo:
            JpnTitle.setVisible(true);
            JtxtTitle.setVisible(true);
            JtxtNote.setVisible(false);
            this.setSize(this.getWidth(), JpnTitle.getHeight()+JtxtTitle.getHeight()+10);
            rollNote(roll);
            roll=true;
            com.sun.awt.AWTUtilities.setWindowOpacity (this,0.95f);
        }
    }//GEN-LAST:event_JbtnRollActionPerformed

    private void JbtnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSettingsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JbtnSettingsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO Set transparency level:
        com.sun.awt.AWTUtilities.setWindowOpacity (this,TRANS_LOW);

        // TODO Creando objeto .jnt inicial:
        if(newNote){
            Notes note=new Notes(getMyHashCode(), JtxtTitle.getText(), "Home",
                                 JtxtNote.getText(), "No Tag", false, DateManager.getCurrentDate(),
                                 "New");
            new Serializator(note,"@" + getMyHashCode() + ".jnt");
        }
        
        //Set settings popupmenu
        ActionNote an=new ActionNote(this);
        an.dysplayPopup(JbtnSettings);
    }//GEN-LAST:event_formWindowOpened

    private void JtxtNoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtxtNoteKeyTyped
        // TODO add your handling code here:
        ActionNote.getFirstLine(JtxtNote, JtxtTitle);
    }//GEN-LAST:event_JtxtNoteKeyTyped

    private void JtxtNoteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_JtxtNoteCaretUpdate
        //Save data notes:
        Notes note=new Notes(getMyHashCode(), JtxtTitle.getText(), "Normal", JtxtTitle.getText(), 
                             "No Tag", false, DateManager.getCurrentDate(), "Activa");
        new Serializator(note,"@" + getMyHashCode() + ".jnt");
    }//GEN-LAST:event_JtxtNoteCaretUpdate

    private void JtxtNoteCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JtxtNoteCaretPositionChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JtxtNoteCaretPositionChanged

    private void JtxtNoteVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_JtxtNoteVetoableChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JtxtNoteVetoableChange

    private void JtxtTitleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtTitleMouseMoved
        // TODO add your handling code here:
//        Thread t=new Thread(new ActionNote(this,2));
//        t.start();
    }//GEN-LAST:event_JtxtTitleMouseMoved

    private void JbtnSettingsActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSettingsActionPerformed1
        ActionNote an=new ActionNote(this);
        an.dysplayPopup(JbtnSettings);
    }//GEN-LAST:event_JbtnSettingsActionPerformed1

    private void JtxtNoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtNoteFocusLost
        // Set translucent level:
        com.sun.awt.AWTUtilities.setWindowOpacity (this,0.70f);
    }//GEN-LAST:event_JtxtNoteFocusLost

    private void JtxtNoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtxtNoteFocusGained
        // TODO add your handling code here:
        com.sun.awt.AWTUtilities.setWindowOpacity (this,1f);
    }//GEN-LAST:event_JtxtNoteFocusGained

    private void JtxtNoteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtxtNoteMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_JtxtNoteMouseDragged

    private void JpnTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JpnTitleFocusGained
        // TODO add your handling code here:
        com.sun.awt.AWTUtilities.setWindowOpacity (this,1f);
    }//GEN-LAST:event_JpnTitleFocusGained

    private void JpnTitleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpnTitleMouseMoved
        // TODO add your handling code here:
        JpnTitle.setVisible(true);
    }//GEN-LAST:event_JpnTitleMouseMoved

private void JpnTitleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpnTitleMouseEntered
// TODO add your handling code here:
    JpnTitle.setVisible(true);
}//GEN-LAST:event_JpnTitleMouseEntered

    void pinNote(boolean pin){
        if(pin){            
            String path="/Images/pin-minus-icon.png";
            URL url=this.getClass().getResource(path);
            ImageIcon icon=new ImageIcon(url);
            JbtnPin.setIcon(icon);
        }else{
            String path="/Images/unpin-icon.png";
            URL url=this.getClass().getResource(path);
            ImageIcon icon=new ImageIcon(url);
            JbtnPin.setIcon(icon);
        }
    }

    void rollNote(boolean roll){
        if(roll){
            String path="/Images/Rolldown note-icon.png";
            URL url=this.getClass().getResource(path);
            ImageIcon icon=new ImageIcon(url);
            JbtnRoll.setIcon(icon);
        }else{
            String path="/Images/Rollup note-icon.png";
            URL url=this.getClass().getResource(path);
            ImageIcon icon=new ImageIcon(url);
            JbtnRoll.setIcon(icon);
        }
    }

    public void setNewNote(boolean value){
        newNote=value;
    }

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
    public javax.swing.JButton JbtnHide;
    public javax.swing.JButton JbtnPin;
    public javax.swing.JButton JbtnRoll;
    public javax.swing.JButton JbtnSettings;
    public javax.swing.JButton JbtnTrash;
    private javax.swing.JPanel JpnBackgrounNote;
    public javax.swing.JPanel JpnTitle;
    public javax.swing.JEditorPane JtxtNote;
    public javax.swing.JTextField JtxtTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
