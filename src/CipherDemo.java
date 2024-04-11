public class CipherDemo {
    public static void main(String[] args) {
        ShuffleCipher word= new ShuffleCipher(0);
        String code=word.encode("abcdefghi");
        System.out.println(code);
    }

}
