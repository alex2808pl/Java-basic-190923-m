package de.telran.lesson19;

public class SimpleString {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1==s2 -> "+(s1==s2));
        System.out.println("s1==s3 -> "+(s1==s3));
        System.out.println("s1.equals(s2) -> "+s1.equals(s2));
        System.out.println("s1.equals(s3) -> "+s1.equals(s3));

        // Помещение в Poll
        s3 = s3.intern();
        System.out.println("s1==s3 -> "+(s1==s3));
        System.out.println("s1.equals(s3) -> "+s1.equals(s3));

        // Извлечение из Poll-а
        s2 = new String(s2);
        System.out.println("s1==s2 -> "+(s1==s2));
        System.out.println("s1.equals(s2) -> "+s1.equals(s2));

//        s1 = " 2 cats";
//        System.out.println("s1==s2 -> "+(s1==s2));
//        System.out.println("s1.equals(s2) -> "+s1.equals(s2));
//        System.out.println("s1 -> "+s1);
//        System.out.println("s2 -> "+s2);

        String s4 = "Я люблю Java!";
//        s4 = s4.substring(0,8)+s4.substring(12, s4.length());
        s4 = s4.replace("Java","");
        System.out.println(s4);

    }
}
