package code;

import java.util.Scanner;

public class Revers {
		
		    public static void main(String[] args) {
		    System.out.println("Please, enter any number or word");
		    Scanner input = new Scanner(System.in);
		     String name=input.nextLine();
		     String[] word=name.split(" ");
		     String reversename=" ";
		     int i,j;
		     for(i=0;i<word.length;i++){
		      String str=word[i];
		      String revstr=" "   ;
		      for(j=str.length()-1;j>=0;j--){
		         char chr=str.charAt(j) ;
		         revstr=revstr+chr;
		      }
		      reversename =reversename + revstr ;
		    }
		    System.out.println(reversename);
		}
		}

