public class QWERTY{
    private final String string;

    public QWERTY(String string){
        this.string = string;
    }

    public String getString(){
        return this.string;
    }

    public static enum letters{
        A("Q"), B("W"), C("E"), D("R"), E("T"), F("Y"), G("U"),
        H("I"), I("O"), J("P"), K("A"), L("S"), M("D"), N("F"),
        O("G"), P("H"), Q("J"), R("K"), S("L"), T("Z"), U("X"), 
        V("C"), W("V"), X("B"), Y("N"), Z("M");

        public final String text;

            letters(String text){
                this.text = text;
            }
    }
}
