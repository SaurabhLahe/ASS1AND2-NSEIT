package Assingment;

public class RemoveSpaces {
	
	static String removeSpace(String str)
    {
        str = str.replaceAll("\\s","");
        return str;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        String str = "re move  t he  string";
        System.out.println(removeSpace(str));
    }
}



