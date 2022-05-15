

public class test{

  public static void main (String args[]){
    String string = "";
    System.out.println((-1.0)/2);
    int j = 0;
    System.out.println((string.length()-1)/2);
    System.out.println(Math.floor((string.length()-1)/2));
    System.out.println((int) Math.floor((string.length()-1)/2));
    System.out.println(j <= (int) Math.floor((string.length()-1)/2));
  }
  static boolean isPalindrome( String s )
  {
  //   int j = s.length()-1;
  //   for (int i = 0;i<=j;i++,j--) {
  //     if (s.charAt(i) != s.charAt(j)){
  //       return false;
  //     }
  //
  //   }
  //   return true;
  // }
    for (int j = 0; j<= (int) Math.floor((s.length()-1)/2); j++)
    {
      if (s.charAt(j) == s.charAt(s.length()-(j+1)))
      {

      }
      else
        return false;
    }
    return true;
  }
}
