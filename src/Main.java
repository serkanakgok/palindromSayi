public class Main {
   /* static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(3,3));
    }

    */

    /*static int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
        //return a+b;
    }

    public static void main(String[] args) {
        int result = sum(2, 3) + sum(3, 4);
        System.out.println(result);
    }

     */

    //palindrom sayı

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            //System.out.println("===========");
            //System.out.println("Sayı => " + temp);

            lastNumber = temp % 10;
            //System.out.println("Son basamak =>" + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni sayı =>" + reverseNumber);
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(2442));

    }


}