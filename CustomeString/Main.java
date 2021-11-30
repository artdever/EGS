package CustomeString;

import java.nio.CharBuffer;

public class Main {
  public static void main (String [] args) {
    char [] ch = {'h','e','l','l','o',' ','w','o','r','l','d'};
    CumstomString cumstomString = new CumstomString(ch);
    cumstomString.printCustomString();
    char [] ch1 = null;
    CumstomString cumstomString2 = new CumstomString(ch1);

    System.out.println("|***ValueOf***|");
    int testNumber = 12345;
    CumstomString.valueOf(testNumber).printCustomString();

    System.out.println("|***charAt***|");
    System.out.println(cumstomString.charAt(4));

    System.out.println("|***indexOf***|");
    System.out.println(cumstomString.indexOf('h'));
    System.out.println(cumstomString.indexOf('l'));
    System.out.println(cumstomString.indexOf('1'));
    System.out.println(cumstomString.indexOf('d'));

    System.out.println("|***Contains***|");
    char [] sub = {'l','l','o'};
    CumstomString subString = new CumstomString(sub);
    System.out.println(cumstomString.contains(subString));

    System.out.println("|***subString***|");
    cumstomString.subCustomString(1,4).printCustomString();

    System.out.println("|***length***|");
    System.out.println(cumstomString.length());

    System.out.println("|***isEmpty***|");
    System.out.println(cumstomString.isEmpty());
    System.out.println(new CumstomString().isEmpty());

    System.out.println("|***Trim***|");
    char [] trims = {' ','h','e','l','l','o',' ','w','o','r','l','d',' '};
    CumstomString delProbs = new CumstomString(trims);
    delProbs.trim().printCustomString();
    cumstomString.trim().printCustomString();
  }

}
