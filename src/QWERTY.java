public class QWERTY{
    private final String string;

    public QWERTY(String string){
        this.string = string;
    }

    public String getString(){
        return this.string;
    }

    public static enum letters{
        A("Q"), B("W");

        public final String text;

            letters(String text){
                this.text = text;
            }
    }
}
