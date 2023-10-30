import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int l = str1.length();
        for (int i = 0; i < l ; i++) {
            if( str1.charAt(i)=='1' && str2.charAt(i)=='1' ){
                System.out.print("1");
            }else if( str1.charAt(i)=='0' && str2.charAt(i)=='0' ){
                System.out.print("0");
            }else if(str1.charAt(i)=='0' && str2.charAt(i)=='1' || str1.charAt(i)=='1' && str2.charAt(i)=='0'){
                System.out.print("0");
            }
        }
    }


}
