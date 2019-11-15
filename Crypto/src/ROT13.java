import static java.lang.Character.toLowerCase;

public class ROT13  {

    private final String upperCaseStart = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String lowerCaseStart = "abcdefghijklmnopqrstuvwxyz";

    protected String startUpper;
    protected String startLower;
    protected String registerUpper;
    protected String registerLower;
    private boolean symmetric = false;


    ROT13(Character cs, Character cf) {
        if (toLowerCase(cs) == 'a' && toLowerCase(cf) == 'n') symmetric = true;

        startUpper = ROT13.rotate(upperCaseStart, Character.toUpperCase(cs));
        startLower = ROT13.rotate(lowerCaseStart, Character.toLowerCase(cs));

        registerUpper = ROT13.rotate(upperCaseStart, Character.toUpperCase(cf));
        registerLower = ROT13.rotate(lowerCaseStart, Character.toLowerCase(cf));

        System.out.println(startUpper);
        System.out.println(registerUpper);
        System.out.println(startLower);
        System.out.println(registerLower);
    }

    ROT13() {
        this('a', 'm');
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if ( c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if ( c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public String decrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if ( c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String rotate(String s, Character c) {
        for (int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            int j = i;
            int k = 0;

            for (int k2 = j; k2 < s.length(); k2++) {
                sb.insert(k, s.charAt(j));
                k++;
                j++;
            }

            j = 0;
            while (j < i) {
                sb.insert(k, s.charAt(j));
                j++;
                k++;
                sb.append(c);
            }
            return sb.toString();
        }
        return null;
    }

    private String substituteIn(String text, String startUpper, String registerUpper, String startLower, String registerlower){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            Character ch = text.charAt(i);
        }
        return null;
    }

}
