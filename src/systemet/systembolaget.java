package systemet;

import java.util.Scanner;

public class systembolaget {

    private static Scanner systembolaget;

	public static void main(String[] args){
        systembolaget = new Scanner(System.in);
        String s = null;
        boolean valid = false;

        System.out.println("V�lkommen till Systembolaget, v�nligen skriv in din �lder!");

        while (valid == false){
          try{
            s = systembolaget.nextLine();
            valid = true;
          } catch(Exception e){
            System.out.println("Fel! V�nligen skriv in din �lder nedan!");
          }
        }

        String result = (validSSN(s) ? " �r en giltig �lder, v�lkommen!" : " �r INTE en giltig �lder! ");
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
