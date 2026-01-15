interface Flyable{
    void fly();
}

interface Swimable{
    void swim();
}

class Bird{
    private Flyable flyable;
    private Swimable swimable;

    public void eat(){
        System.out.println("This bird can eat");
    }
    
    public void setFlyable(String str){
        flyable.fly();
    }

    public void setSwimmable(String str){
        swimable.swim();
    }
}

public class SeparateWhatVaries{
    public static void main(String args[]){
        Bird b = new Bird();
        b.eat();
    }
}