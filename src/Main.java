import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setObject("Hello");
        //box.setObject(System.in);

        Box<InputStream> b = new Box<InputStream>();
        b.setObject(System.in);

        String s = box.getObject();
        System.out.println(s);
    }
}
