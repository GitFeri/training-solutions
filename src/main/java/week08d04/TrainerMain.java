package week08d04;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainerG = new Trainer(new GoodMood());
        Trainer trainerB = new Trainer(new BadMood());

        System.out.println(trainerG.giveMark());
        System.out.println(trainerB.giveMark());
    }
}
