import java.util.Scanner;
public class SubstitutionCipher implements MessageEncoder {
    public int shift;
    public String word;
    char[] letters = {'a', 'b', 'c', 'd', 'e',
            'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};

    //double[] reading = {3.3, 15.8, 9.7};

    public SubstitutionCipher(int shift) {
        this.shift=0;
    }
    public SubstitutionCipher() {
        this.word="no words yet";
    }


    Scanner keyboard = new Scanner(System.in);


    public void inputNumber(){
        do {
            System.out.println("Enter the shift: that is letter between 0 and 25" +
                    " inclusive");
            this.shift = keyboard.nextInt();
            keyboard.nextLine();
        }
        while (shift > 26);
    }
    public void inputWord() {

        System.out.println("Enter the word you want to encode: ");
        this.word=keyboard.nextLine();
        System.out.println(this.word);
        
    }

    public String encode() {
        System.out.println("Encoding...");
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            char c = this.word.charAt(i);
            int index = c - 'a'; // assuming 'word' is all lowercase
            int shiftedIndex = (index + this.shift) % 26;
            encoded.append(letters[shiftedIndex]);
        }
        return encoded.toString();
    }
    //still working on it
    
   public String encode(String plainText) {
        System.out.println("Encoding...");
        plainText =this.word;
        for (int i = 0; i < plainText.length(); i++) {
            plainText = plainText.replace( word.charAt(i),letters[shift]);

        }
        return plainText;
    }



}
