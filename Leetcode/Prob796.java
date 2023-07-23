public class Prob796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String check = s + s;
        if (check.contains(goal)) {
            return true;
        }
        return false;
    }
}
