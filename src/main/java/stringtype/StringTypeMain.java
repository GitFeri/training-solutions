package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        message = message + 444;
        boolean b = message.contentEquals("Hello John Doe");
        boolean c = message.contentEquals("Hello John Doe444");

        System.out.println("b: " + b + " c: " + c);

        String str = ""+"";
        System.out.println(str.length());

        str = "Abcde";
        System.out.println(str + " hossza: " + str.length());
        System.out.println("első és harmadik karaktere:" + str.charAt(0) + ", " + str.charAt(2));
        System.out.println("elsőtől a harmadikig rész: " + str.substring(0,3));




    }
}
