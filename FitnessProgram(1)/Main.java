import java.util.Scanner;
public class Main
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to FitnessProgram!");
        
        // Get user info
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        User user1 = new User(name, age, height, weight);
        user1.displayInfo();
        
        // Create program
        Program myProgram = new Program();
        
        // Add exercises dynamically
        System.out.print("\nHow many exercises do you want to add? ");
        int exerciseCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < exerciseCount; i++) {
            System.out.print("\nEnter exercise name: ");
            String exerciseName = scanner.nextLine();
            
            System.out.print("Enter number of sets: ");
            int sets = scanner.nextInt();
            
            System.out.print("Enter number of reps: ");
            int reps = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            Workout workout = new Workout(exerciseName, sets, reps);
            myProgram.addWorkout(workout);
        }
        
        // Display program
        myProgram.displayProgram();
        System.out.println("Total reps in program: " + myProgram.totalReps());
        
        
        // Display calories burned per exercise
        System.out.println("\nEstimated calories burned per exercise:");
        for(Workout w : myProgram.getWorkouts()) {
            double calories = w.calculateCalories(user1.getWeight());
            System.out.println(w.getExerciseName() + ": " + String.format("%.2f", calories) + " kcal");
        }
        
        
        
        // Track weight progress
        System.out.print("\nEnter current weight for progress tracking: ");
        double newWeight = scanner.nextDouble();
        double weightChange = newWeight - user1.getWeight();
        user1.setWeight(newWeight);
        System.out.println("Weight change: " + weightChange + " kg");
        
        // BMI calculation
        double heightMeters = user1.getHeight() / 100.0;
        double bmi = newWeight / (heightMeters * heightMeters);
        System.out.println("BMI: " + String.format("%.2f", bmi));
        
        scanner.close();
        
        System.out.println("\nThank you for using FitnessProgram!");
    }
}
    
    
    
