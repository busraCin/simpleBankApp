
/*
 * @author busra
 */

public class Main {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        
        Account account = new Account("Büşra Cin","12345",7500);
        
        bank.Run(account);
        System.out.println("Programdan Çıkılıyor..");
        
  
     }
    
 
}
