/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdb;

import fr.seb.database.utils.DatabaseTools;
import fr.seb.swingDB.frame.LoginFrame;

/**
 *
 * @author formation
 */
public class SwingDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Création d'une instance de la fenêtre de login
        LoginFrame app = new LoginFrame();
        
        //Affichage de la fenêtre
        app.setVisible(true);
        //Centrage de la fenêtre sur l'écran
        app.setLocationRelativeTo(null);
    }
    
}
