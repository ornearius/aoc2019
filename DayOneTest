package studio.coffeesocial.advent.days;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {

    DayOne dayone = new DayOne();

    @Test
    void sumFuel() {
        var one = List.of(12);
        assertEquals(2, dayone.sumFuelOne(one));

        var two = List.of(14);
        assertEquals(2, dayone.sumFuelOne(two));

        var three = List.of(1969);
        assertEquals(654, dayone.sumFuelOne(three));

        var four = List.of(100756);
        assertEquals(33583, dayone.sumFuelOne(four));

        var five = List.of(12);
        assertEquals(2, dayone.sumFuelOne(five));
    }

    @Test
    void sumFuelTwo() {
        var one = List.of(12);
        assertEquals(2, dayone.sumFuelTwo(one));

        var two = List.of(14);
        assertEquals(2, dayone.sumFuelTwo(two));

        var three = List.of(1969);
        assertEquals(966, dayone.sumFuelTwo(three));

        var four = List.of(100756);
        assertEquals(50346, dayone.sumFuelTwo(four));

        var five = List.of(12);
        assertEquals(2, dayone.sumFuelTwo(five));
    }
}
