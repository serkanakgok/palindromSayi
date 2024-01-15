public class sonraSil {

    /*static void sonuc(){
        System.out.println("parametresiz metot");
    }
    static void sonuc(int a){
        System.out.println("parametreli " + a);
    }
    static int sonuc(int a, int b){
        int result = a+b;
        System.out.println("iki parametreli: "+result);
        return result;
    }
    static int sonuc(int a, int b, int c){
        return a + b + c;
        //int result1 = a+b+c;
        //System.out.println("üç parametreli: "+result1);
        //return result1;
    }
    public static void main(String[] args) {
        sonuc();        sonuc(5);
        sonuc(3,9);
        System.out.println(sonuc(3,6,9));
        //sonuc(2,5,8);

    }*/

    static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(f(4));
    }
}