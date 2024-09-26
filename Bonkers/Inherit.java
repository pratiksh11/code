public class Inherit {
    public static void main(String args[]){
       Fish shark = new Fish();
       shark.eat();
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}
//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
