package Coding;

class Dog{
    private String name;
    
    public void setName(String name){
        this.name=name;
        
    }
    public String getName(){
        return name;
    }
}

public class Tester{
    public static void main(String args[]){
        Dog dog= new Dog();
        dog.setName("Nano");
        
        System.out.println(dog.getName());
    }
}
