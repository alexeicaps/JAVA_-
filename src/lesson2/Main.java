package lesson2;

public class Main {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 1_000_000; i++) {
//            str += "+";
//        }
//        System.out.println(str);
//    }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(sb);
    }
}