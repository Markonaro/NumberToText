import java.util.HashMap;

public class Converter{

    public Converter(){
        hm1.put(0, "");
        hm1.put(1, "One");
        hm1.put(2, "Two");
        hm1.put(3, "Three");
        hm1.put(4, "Four");
        hm1.put(5, "Five");
        hm1.put(6, "Six");
        hm1.put(7, "Seven");
        hm1.put(8, "Eight");
        hm1.put(9, "Nine");

        hm10.put(0, "");
        hm10.put(1, "");
        hm10.put(2, "Twenty ");
        hm10.put(3, "Thirty ");
        hm10.put(4, "Fourty ");
        hm10.put(5, "Fifty ");
        hm10.put(6, "Sixty ");
        hm10.put(7, "Seventy ");
        hm10.put(8, "Eighty ");
        hm10.put(9, "Ninety ");
    }

    public static String numToWords(Integer x){
            // Obtain a char[] of the Integer to analyze each digit.
        String s = x.toString();
        char[] cArray = s.toCharArray();

            // Refer to the length of the Integer as its final index.
        int l = cArray.length-1;
        String retStr = "";
            // The loop counts backwards from the right-most digit. 
        for(int i = l; i >= 0; i--){
                // Determine the numeric value at the left-most index, then move rightward.
                // This setup is attributed to the nuances of the English language.
            int j = Character.getNumericValue(cArray[l-i]);
                //
            if(i == 3){
                retStr += hm1.get(j);
                retStr += " Thousand ";
            } else if(i == 2){
                retStr += hm1.get(j);
                retStr += " Hundred ";    
            } else if(i == 1){
                    //If the 10s digit is 1, the final word is 10 <= x <= 19.
                if(j == 1){
                    String tens = "";
                        // Check the 1s digit to determine x (10 <= x <= 19)
                    switch(Character.getNumericValue(cArray[l])){
                        case 0: tens = "Ten";                   
                                break;  
                        case 1: tens = "Eleven";                    
                                break;
                        case 2: tens = "Twelve";
                                break;
                        case 3: tens = "Thirteen";
                                break;
                        case 4: tens = "Fourteen";
                                break;
                        case 5: tens = "Fifteen";
                                break;
                        case 6: tens = "Sixteen";
                                break;
                        case 7: tens = "Seventeen";
                                break;
                        case 8: tens = "Eighteen";
                                break;
                        case 9: tens = "Nineteen";
                                break;
                        }
                    i = -1; // Ensure it's the last word by indexing out of the loop.
                    retStr += tens;
                } else {
                        //If the 10s digit is 2 <= x <= 9, the 10s word is 20 <= x <= 90.
                    retStr += hm10.get(j);
                }
            } else if(i == 0){
                retStr += hm1.get(j);
            }
        }
        return retStr + " (" + x + ") ";
    }

    private HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
    private HashMap<Integer, String> hm10 = new HashMap<Integer, String>();
}
