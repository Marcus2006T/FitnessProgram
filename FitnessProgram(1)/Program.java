import java.util.ArrayList;

public class Program {
    private ArrayList<Workout> workouts;
    
    public Program() {
        workouts = new ArrayList<>();
    }
    
    public void addWorkout(Workout w) {
        workouts.add(w);
    }
    
    public void displayProgram() {
        System.out.println("\nWorkout Program:");
        for (Workout w : workouts) {
            w.displayWorkout();
        }
    }
    
    // Optional: calculate total reps in program
    public int totalReps() {
        int total = 0;
        for (Workout w : workouts) {
            total += w.getSets() * w.getReps();
        }
        return total;
    }
    
    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }
}