public class Workout {
    private String exerciseName;
    private int sets;
    private int reps;
    private double met;
    public Workout(String exerciseName, int sets, int reps) {
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
        this.met = 6;
    }
    
    public void setMet(double met) {
        this.met = met; }
    
    public void displayWorkout() {
        System.out.println(exerciseName + ": " + sets + " sets x " + reps + " reps");
    }
    
    // Optional: getters for progress tracking
    public int getSets() {
        return sets;
    }
    
    public int getReps() {
        return reps;
    }
    
    public String getExerciseName() {
        return exerciseName;
    }
    
    // Calculator Calories Burned
    
    public double calculateCalories(double weightKg) {
        //Estimate duration in hours: assume 2 minutes per set
        double durationHours = (sets * 2.0) / 60.0;
        return met * weightKg * durationHours;
    }
}