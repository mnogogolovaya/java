package perevertysh;
import java.util.Scanner;
public class Perevertysh {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scn.nextLine();
        
        System.out.println("Перевертыш: ");
        StringBuffer buffer = new StringBuffer(""+str);
        buffer.reverse();
        System.out.println(buffer);
        String strPer = str;
        
        int count = 0;
        if(str.length() != 0){
            count++;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов(а)");
    }
}
