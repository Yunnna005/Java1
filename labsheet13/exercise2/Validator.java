package labsheet13.exercise2;

public class Validator {
    public static boolean isValidRegistrationNumber(String regNum){
        if (regNum.length()>6 || regNum.length()<12){
            if (Character.isDigit(regNum.charAt(0)) && Character.isDigit(regNum.charAt(1))){
                if (regNum.charAt(2) == '-'){
                    if((Character.isUpperCase(regNum.charAt(3)) && Character.isUpperCase(regNum.charAt(4)) &&
                            regNum.charAt(5)=='-') || (Character.isUpperCase(regNum.charAt(3))&&
                            regNum.charAt(4)=='-' && Character.isDigit(regNum.charAt(5)))){

                        for (int i = 6; i<regNum.length(); i++){
                            if (!Character.isDigit(regNum.charAt(i))){
                                break;
                            }
                            return i == regNum.length();
                        }
                    }
                }
            }
        }
        return false;
    }
}
