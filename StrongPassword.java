import java .util.Scanner;
public class StrongPassword {
    static int passwordCheck(int n,String s)
    {   
        int num=1,cl=1,sl=1,spc=1;
            for(int i=0;i<s.length();i++)
            {
            char c=s.charAt(i);
            if(c>=48 && c<=57)
            {
               num=0;
            }
            else if(c>=65 && c<=90)
            {
               cl=0;
            }else if(c>=97 && c<=122)
            {
                sl=0;
            }
            else
            {
                spc=0;
            }
            }
    if((num+cl+spc+sl)>6-s.length())
    {
        return num+cl+spc+sl;
    }else
    {
        return 6-s.length();
    }
    }
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        String s=scan.next();
        System.out.println(passwordCheck(n,s));    
    }  
}
