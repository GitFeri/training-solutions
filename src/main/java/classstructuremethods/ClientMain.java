package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("John Doe");
        client.setYear(1952);
        client.setAddress("Budapest, Tavasz u. 10.");

        System.out.println("Ügyfél neve   : " + client.getName());
        System.out.println("Születési éve : " + client.getYear());
        System.out.println("Címe          : " + client.getAddress());

        client.migrate("Debrecen, Tél u. 2.");

        System.out.println("Költözés után : " + client.getAddress());


    }
}
