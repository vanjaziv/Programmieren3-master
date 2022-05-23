public class StringReader1 {

    public StringReader1(String text) {
    }

    public static void main(String[] args) {
        String text = "Hallo das ist ein test";
        
        StringReader1 stringReader = new StringReader1(text);
        int c;
        while((c=stringReader.read()) !=-1){
            System.out.println((char)c);
        }
    }

    private int read() {
    }

}
