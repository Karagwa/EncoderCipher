public class ShuffleCipher implements MessageEncoder{
    int n;

    public ShuffleCipher(int n){
        this.n=n;
    }

    public String encode(String plainText){

            return shuffle(plainText);
    }

    private String shuffle(String message){
        StringBuilder code= new StringBuilder();
        if ( message.length()%2 == 0){
            String firstHalf=message.substring(0, (message.length()/2));
            String secondHalf=message.substring((message.length()/2));

            for(int n=0; n<message.length()/2;n++){
                
                code.append(firstHalf.charAt(n));
                code.append(secondHalf.charAt(n));
            }
        }
        else{
            String firstHalf=message.substring(0, (message.length()/2)+1);
            String secondHalf=message.substring((message.length()/2)+1);
        

        for(int i=0,j=0; i<firstHalf.length()&&j<secondHalf.length(); i++, j++){
            
            code.append(firstHalf.charAt(i));
            code.append(secondHalf.charAt(j));
            }
            code.append(firstHalf.charAt(firstHalf.length()-1));
        }

        return code.toString();

    }
}
