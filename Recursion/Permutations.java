public class Permutations {
    public static void main(String[] args) {
        permutations("", "abp");
    }

    public static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p+ " ");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }
}
