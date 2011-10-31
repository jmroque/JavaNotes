/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javanotes;

import Threads.StartupApp;

/**
 *
 * @author Juan Roque
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iniciando aplicaicon
        Thread t=new Thread(new StartupApp(new JfrmMenu(), new JfrmSplash()));
        t.start();
    }

}
