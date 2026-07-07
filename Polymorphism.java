public class Polymorphism {
    public static void main(String[] args){
        MethodOverloading calc=new MethodOverloading();
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum((float)4.5,(float)3.4));
        System.out.println(calc.sum(4, 3, 5));

        Dog d= new Dog();
        d.eat();
    }    
}
//Method overriding
class Animal{
    void eat(){
        System.out.println("animals eat anything");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats meat");
    }
}
//method overloading
class MethodOverloading{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}