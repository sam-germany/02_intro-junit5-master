package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("in the BeforeAll ------");
    }

    @BeforeEach
    void setUp() {
        System.out.println("-------------------");
        greeting  = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("sunny"));
    }
    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("sunny"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("------AfterEach");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("in the AfterAll ------");
    }

}
