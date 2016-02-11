import java.util.Scanner;
public class Skocimis {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a1=0,b1=0,c1=0;
		int wronga = 0;
		int jup = 0 , spac = 0;
		String number,str1="";
		
		System.out.println("Enter number interger (0-100) fomat is (10 20 30)");
		number=scan.nextLine();
		for(int i = 0 ; i < number.length() ;i++){
			if(number.substring(i,i+1).equals(" ")){spac++; str1=""; }
			else { str1 += number.substring(i,i+1); 
				if(spac == 0)a1=Integer.parseInt(str1);
				else if(spac == 1)b1=Integer.parseInt(str1); 
				else if(spac == 2)c1=Integer.parseInt(str1);
			}
		}
		if(a1<0||a1>99){System.out.println("Number error JingJO NO.1-");wronga=1;}
		else if(b1<a1||b1>99){System.out.println("Number error JingJO NO.2-");wronga=1;}
		else if(b1>c1||c1>99){System.out.println("Number error JingJO NO.3-");wronga=1;}
			if(0<a1&&a1<b1&&b1<c1&&c1<100&&wronga==0){
			jup= ((b1-a1)>=(c1-b1))?(b1-a1):(c1-b1);
			System.out.println(jup-1);
			}
	}
}
