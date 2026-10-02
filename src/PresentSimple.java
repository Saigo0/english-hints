public class PresentSimple {
    private boolean negative;
    private boolean interrogative;
    private boolean thirdSingular;

    PresentSimple(boolean negative, boolean interrogative, boolean thirdSingular) {
        this.negative = negative;
        this.interrogative = interrogative;
        this.thirdSingular = thirdSingular;
    }

    public String verificaAux(){
        if (negative || interrogative){
            if(thirdSingular){
                if(negative){
                    return "does not (ou doesn't)";
                }
                return "does";
            }
            if(negative){
                return "do not (ou don't)";
            }
            return "do";
        }
        return "Sem uso de auxiliares";
    }

}
