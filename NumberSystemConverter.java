
public class NumberSystemConverter {


    public static void main(String[] args) {
        String s="10121+546-321";
        int index=2;
        /*index =
        1 = binary
        2 = decimal
        3 = octal
        4 = hexadecimal*/
   
   		NumSysCalculation numSysCalculation = new NumSysCalculation();

		numSysCalculation.nsParser(s, index);
    }
    
}
