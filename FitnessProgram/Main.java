public class Main {
public static void main (String [] args) {
    System.out.println("Welcome To Fitness Program!");
    // create a user
    User user1 = new User("Marcus", 20, 170, 70);
    user1.displayInfo();
    
    // create a program
    Program myProgram = new Program();
    Workout pushups = new Workout("Push-ups", 3, 15);
    myProgram.addWorkout(pushups);
    
    myProgram.displayProgram();
}
}
