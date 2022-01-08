//coded by dubkari

/*
In a best of 3:
Players strike to the first stage, then ban for the following games, but a player is unable to go back to a stage he won on.
Players play RPS to decide who strikes first: the winner of RPS strikes 1, loser strikes 2, then winner strikes 1 to decide the stage.
For the following games, the winner bans one stage and the loser can go anywhere else, given they haven't already won there.
*/

/*
In a best of 5:
Players strike to the first stage, then loser can go anywhere for the following games, but a player is unable to go back to a stage he won on.
Players play RPS to decide who strikes first: the winner of RPS strikes 1, loser strikes 2, then winner strikes 1 to decide the stage.
For the following games, the loser can go anywhere, given they haven't already won there.
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main {
 public static void main(String[] args) {
     int bestOf=0;
        String fod="FoD";
        String bf="BF";
        String fd="FD";
        String dl="DL";
        String yoshi="YS";
        String stadium="PS";
        String[] stages1={fod,bf,fd,dl,yoshi};
        String[] stages2={fod,bf,fd,dl,yoshi,stadium};
        System.out.println(Arrays.toString(stages1));
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Is it a best of 3 or best of 5? Type 3 for Bo3 and 5 for Bo5.");
     bestOf= keyboard.nextInt();
     while ((bestOf != 3) && (bestOf != 5)){
         System.out.println("Must choose 3 or 5."); 
         bestOf= keyboard.nextInt();
  } 
  if (bestOf == 3){
      for (int i=1;i<3;i++){
      System.out.println("Stage Striking: Round "+i);
      System.out.println("Available Stages: "+Arrays.toString(stages1));
      if (i==1){
          System.out.println("What does the RPS winner strike first? (one strike)");
          String BO3Strike1=keyboard.nextLine();
          for(int j=4;j>0;j--){
              if (stages1[j]==BO3Strike1){
                    stages1[j]="";
              }
          }
          System.out.println("Available Stages: "+Arrays.toString(stages1));
      }
      else if (i==2){
          System.out.println("What does the RPS loser strike next? (two strikes)");
          String BO3Strike2=keyboard.nextLine();
          for(int k=3;k>0;k--){
              if (stages1[k]==BO3Strike2){
                    stages1[k]="";
              }
          }
          System.out.println("Available Stages: "+Arrays.toString(stages1));
          String BO3Strike3=keyboard.nextLine();
          for(int l=2;l>0;l--){
              if (stages1[l]==BO3Strike3){
                    stages1[l]="";
              }
              
          }
      }
      else{
          System.out.println("What does the RPS winner strike last? (one strike)");
          String BO3Strike4=keyboard.nextLine();
          for(int m=1;m>0;m--){
              if (stages1[m]==BO3Strike4){
                    stages1[m]="";
              }
      }
  }
      }
  }
  else{
      System.out.println("Best of 5");
  }
 }
}


