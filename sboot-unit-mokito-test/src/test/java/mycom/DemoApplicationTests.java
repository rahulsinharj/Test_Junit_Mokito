package mycom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    private Calculator c = new Calculator();

    @Test
    @Disabled
    void contextLoads() {

    }

    @Test
    void testSum() {
        // Expected
        int expectedResult = 17;

        // Actual
        int actualResult = c.doSum(12, 3, 2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testProduct() {
        // Expected
        int expectedResult = 20; // 21;

        // Actual
        int actualResult = c.doProduct(5, 4);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testCompareTwoNums() {
        boolean actualResult = c.compareTwoNums(4, 4);

        assertThat(actualResult).isTrue();
    }

    @BeforeEach
    void setUp()                    // Har ek Test method ke "pehle" ye method chalega
    {
        System.out.println("Setting up - before every Test method");
    }

    @AfterEach
    void tearDown()                 // Har ek Test method ke "baad" ye method chalega
    {
        System.out.println("Tearing down - after every Test method");
    }

}
