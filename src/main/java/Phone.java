public class Phone {
    String type;
    int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Pnasonic",20);
        Phone phone2 = new Phone("Nokia",30);

        System.out.println(phone1.getType() + " " + phone1.getMem());
        System.out.println(phone2.getType() + " " + phone2.getMem());
    }

}
