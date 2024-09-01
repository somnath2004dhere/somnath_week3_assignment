package Assignment3;

//Abstract class  

abstract class Animal {

 public abstract void sound();
 
 
 public void sleep() {
     System.out.println("The animal is sleeping.");
 }
}

//Interface
interface Pet {

 void play();
}


class Dog extends Animal implements Pet {
 
 public void sound() {
     System.out.println("The dog says: Woof Woof");
 }
 

 public void play() {
     System.out.println("The dog is playing with a another dog.");
 }
}

public class Main {
 public static void main(String[] args) {
   
     Dog dog = new Dog();

     dog.sound(); 
     dog.play();  
     dog.sleep();  
 }
}

