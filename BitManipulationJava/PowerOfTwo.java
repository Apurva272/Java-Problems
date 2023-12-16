public static void main(String[] args) {
        int n = 8;
        int count = 0;
        while (n != 1) {

            int div = n % 2;
            if (div != 0) {
                count++;
            }
            n = n / 2;

        }
        if (count == 0) {
            System.out.print("Power of 2");
        } else {
            System.out.print("Not a power of 2");

        }
    }
}
