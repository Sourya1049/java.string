public class stringbuilder {
   static void  main() {
        StringBuilder s = new StringBuilder("raghav");
        System.out.println(s.length()+" "+s.capacity());

        System.out.println(s);
        s.append("garv");
        System.out.println(s);

    }
}
