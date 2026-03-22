public class User
{
   private String name;
   private int age;
   private double height;
   private double weight;
   
   //Constructor
   
   public User(String name, int age, double height, double weight) {
       this.name = name;
       this.age = age;
       this.height = height;
       this.weight = weight;
   }
   
   
   public void displayInfo() {
       System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height + " cm, Weight: " + weight + " kg");
   }
   
   
   
    }
