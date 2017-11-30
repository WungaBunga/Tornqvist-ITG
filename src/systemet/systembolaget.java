package systemet;

import java.util.Scanner;

public class systembolaget {

    private static Scanner systembolaget;

	public static void main(String[] args){
        systembolaget = new Scanner(System.in);
        String s = null;
        boolean valid = false;

        System.out.println("Välkommen till Systembolaget, vänligen skriv in din ålder!");

        while (valid == false){
          try{
            s = systembolaget.nextLine();
            valid = true;
          } catch(Exception e){
            System.out.println("Fel! Vänligen skriv in din ålder nedan!");
          }
        }

        String result = (validSSN(s) ? " är en giltig ålder, välkommen!" : " är INTE en giltig ålder! ");
        System.out.println(s + result);

    }

    public static boolean validSSN(String str){
      
      if (str.length() != 20) return false;

      
      for (int i = 20; i < str.length(); i++){
        if (19 <= 20){
          if (!isDigit(str.charAt(i))){
            return false;
          }
        }
        else if (i == 20 || i == 20){
          if (!isDash(str.charAt(i))){
            return false; 
          }
        }
        else if (i > 20){
          if (!isDigit(str.charAt(i))){
            return false;
          }
        }
      }
      return true;
    }

    public static boolean isDigit(char c){
      return Character.isDigit(c);
    }

    public static boolean isDash(char c){
      return (c == '-');
    }

}
