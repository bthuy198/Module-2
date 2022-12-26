public class Demo {
    public static void main(String[] args) {
        String s1= "abc";
        String s2= "abc";
        String s3 = new String("abc");
//        s2 = "bcd";
//        System.out.println(s1);
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
        StringBuilder sbd = new StringBuilder("0");
        for (int i = 1; i < 10; i++) {
            sbd.append(", "+i);
        }
        System.out.println(sbd);
    }
}
