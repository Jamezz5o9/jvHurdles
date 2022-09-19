package Femi.PollingArrayExercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollTest {
    private Polling poll;
    @BeforeEach
    public void setUp(){
        poll = new Polling();
    }

    @Test
    public void breakUp(){
        //given
        int[] polls = {10, 20, 30, 40, 50};
        //when
//        double average = poll.calcAverage(polls);
        //assert
       // assertEquals(30, average);

    }

}
