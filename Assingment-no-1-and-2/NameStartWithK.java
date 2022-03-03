package Assingment;


import java.util.function.Predicate;


public class NameStartWithK
{
    public static void main1(String[] args)
    {
       String[] names={"Kaveri","Amol","Kali","Mahesh","Karnik","Aditya","Koyal"};
     Predicate<String> starstwithk=s->s.charAt(0)=='k';
     System.out.println("The NameStart With K Are ;");
     for(String S:names)
        {
            if(starstwithk.test(S))
            {
                System.out.println(S); 
            }
                
        }
       }
 }
    

