package Tools;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Roque
 */
public class TrayMyApp {
    
    //se declara el objeto tipo icono
    TrayIcon iconoSystemTray;
    private String appName="";
    
    //Removiendo TryIcon
    public TrayMyApp() {
        SystemTray.getSystemTray().remove(iconoSystemTray);
    }

    //Creando TryIcon
    public TrayMyApp(String appName, String pathIcon, ActionListener listenerNew,
                     ActionListener listenerAbout) {
        this.appName=appName;
        
        if(SystemTray.isSupported()){
            //Se obtiene una instancia estática de la clase SystemTray
            SystemTray tray = SystemTray.getSystemTray();
            Image imagenIcono = Toolkit.getDefaultToolkit().getImage(pathIcon);

              //Este listener nos permite capturar cualquier tipo de evento
              //que se haga con el mouse sobre el icono
//              MouseListener mouseListener = new MouseListener() {
//                    public void mouseClicked(MouseEvent e) {
//                        System.out.println("Icono del System Tray - Mouse clicked!");
//                    }
//                    public void mouseEntered(MouseEvent e) {
//                        System.out.println("Icono del System Tray - Mouse entered!");
//                    }
//                    public void mouseExited(MouseEvent e) {
//                        System.out.println("Icono del System Tray - Mouse exited!");
//                    }
//                    public void mousePressed(MouseEvent e) {
//                        System.out.println("Icono del System Tray - Mouse pressed!");
//                    }
//                    public void mouseReleased(MouseEvent e) {
//                        System.out.println("Icono del System Tray - Mouse released!");
//                    }
//              };

                //Este listener se asociara con un item del menu contextual
                //que aparece al hacer click derecho sobre el icono
                ActionListener escuchadorSalir = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(JOptionPane.showConfirmDialog(null, "Desea cerrar la aplicación " + getAppName() + "?")==0){
                            System.exit(0);
                        }
                    }
                };

                //menu que aparece al hacer click derecho
                PopupMenu popup = new PopupMenu();
                MenuItem newItem = new MenuItem("Add new " + getAppName());
                MenuItem helpItem = new MenuItem("About... ");
                MenuItem item = new MenuItem("Exit Application");


                item.addActionListener(escuchadorSalir);
                newItem.addActionListener(listenerNew);
                helpItem.addActionListener(listenerAbout);
                popup.add(newItem);
                popup.add(helpItem);
                popup.add(item);

                iconoSystemTray = new TrayIcon(imagenIcono, appName, popup);
                
                //este tipo de listener captura el doble click sobre el icono
                ActionListener accionMostrarMensaje = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //iniciamos el objeto TrayIcon
                        iconoSystemTray.displayMessage(getAppName(),
                                "Application is running",
                                TrayIcon.MessageType.INFO);
                    }
                };

                iconoSystemTray.setImageAutoSize(true);
                iconoSystemTray.addActionListener(accionMostrarMensaje);
                iconoSystemTray.addActionListener(listenerNew);
                //iconoSystemTray.addMouseListener(mouseListener);

                //se debe capturar una excepción en caso que falle la adicion de un icono
                try {
                    tray.add(iconoSystemTray);
                } catch (AWTException e) {
                    System.err.println("No es posible agregar el icono al System Tray.  "
                                     + "Sistema NO compatible!");
                }
        }
    }

    public String getAppName() {
        return appName;
    }

}
