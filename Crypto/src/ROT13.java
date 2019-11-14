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

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

    private String substituteIn(String text, String startUpper, String registerUpper, String startLower, String registerlower){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            Character ch = text.charAt(i);
        }
        return null;
    }

}
