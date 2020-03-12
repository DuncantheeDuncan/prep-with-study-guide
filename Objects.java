package codes;

public class Objects {
    interface beaviors{
        String speak();
          String  move();

    }

    static class Animal implements beaviors {
        public String speak() {
            String speak ="This Animal speaks";
            return speak;
        }
        public String move() {
            String move ="This Animal moves forward";
            return move;
        }

    }



    static class Goose extends Animal{


    }
    Animal goose = new Goose();
    public Animal getFifi() {
        goose.move();
        goose.speak();

        return goose;

    }

    class Lynx extends Animal{

    }
    Animal lynx = new Lynx();

    public Animal getLynx() {
        lynx.move();
        lynx.speak();

        return lynx;
    }

    public static void main(String[] args) {
        Animal animal = new  Animal();
        Goose goose = new Goose();

        System.out.println(goose.move());
        System.out.println(goose.speak());

        System.out.println(animal.move());
        System.out.println(animal.speak());



    }
}

