package studio.coffeesocial.advent.days;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTwoTest {
/*
Here are the initial and final states of a few more small programs:

1,0,0,0,99 becomes 2,0,0,0,99 (1 + 1 = 2).
2,3,0,3,99 becomes 2,3,0,6,99 (3 * 2 = 6).
2,4,4,5,99,0 becomes 2,4,4,5,99,9801 (99 * 99 = 9801).
1,1,1,4,99,5,6,0,99 becomes 30,1,1,4,2,5,6,0,99.
 */
    List<Integer> intCodeOne = Arrays.asList(1, 0, 0, 0, 99);
    List<Integer> intCodeTwo = Arrays.asList(2,3,0,3,99);
    List<Integer> intCodeThree = Arrays.asList(2,4,4,5,99,0);
    List<Integer> intCodeFour = Arrays.asList(1,1,1,4,99,5,6,0,99);

    /*
Once you have a working computer, the first step is to restore the gravity assist program (your puzzle input) to
the "1202 program alarm" state it had just before the last computer caught fire. To do this, before running the program,
replace position 1 with the value 12 and replace position 2 with the value 2.
What value is left at position 0 after the program halts?
     */
    @Test
    void runProgram() {
        var dayTwo = new DayTwo();

        assertEquals(2, dayTwo.runProgram(intCodeOne, 0, 0, 0));
        assertEquals(6, dayTwo.runProgram(intCodeTwo, 3, 3, 0));
        assertEquals(9801, dayTwo.runProgram(intCodeThree, 5, 4, 4));
        assertEquals(30, dayTwo.runProgram(intCodeFour, 0,1,1));
    }
}
