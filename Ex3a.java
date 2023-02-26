/*
Some Important Rules for Switch Statements
1.There can be any number of cases just imposing condition check 
  but remember duplicate case/s values are not allowed.
2.The value for a case must be of the same data type as the 
  variable in the switch.
3.The value for a case must be constant or literal. 
  Variables are not allowed.
4.The break statement is used inside the switch 
  to terminate a statement sequence.
5.The break statement is optional. 
  If omitted, execution will continue on into the next case.
6.The default statement is optional and 
  can appear anywhere inside the switch block. 
  In case, if it is not at the end, 
  then a break statement must be kept after the default statement 
  to omit the execution of the next case statement.
*/
public class Ex3a
{
    public static void main(String[] args)
    {
        int day = 5;
        String dayString;
        // Switch statement with int data type
        switch (day) 
		{
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        // Default case
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}