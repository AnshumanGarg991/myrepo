public class lcs {
    public static void main(String[] args) {
        String l = "Hello MUmbai";
        String m = "Hello Banglaore";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < l.length(); i++) {
            for (int j = 0; j < m.length(); j++) {
                if (l.charAt(i) == m.charAt(j)) {
                    s.append(l.charAt(i));
                    System.out.println("Common characters: " + s.toString());
                }
            }
        }
    }
}
