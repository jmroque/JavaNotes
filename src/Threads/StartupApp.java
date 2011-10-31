/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;

import Tools.TrayMyApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javanotes.JfrmMenu;
import javanotes.JfrmSplash;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Roque
 */
public class StartupApp implements Runnable{

    private JfrmMenu note;
    private JfrmSplash splash;
    private StartupApp app=null;

    public StartupApp() {

    }

    public StartupApp(JfrmMenu note, JfrmSplash splash) {
        this.note=note;
        this.splash=splash;
    }

    public void run() {
       //try {
            //Mostrando splash
            //splash.setLocationRelativeTo(null);
            //splash.setVisible(true);
            //Thread.sleep(2000); //Tiempo de splash
            
            //Ocultando splash
            splash.setVisible(false);

            //Mostrando nota
            note.setLocationRelativeTo(null);
            note.setVisible(true);

            //Creando TryIcon
            setTryIcon();

//        } catch (InterruptedException ex) {
//            Logger.getLogger(StartupApp.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    void setTryIcon(){
        //Path de la imagen
        String pathIcon="src/Images/Comment-icon.png";  //Imangen del icono

        //Evento para un nuevo item
        ActionListener listenerNew = new ActionListener() { //ActionListener para nuevo
            public void actionPerformed(ActionEvent e) {
                //Abriendo una nueva nota
                JfrmMenu note=new JfrmMenu();
                note.setVisible(true);
            }
        };

        //Evento para el About...
        ActionListener listenerAbout = new ActionListener() { //ActionListener para nuevo
            public void actionPerformed(ActionEvent e) {
                //Acerca de ...
                JOptionPane.showMessageDialog(note, "Esta aplicacion fue desarrollada por: Juan M Roque \n" +
                                                    "Todos los derechos reservados 2011 ©");
            }
        };

        new TrayMyApp("Java Notes © v1.0.0", pathIcon, listenerNew, listenerAbout);
    }
}
