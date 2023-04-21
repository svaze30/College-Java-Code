import java.util.Scanner;

public class Banking {
    float initialBal;
    float Bal;
    float rateOfInterest;
    Scanner scan = new Scanner(System.in);
    Banking() {

        System.out.println("Enter the Initial Balance ");
        this.initialBal = scan.nextFloat();
        this.Bal = this.initialBal;
        System.out.println("Enter the Rate of Interest ");
        this.rateOfInterest = scan.nextFloat();
    }

    void deposit(float money) {
        Bal = Bal + money;
    }
    void withdraw(float money) {
        Bal = Bal - money;
    }

    void compoundInterest(float n, float t) {
        float add = (float)Bal * (float)(Math.pow((float)1 + (float)rateOfInterest/(100*n) , (float)n * t));
        System.out.println(add);
    }

    void balance(){
        System.out.println("The current Balance is " + Bal);
    }
    void displayMenu () {
        System.out.println("Enter 1 to know balance");
        System.out.println("Enter 2 to deposit");
        System.out.println("Enter 3 to withdraw");
        System.out.println("Enter 4 to know compound interest");
        System.out.println("Enter 0 or any other key to exit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 :
                balance();
                displayMenu();

            case 2:
                System.out.println("Enter the money to be deposited");
                float money = scan.nextFloat();
                deposit(money);
                balance();
                displayMenu();

            case 3:
                System.out.println("Enter the money to be withdrawed");
                float money1 = scan.nextFloat();
                withdraw(money1);
                balance();
                displayMenu();

            case 4:
                System.out.println("Enter the number of times interest applied per time period");
                float n = scan.nextFloat();
                System.out.println("Enter the number of time period");
                float t = scan.nextFloat();
                compoundInterest(n,t);
                displayMenu();

            default:
                break;
        }

    }

    public static void main(String[] args) {
        Banking bank = new Banking();
        bank.displayMenu();
    }

}
