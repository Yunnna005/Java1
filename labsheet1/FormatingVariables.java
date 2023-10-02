package labsheet1;

import javax.lang.model.element.NestingKind;
import java.io.StringReader;

public class FormatingVariables {//
    public static void main(String[] args) {
        String country1 = "Ireland";
        int pop1 = 7026636;
        double popDest1 = 82.2;

        String country2 = "UK";
        int pop2 = 68138484;
        double popDest2 = 270.7;

        System.out.println(String.format("%-20s%-15s%s\n%-20s%-15s%s",
                "Name","Population","Pop Density","----", "----------",
                "-----------"));
        System.out.println(String.format("%-20s%-15d%.2f\n%-20s%-15s%.2f",
                country1,pop1,popDest1,country2,pop2,popDest2));
    }
}
