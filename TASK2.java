import java.util.Scanner;
class Work
{
    void Display(int num,float avg,String Grd)
    {
        System.out.println("Total Marks: "+num+" Average percentage: "+avg+" Grade Obtained :"+Grd);
    }
}

public class TASK2 
{
    static Scanner sc=new Scanner(System.in);
    static String str=new String();
    
    
    static String AssignGrades(float avg)
    {
        if(avg>=91 && avg<=100)
        {
            return "A1";
        }
        else if(avg>=81 && avg<=90)
        {
            return "A";
        }
            
        else if(avg>=71 && avg<=80)
        {
            return "B1";
            
        }
        else if(avg>=61 && avg<=70)
        {
            
           return "B";
        }
        else if(avg>=51 && avg<=60)
        {
            
            return "C1";
        }
        else if(avg>=41 && avg<=50)
        {
            
            return "C";
        }
        return "NULL";
    }


    
    public static void main(String[] args) 
    {

        Work w=new Work();
        //Number of subject is : 5
        int arr[]=new int[5];
        int sum=0;

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Marks of Subject "+(i+1));
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        // System.out.println("\tTotal Marks: "+sum);
        float avg=(sum/5);
        // System.out.println("\tAvg.Percentage: "+avg);

        String str=AssignGrades(avg);

        w.Display(sum,avg,str);


    }    
}
