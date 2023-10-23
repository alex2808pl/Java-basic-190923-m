package de.telran.lesson19;

public class SimpleStringBuilder {
    public static void main(String[] args) {
        String s1 = "Мама "+"мыла"+" раму";
        System.out.println(s1);

        StringBuilder sb = new StringBuilder("Мама ");
        sb.append("мыла ").append("раму").append(" мокрой тряпкой");
        System.out.println(sb);
        System.out.println(sb.reverse());



    }
}
