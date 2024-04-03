

public class Encoderdemo {
    public static void main(String[] args){
        SubstitutionCipher encoding= new SubstitutionCipher();
        encoding.inputNumber();
        String word=encoding.inputWord();
        System.out.println(encoding.encode(word));

    }
}