package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.name);
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).name);
        }
    }

    public void printEventNames() {
        boolean printable = false;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (printable) {
                System.out.println(meetingRoom.name);
            }
            printable = !printable;
        }

    }

    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println("Tárgyaló neve : " + meetingRoom.name +
                    ", szélessége : " + meetingRoom.width +
                    ", hossza : " + meetingRoom.length +
                    ", területe : " + meetingRoom.width * meetingRoom.length);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.name.equals(name)) {
                System.out.println("Tárgyaló szélessége : " + meetingRoom.width +
                        ", hossza : " + meetingRoom.length +
                        ", területe : " + meetingRoom.width * meetingRoom.length);
            }
        }
    }


    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.name.indexOf(part) >= 0) {
                System.out.println("Tárgyaló neve : " + meetingRoom.name +
                        ", szélessége : " + meetingRoom.width +
                        ", hossza : " + meetingRoom.length +
                        ", területe : " + meetingRoom.width * meetingRoom.length);

            }
        }
    }


    public void printAreasLarger(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if ((meetingRoom.width * meetingRoom.length) >= area) {
                System.out.println("Tárgyaló neve : " + meetingRoom.name +
                        ", szélessége : " + meetingRoom.width +
                        ", hossza : " + meetingRoom.length +
                        ", területe : " + meetingRoom.width * meetingRoom.length);

            }
        }
    }
}