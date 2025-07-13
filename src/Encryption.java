public class Encryption {
    private String key;
    public Encryption(String key){
        this.key = key;
    }
    public static String encryptString(String key){
        return "Key is being Returned"+key;
    }
}
