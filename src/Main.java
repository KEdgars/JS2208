import java.util.Scanner;
    public class Main {


    public static void main(String[] args) {
        DBlogic db = new DBlogic();

        Scanner scan = new Scanner(System.in);

        System.out.println("Username");
        String username = scan.nextLine();
        System.out.println("pasword");
        String pasword = scan.nextLine();

        db.register(username, pasword);



    }

}