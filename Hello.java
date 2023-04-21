import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0 ; i < t ; t++) {
            String txt = scan.nextLine();
            int count = 0;
            for (int j = 0 ; j < txt.length() - 1; j++) {
                if (txt.charAt(j) == '_' && txt.charAt(j+1) == '_') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
