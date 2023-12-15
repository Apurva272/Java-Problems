public class GetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {

            System.out.println("bit at the position is 0");
        } else {
            System.out.println("bit at the position is 1");
        }
    }
}