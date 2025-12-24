import java.util.ArrayList;



public class  FrcTeam        // Add your class name here!
{
    // 1. write 3 instance variables for class: private type variableName;
    private  int teamNum = 0;
private  ArrayList<String> membersName = new ArrayList<String>();
    private  int hours = 0;
//     private static String[] membersName = {
//     null
//     };

    
    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public FrcTeam (int teamNum, ArrayList<String> membersName, int hours) {
        this.teamNum = teamNum;
        this.membersName = membersName;
        this.hours = hours;
    }
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public  void print() {
      System.out.println( hours + " hours of pratice a week and team number is:" + teamNum +  " and the members' names are: ");
        for (String name : membersName) {
      System.out.println(name);
      }
    }
    // 4. Create accessor (get) methods for each of the instance variables.
    public  int getHours() {
        return hours;
    }
     public  ArrayList<String> getMembers() {
       return membersName;
      }
         
    
    
     public  int getTeamNum() {
        return teamNum;
    }
    
   
    // 5. Create mutator (set) methods for each of the instance variables.
      public  void setHours(int hoursAdded) {
        hours = hours + hoursAdded;
    }
    
      public  void setMembers(String membersAdded) {
        membersName.add(membersAdded);
          
          
    }
   
    
   
      public  void setTeamNum(int teamNumSet) {
        teamNum = teamNumSet;
      }
    // 6. Create a toString() method that returns all the information in the instance variables.
      @Override
    public String toString() {
           return  
               teamNum + " " + hours +
                     " " +  membersName;
//                System.out.print(" " + membersName);
//                }
        }
    // 7. Write an additional method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate how you want to print out
    // the information, e.g. print(format) could print the data according to an argument that is "plain"
    // or "table" where the data is printed in a table drawn with dashes and lines (|).
 public void printWEventsWon(int eventWonInAYear) {
       print();
        System.out.println(" and has won " + eventWonInAYear + " in this year");
      }
    
    // 8. Write a main method that constructs at least 2 objects of your class
    // using the constructor and then calls all of the methods that you created above to test them.
    
}
