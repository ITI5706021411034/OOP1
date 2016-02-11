 import java.util.*; 
 public class Trik {  	
	 public static void main(String[] args) { 
		 int b1=1,b2=0,b3=0; 	
		 String result; 
		 Scanner scan=new Scanner (System.in); 	
		 do{ 		
			 result=scan.nextLine(); 	
			 if(result.length()>49)System.out.println("result number overlond !"); 
		}while(result.length()>49); 	
		 
		 for(int i=0;i<result.length();i++){
			 if(result.charAt(i)=='B'){ 	
			if(b1>b2) {b1=0; b2=1;} 	
		 else if(b2>b1){b1=1; b2=0;} 	
		 else{b1=0; b2=0;} 		
		 } 			
	 if(result.charAt(i)=='B'){ 		
		 if(b2>b3){b2=0; b3=1;} 	
		 else if(b3>b2){b2=1; b3=0;} 	
		 else{b2=0; b3=0;} 			} 	
	 if(result.charAt(i)=='C'){ 		
		 if(b1>b3){b3=1; b1=0;} 	
		 else if(b3>b1){b1=1; b3=0;} 	
		 else{b3=0; b1=0;} 	
		 } 					
	 } 		 		if(b1==1)System.out.println(1); 	
	 else if(b2==1)System.out.println(2); 	
	 else if(b3==1)System.out.println(3); 	
	 } 
	 }
