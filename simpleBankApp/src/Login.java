
import java.util.Scanner;


public class Login {
    
    public boolean login (Account account){
        String passworld ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı");
        String userName = scanner.nextLine();
        System.out.print("Parolanız : ");
        passworld = scanner.nextLine();
        
       if(account.getUserName().equals(userName) && account.getPassword().equals(passworld)){
           return true;
       }else return false;
            
 }
    
    
    
    
    
    
    
    
    
}
