

public class alphabetCount
{
  public static void main(String[] args) {
    String str1="coding is easier with code speedy @Code#####7786";
    int count=0;
    for (int i=0;i<str1.length();i++)
    {
       if(Character.isLetter(str1.charAt(i)))
count++;
    }
System.out.println("the number of alphabets in the given string is:"+count);
  }
}