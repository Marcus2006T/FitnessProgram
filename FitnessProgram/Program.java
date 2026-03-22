import java.util.ArrayList;
public class Program
{
    private ArrayList<Workout> workouts;
    
    public Program() {
        workouts = new ArrayList<>();
    }
    
    public void addWorkout(Workout w) {
        workouts.add(w);
    }
    
    public void displayProgram() {
        System.out.println("Workout Program:");
        for (Workout w : workouts) {
            w.displayWorkout();
        }
    }
    }
