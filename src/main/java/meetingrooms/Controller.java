package meetingrooms;

import java.util.Scanner;

public class Controller {
    private Office office;

    public void readOffice() {
        office = new Office();
        /* Az alábbiakat kommentbe lehet tenni */
        Scanner scanner = new Scanner(System.in);
        int countOfMeetingRooms;
        String name;
        int length;
        int width;

        System.out.println("Hány tárgyalót kíván rögzíteni? : ");
        countOfMeetingRooms = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < countOfMeetingRooms; i++) {
            System.out.println(i + 1 + ". tárgyaló neve       : ");
            name = scanner.nextLine();
            System.out.println(i + 1 + ". tárgyaló szélessége : ");
            width = scanner.nextInt();
            scanner.nextLine();
            System.out.println(i + 1 + ". tárgyaló hosszúsága : ");
            length = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(new MeetingRoom(name, length, width));
        }
        /* */

        /* majd fix feltöltés következhet, ha nincs komment.
        office.addMeetingRoom(new MeetingRoom("Első szoba", 10, 20));
        office.addMeetingRoom(new MeetingRoom("Második szoba", 11, 20));
        office.addMeetingRoom(new MeetingRoom("Harmadik szoba", 12, 20));
        office.addMeetingRoom(new MeetingRoom("Negyedik szoba", 13, 20));

        */
    }


    public void printMenu() {
        System.out.println("   Menü");
        System.out.println();
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        String name;
        System.out.println("Válaszott : ");
        menu = scanner.nextInt();
        scanner.nextLine();

        if (menu == 1) {
            office.printNames();
        } else {
            if (menu == 2) {
                office.printNamesReverse();
            } else {
                if (menu == 3) {
                    office.printEventNames();
                } else {
                    if (menu == 4) {
                        office.printAreas();
                    } else {
                        if (menu == 5) {
                            System.out.println("Tárgyaló neve : ");
                            name = scanner.nextLine();
                            office.printMeetingRoomsWithName(name);
                        } else {
                            if (menu == 6) {
                                System.out.println("Tárgyaló névtöredék : ");
                                name = scanner.nextLine();
                                office.printMeetingRoomsContains(name);
                            } else {
                                if (menu == 7) {
                                    System.out.println("Tárgyaló területe (legalább) :");
                                    int areaMin = scanner.nextInt();
                                    scanner.nextLine();
                                    office.printAreasLarger(areaMin);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}

