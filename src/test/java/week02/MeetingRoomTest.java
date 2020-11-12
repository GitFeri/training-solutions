package week02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MeetingRoomTest {

    @Test
    public void testCreate() {
        // Given

        MeetingRoom meetingRoom = new MeetingRoom("Szoba",10,20);

        // when

        int area = meetingRoom.getArea();

        // Then

        assertEquals (200, area);



    }

}
