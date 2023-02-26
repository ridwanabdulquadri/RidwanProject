package chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
//    Clock clock;
//    @BeforeEach
//    public void setUp() {
//        clock = new Clock(9, 45, 53);
//    }

    @Test
    public void testThatClockHourWorks(){
        Clock clock = new Clock(7, 45, 12);
        Assertions.assertEquals(7, clock.getHour());
    }
    @Test
    void testThatClockMinutesWork(){
        Clock clock = new Clock(7,45,12);
        Assertions.assertEquals(45,clock.getMinutes());
    }
    @Test
    void testThatClockSecondWork(){
        Clock clock = new Clock(7,45,12);
        Assertions.assertEquals(12,clock.getSecond());
    }





}
