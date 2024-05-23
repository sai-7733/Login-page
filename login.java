import java.util.*;
class Login{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String mail=sc.nextLine();
        String userName=sc.nextLine();
        String password=sc.nextLine();
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<mail.length();i++){
            if((mail.charAt(i)>='a' && mail.charAt(i)<='z')||(mail.charAt(i)>='1' && mail.charAt(i)<='9')){
                a++;
            }
            else if(mail.charAt(i)=='@'){
                b++;
            }
            else if(mail.charAt(i)=='.'){
                c++;
            }
        }
        int d=a+b+c;
        
        int e=0;
        int j=0;
        for(int i=0;i<userName.length();i++){
            if(i==0){
                if(userName.charAt(i)>='A' && userName.charAt(i)<='Z'){
                    e++;
                }
            }
            else if((userName.charAt(i)>='a' && userName.charAt(i)<='z')||(userName.charAt(i)>='1' && userName.charAt(i)<='9')  || (userName.charAt(i)!=' ')){
                j++;
            }
        }
        int f=e+j;
        int k=0;
        for(int i=0;i<password.length();i++){
            if((password.charAt(i)>='a' && password.charAt(i)<='z') || (password.charAt(i)>='A' && password.charAt(i)<='Z') || (password.charAt(i)>='1' && password.charAt(i)<='9') || (password.charAt(i)!=' ')){
                k++;
            }
        }
        if(d==mail.length() && b==1 && c==1 && f==userName.length() && k==password.length()){
            System.out.println("login successful");
        }
        else if((d!=mail.length() || b==1 || c==1) && f==userName.length() && k==password.length()){
            System.out.println("Invalid gmai");
        }
        if(d==mail.length() && b==1 && c==1 && f!=userName.length() && k==password.length()){
            System.out.println("Invalid user Name");
        }
        else{
            if(d==mail.length() && b==1 && c==1 && f==userName.length() && k!=password.length()){
                System.out.println("Invalid password");
            }
        }
    }
}