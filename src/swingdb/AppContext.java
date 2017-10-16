/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdb;

import fr.seb.swingDB.entity.User;

/**
 *
 * @author Administrateur
 */
public class AppContext {
    
    private static User CurrentUser ;

    public static User getCurrentUser() {
        return CurrentUser;
    }

    public static void setCurrentUser(User CurrentUser) {
        AppContext.CurrentUser = CurrentUser;
    }
    
    
}
