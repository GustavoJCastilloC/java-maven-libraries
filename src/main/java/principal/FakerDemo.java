package principal;

import com.github.javafaker.Faker;

public class FakerDemo {
    public static void main(String[] args) {
        final var faker = new Faker();

        System.out.printf("nombre: %s%n", faker.name().name());
    }
}