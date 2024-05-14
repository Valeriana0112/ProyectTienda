import java.util.ArrayList;
import java.util.List;

public class MainRopa {
    public static void main(String[] args) {
        List<Ropa> list = new ArrayList<Ropa>();
        list.add(new Ropa(1, "S", 19 + .86));
        list.add(new Ropa(2, "M", 154.86));
        list.add(new Ropa(3, "L", 198.86));
        list.add(new Ropa(4, "EG", 188.86));
        list.add(new Ropa(5, "XL", 198.86));
        for (Ropa ropa : list) {
            System.out.println(ropa.toString());
        }
    }
}