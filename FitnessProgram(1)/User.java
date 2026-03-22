public class User {
    private String name;
    private int age;
    private double height; // in cm
    private double weight; // in kg
    
    public User(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + 
                           ", Height: " + height + " cm, Weight: " + weight + " kg");
    }
    
    // Getters for tracking progress
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    // Setter for updating weight
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }
}