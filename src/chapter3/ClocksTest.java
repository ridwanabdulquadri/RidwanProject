package chapter3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClocksTest {
    private Clocks clocks = new Clocks(7,10,60);

    @Test
    public void checkYourClockHour(){
        Assertions.assertEquals(7,clocks.getHour());

    }


}