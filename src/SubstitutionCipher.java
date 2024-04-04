import java.util.Scanner;
public class SubstitutionCipher implements MessageEncoder {
    private int shift;
    private String word;
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

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public void setWord(String word){
        this.word=word;
}

    public String getWord() {
        return word;
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

    
    //still working on it
    
  
    public String encode(String plainText) {
        System.out.println("Encoding...");
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            int index = c - 'a'; // assuming 'word' is all lowercase
            int shiftedIndex = (index + this.shift) % 26;
            encoded.append(letters[shiftedIndex]);
        }
        return encoded.toString();
    }

    public String decode(String encodedText){
        System.out.println("Deccoding...");
        StringBuilder decoded= new StringBuilder();
        for (int i =0; i<encodedText.length(); i++){
            char c = encodedText.charAt(i);
            int index = c - 'a';
            int shiftedIndex = (index - this.shift) % 26;
            if (shiftedIndex < 0){
                shiftedIndex += 26;
            }
            decoded.append(letters[shiftedIndex]);

        }
        return decoded.toString();
    }

}

