
public class leapYear {
  int year;

  public static void main(String[] args) {

    int year = 2030;
    boolean leap = false;

    if (year % 4 == 0) {

      if (year % 100 == 0) {

        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }

  public boolean myLeapyear () {

  
    boolean leap = false;
  {
    if (year % 4 == 0);
    return true;
  }
  
  }
}