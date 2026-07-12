package real.tests;

import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;


public class TestSetup {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000; // обычно 4000
    }
}
