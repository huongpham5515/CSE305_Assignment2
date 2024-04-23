
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class UserFunction {
    public static List<User> UserList = new ArrayList<>();
    public static boolean createUser(String ID, String password, String email, String UserType) {
       for(User user : UserList){
           if(user.UserID.equals(ID)){
               return false;
           }        
       }
       return true;
    }
    
    public static boolean resetPassword(String ID, String password, String email, String UserType){
         for(User user : UserList){
           if(user.Password.equals(password)){
               return true;
           }        
       }
       return true;
    
    }
}
