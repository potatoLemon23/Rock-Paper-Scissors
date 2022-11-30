import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        
        System.out.println("What is your language?");
       
        Scanner in = new Scanner(System.in);
        int i = 10;
        String s = in.nextLine();

        switch (s) {
            case "English": 
                System.out.println("Hello!");
                break;
            case "French": 
                System.out.println("Bonjour!");
                break;
            case "Spanish": 
                System.out.println("¡Hola!");
                break;
            case "Korean": 
                System.out.println("안녕하세요");
                break;
            case "German": 
                System.out.println("Hallo!");
                break;
            case "Hawaiian": 
                System.out.println("Aloha!");
                break;
        }

    }
}
