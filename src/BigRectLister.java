import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList rectangle = new ArrayList();

        rectangle.add(10);
        rectangle.add(8);
        rectangle.add(2);
        rectangle.add(14);
        rectangle.add(17);
        rectangle.add(24);
        rectangle.add(1);
        rectangle.add(5);
        rectangle.add(8);
        rectangle.add(19);

        System.out.println("Rectangles with a perimeter larger than 10: ");
        collectAll(rectangle);
    }

    public static void collectAll(ArrayList x) {
        BigRectangleFilter filter = new BigRectangleFilter();
        for (int i = 0; i < 10; i++) {
            if(filter.accept(x.get(i))) {
                System.out.println("Rectangle: #" + (i + 1) + " with a perimeter of: " + x.get(i));
            }
        }
    }
}

