
import java.util.Scanner;


public class Bank {
    
    public void Run(Account account){
        
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println(" ");
        
        byte attemptsLeft = 3;
        
        while(true){
            if(login.login(account)){
                System.out.println("HOŞGELDİNİZ");
                break;
            }else{
                
                attemptsLeft -= 1;
                System.out.print("Kullanıcı Adınızı veya Şifrenizi Yanlış Girdiniz.Kalan Giriş Hakkınız :" +attemptsLeft);
            }
            
            if(attemptsLeft ==0){
                
                System.out.println("3 Defa Yanlış Giriş Yaptınız");
                return;
                
            }
            
        }
        
        String actions = "1. Bakiye Görüntüleme\n"
                +"2. Para Yatırma \n"
                +"3.Para Çekme \n"
                +"4. Çıkış Yapma";
        System.out.println(actions);
        
        while(true){
            System.out.println("Lütfen Yapmak İstediğiniz İşlemin Numarasını Giriniz");
            String action = scanner.nextLine();
            
            
            if(action.equals("1")){
                System.out.println("Güncel Bakiyeniz : " + account.getBalance());
            }
            else if(action.equals("2")){
                
                System.out.println("Yatırmak İstediğiniz Tutar");
                int sum = scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(sum);
                
            }
            else if (action.equals("3")){
                System.out.println("Çekmek İstediğiniz Tutar");
                int sum = scanner.nextInt();
                scanner.nextLine();
                account.withhdrawMoney(sum);
            }
            
            else if(action.equals("4")){
                System.out.println("Sistemden Çıkış Yapılıyor..");
                break;
            }
            else System.out.println("Geçersiz İşlem Seçimi..");
            
        }
  
        
    }
    
    
    
}
