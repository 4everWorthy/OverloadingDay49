package org.example;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Animal class
        Animal animal1 = new Animal("Buddy", true);
        Animal animal2 = new Animal("Whiskers");
        Animal animal3 = new Animal();

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        // Demonstrate TvShow class
        TvShow show1 = new TvShow("Breaking Bad", 62, "Drama");
        TvShow show2 = new TvShow("Game of Thrones", "Fantasy");
        TvShow show3 = new TvShow();

        System.out.println(show1);
        System.out.println(show2);
        System.out.println(show3);

        // Demonstrate Book class
        Book book1 = new Book("To Kill a Mockingbird", 281, 1960);
        Book book2 = new Book("A Brief History of Time", 256);
        Book book3 = new Book();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // Demonstrate Counter class
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        counter1.increase();
        counter2.increase(5);

        System.out.println("Value of counter1 after increase: " + counter1.value());
        System.out.println("Value of counter2 after increase by 5: " + counter2.value());

        counter1.decrease();
        counter2.decrease(3);

        System.out.println("Value of counter1 after decrease: " + counter1.value());
        System.out.println("Value of counter2 after decrease by 3: " + counter2.value());
    }
}
