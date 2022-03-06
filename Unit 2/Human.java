/**
* Name: Elisa Suo
* Date: Feb 25
* Description: Create a human class 
*/

public class Human {

   /*
   Attributes 
   */
   
   /** the name of a human */
   private String name;
   
   /** the age of a human */
   private int age; 
   
   /** the height of a human (in cm) */  
   private double height;
   
   /** the weight of a human (in kg) */
   private double weight;
   
   /** the energy level of a human (0-100%) */
   private double energyLevel;
   
   /* 
   Constructor 
   */
   
   /**
   Human
   Creates a human
   @param name the name of a human
   @param age the age of the human
   @param height the height of a human in centimeter
   @param weight the weight of the human in kilogram
   @param energyLevel the energy level of a human in percentage
   */
   public Human(String name, int age, double height, double weight, double energyLevel){
   this.name = name; //we are initializing the attribute with the parameter
   this.age = age;
   this.height = height;
   this.weight = weight;
   this.energyLevel = energyLevel;
      
      //setting restrictions for energyLevel attribute
      if (energyLevel < 0) {
         this.energyLevel = 0;
      } 
      else if (energyLevel > 100) {
         this.energyLevel = 100;
      } 
      else {
         this.energyLevel = energyLevel;
      }
   }
   
   /* 
   Methods 
   */
   //Accessors

   /**
   Gets the name of human 
   @return the human name 
   */ 
   public String getName() {
      return this.name;
   }
   
   /**
   Gets the age of a human 
   @return the human age 
   */ 
   public int getAge() {
      return this.age;
   }
   
   /**
   Gets the height of human 
   @return the human height in centimeter 
   */ 
   public double getHeight() {
      return this.height;
   }
   
   /**
   Gets the weight of human 
   @return the human human in kilogram 
   */ 
   public double getWeight() {
      return this.weight;
   }
   
   /**
   Gets the energy level of human 
   @return the human energy level in percentage 
   */ 
   public double getEnergyLevel() {
      return this.energyLevel;
   }   
   
   /*
   Mutators
   */
   
   /**
   changes the weight of the human;
   @param newWeight expected new weight value
   */
   public void setWeight(double newWeight) {
   //make it not bigger than original, must be > 0
      if (newWeight > this.weight) {
         this.weight = this.weight; //not to do anything
      } else if (newWeight <= 0)  { //restriction from negative weight
         this.weight = 0; 
      } else { //all other cases
         this.weight = newWeight;
      }
   }
   
   /**
   changes the energy level of the human;
   @param newEnergyLevel expected new energy level 
   */
   public void setEnergyLevel(double newEnergyLevel) {
      
      if (newEnergyLevel > this.energyLevel) {
         this.energyLevel = this.energyLevel; 
      } else if (newEnergyLevel <= 0)  { //restriction from negative energy level
         this.energyLevel = 0; 
      } else { //all other cases
         this.energyLevel = newEnergyLevel;
      }
   }
   
   public void sleep(int hours){
      energyLevel = this.energyLevel + hours * 0.1;
   }
   
   public void run(double km){
      energyLevel = this.energyLevel + km * 0.001;
   }
   
   public String toString(){
      return "My name is: " + name + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + "\nEnergyLevel: " + energyLevel + "\n";
   }
}

   /**
   create two human
   */
   class TestHuman{
      public static void main(String[] args){
         Human human1 = new Human("Crystal", 30, 1.68, 43, 90);
         human1.sleep(10);
         Human human2 = new Human("Karry", 23, 1.83, 58, 75);
         human1.run(10);
         System.out.println(human1.toString());
         System.out.println(human2.toString());
      }
   }