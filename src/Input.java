
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
            int x = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
            int y = scanner.nextInt();
        System.out.print("Üçüncü Sayıyı giriniz:");
            int z = scanner.nextInt();
System.out.println("3 Sayı arasından En Küçük sayı= "+Math.min(Math.min(x, y),Math.min(y, z)));
System.out.println("3 Sayı arasından En Büyük sayı= "+Math.max(Math.max(x, y),Math.max(y, z)));
        
       
        
        
}
  
    
}
