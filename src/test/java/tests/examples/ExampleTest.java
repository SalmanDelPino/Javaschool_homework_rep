package tests.examples;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ExampleTest {

    @Test
    void firstTest() {
        System.out.println("Amerika ya!");
    }

    @Test
    void secondTest() {
        System.out.println("Hallo! Hallo! Hallo!");
    }
}
