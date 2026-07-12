package real.tests;

import org.junit.jupiter.api.BeforeAll;

import java.lang.module.Configuration;

public class TestSetup {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.timeout = "10000"; // обычно 4000
    }
}
