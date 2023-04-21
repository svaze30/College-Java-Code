import java.util.Scanner;

class User {
    String name;
    int age;
    int accountBal;

    User (String name, int age, int accountBal) {
        this.name = name;
        this.age = age;
        this.accountBal = accountBal;
    }

    void watchMovie (Movie m) {
        if (m.cost <= accountBal) {
            if (m.ageReq <= age) {
                this.accountBal = accountBal - m.cost;
                System.out.println("You bought " + m.title + " for " + m.cost  );
                System.out.println("Remaining balance is " + accountBal );
                return;
            }
            else {
                System.out.println("You Cannot buy " + m.title + " because you are smaller than " + m.ageReq);
            }
        } else {
            System.out.println("You Cannot buy " + m.title + " because you dont have enough money" );
        }
    }
    void canWatchMovie (Movie m) {
        if (m.cost > accountBal) {
            System.out.println("You broke ");
        }
        if (m.ageReq > age) {
            System.out.println("You small ");
        }
    }
};
class Movie {
    String title;
    int ageReq;
    int cost;

    Movie(String title, int ageReq, int cost) {
        this.title = title;
        this.ageReq = ageReq;
        this.cost = cost;
    }

};

public class Netflix {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 to enter admin dashboard or 0 to watch movies ");
        int choice  = scan.nextInt();

        if (choice == 1) {

            System.out.println("Enter the number of users you want to add ");
            int numUsers  = scan.nextInt();

            User users[] = new User[numUsers];

            for (int i = 0 ; i < numUsers; i++) {
                System.out.println("Enter the name of user " + i + 1);
                String userName = scan.nextLine();

                System.out.println("Enter the age of user " + i + 1);
                int userAge  = scan.nextInt();

                System.out.println("Enter the account balance of user " + i + 1);
                int userBal  = scan.nextInt();

                users[i] = new User(userName, userAge, userBal);
            }

            System.out.println("Enter the number of Movies you want to add ");
            int numMovies  = scan.nextInt();

            Movie movies[] = new Movie[numMovies];

            for (int i = 0 ; i < numMovies; i++) {
                System.out.println("Enter the name of Movie " + i + 1);
                String movieTitle = scan.nextLine();

                System.out.println("Enter the age of user " + i + 1);
                int movieAge  = scan.nextInt();

                System.out.println("Enter the account balance of user " + i + 1);
                int movieCost  = scan.nextInt();

                movies[i] = new Movie(movieTitle, movieAge, movieCost);
            }

        } else {

        }






    }
};
