public class Encryption {
    private String key;
    public Encryption(String key){
        this.key = key;
    }
    public static String generateKey(int length) {
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('A' + (int) (Math.random() * 26));
            key.append(randomChar);
        }
        return key.toString();
    }
        public static String encrypt(String plainText, String key) {// Encrypt the plain text using the key
            StringBuilder encryptedText = new StringBuilder();
            for (int i = 0; i < plainText.length(); i++) {
                char plainChar = plainText.charAt(i);
                char keyChar = key.charAt(i);
                char encryptedChar = (char) ((plainChar + keyChar) % 26 + 'A'); // Modulo 26 to wrap around the alphabet
                encryptedText.append(encryptedChar);
            }
            return encryptedText.toString();
        }
    }


