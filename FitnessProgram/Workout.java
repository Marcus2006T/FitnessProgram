

public class Workout
{
    private String exerciseName;
    private int sets;
    private int reps;
    
    // Constructor
    public Workout(String exerciseName, int sets, int reps) {
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
    }
        // Method to display workout info
        public void displayWorkout() {
            System.out.println(exerciseName + " : " + sets + " sets x " + reps + "reps");
        }
        
    }
    
