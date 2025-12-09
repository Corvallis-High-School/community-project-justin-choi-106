
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values

        
       // Construct 2 objects of your class using the constructor with different values
      FrcTeam frcTeam1 = new FrcTeam(995, new ArrayList<String>(), 5);
              FrcTeam frcTeam2 = new FrcTeam(749, new ArrayList<String>(), 5);
        frcTeam1.print();
        frcTeam1.setHours(2);
        frcTeam1.setMembers("Issac");
        frcTeam1.setTeamNum(0);
        frcTeam1.getHours();

                frcTeam1.getTeamNum();
        frcTeam1.getMembers();

        System.out.println(frcTeam1.toString());
        frcTeam2.print();
        
  frcTeam2.setHours(2);
        frcTeam2.setMembers("Issac");
        frcTeam2.setTeamNum(0);
        frcTeam2.getHours();

                frcTeam2.getTeamNum();
        frcTeam2.getMembers();




                System.out.println(frcTeam1.toString());

       // call all of the objects methods to test them

    
    // call all of the objects methods to test them
  }
}