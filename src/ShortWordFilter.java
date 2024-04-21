public class ShortWordFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        String i = (String) x;
        return i.length() < 5;
    }
}
