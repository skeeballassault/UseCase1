/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class UserList {
    
    private static List<User> users;
    
    public static synchronized void readUsers(){
        if(null == users){
            users = new ArrayList<User>();
            String File = ("USERS.csv");
            Scanner scan = new Scanner (UserList.class.getResourceAsStream(File));
            String line;
            while((line = scan.nextLine()) != null){
                String[] tokens = line.split(",");
                //Line for user creatiin based on split line
                //Tokens correspond to each CSV value in the row, increase based on amount of fields
                //users.add(new User(Integer.parseInt(tokens[0]), tokens[1], tokens[2]) {});
            }
            scan.close();
        }
    }
    
//    public static synchronized boolean find(String username, String password){
//    if(null == users){
//        throw new IllegalStateException("user list is not initialised");
//    }
//
//    return users.stream()
//            .filter(u -> u.getUsername().equals(username))
//            .filter(u -> u.getPassword().equals(password))
//            .findFirst()
//            .isPresent();
//    }
    
}
