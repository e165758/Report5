package jp.ac.uryukyu.ie.e165758;

public class Main {
    public static void main(String[] args) {
        try {
         //   String str = null;
         //   int n = str.length();
         //   System.out.printf("strの長さは%d\n", n);
            String str = "3．14";
            double value = Double.parseDouble(str);
            System.out.println(value);
        } catch (NullPointerException e) {
                System.out.println("Error:NullPointerException");
                System.out.println("\"str\"に\"Null\"が代入されています。");
                System.out.println("以下スタックトレース");
                e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
