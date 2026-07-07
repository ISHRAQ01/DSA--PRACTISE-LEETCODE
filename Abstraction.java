public class Abstraction {
    public static void main(String[] args){
    Cat c= new Cat();
    c.eats();
    c.walk();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("CONSTRUCTOR OF ANIMAL");
    }
    void eats(){
        System.out.println("ANIMAL EATS ANYTHING");
    }

    abstract void walk();
}

class Cat extends Animal{
    Cat(){
        System.out.println("CAT CLASS CONSTRUCTOR");
    }
    void walk(){
        System.out.println("CAT WALKS ON 4 LEGS");
    }
}