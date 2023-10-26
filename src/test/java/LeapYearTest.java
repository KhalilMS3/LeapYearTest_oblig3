
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.*;



public class LeapYearTest {

    /*
    As we see here I used '@ParameterizedTest' with '@ValueSoruce' to test several values of years in my tests
    and avoid many assert-functions
    * */
    // ---- Leap years ----

    @ParameterizedTest
    @ValueSource(ints = {2000, 2020, 2400})
    public void testLeapYearIsDivisibleBy4AndNotBy100(int year){
        assertTrue(LeapYear.isLeapYear((year)));
    }

    @ParameterizedTest
    @ValueSource(ints = {1600, 2000, 2400})
    public void testLeapYearIsDivisibleBy400(int year){
        assertTrue(LeapYear.isLeapYear((year)));

    }

}
