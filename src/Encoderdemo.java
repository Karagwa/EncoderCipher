

public class Encoderdemo {
    public static void main(String[] args){
        SubstitutionCipher encoding= new SubstitutionCipher();
        encoding.inputNumber();
        encoding.inputWord();
        System.out.println(encoding.encode(encoding.getWord()));
        System.out.println(encoding.decode(encoding.getWord()));

    }
}