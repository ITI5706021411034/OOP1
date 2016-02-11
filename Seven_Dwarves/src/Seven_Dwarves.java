 import java.util.*; 
 public class Seven_Dwarves {  
 public static void main(String[] args) { 	
	 int d1,d2,d3,d4,d5,d6,d7,d8,d9; 	
	 int sum=0,over=0;  	
	 
	 Scanner scan=new Scanner(System.in); 	
do{ 			
	d1=scan.nextInt(); 		if(d1>99||d1<0) 	
		System.out.println("number 1 not Dwarf!"); 	
	}while(d1>99||d1<0); 

do{ 			 
	d2=scan.nextInt(); 		if(d2>99||d2<0) 
		System.out.println("number 2 not Dwarf!"); 	
	}while(d2>99||d2<0); 	

do{ 
	d3=scan.nextInt(); 		if(d3>99||d3<0) 	
	System.out.println("number 3 not Dwarf!"); 
}while(d3>99||d3<0); 	

do{ 		
	d4=scan.nextInt(); 
if(d4>99||d4<0) 	
	System.out.println("number 4 not Dwarf!"); 	
}while(d4>99||d4<0); 	

do{ 	
	d5=scan.nextInt(); 	
	if(d5>99||d5<0) 
		System.out.println("number 5 not Dwarf!"); 
	}while(d5>99||d5<0); 

do{ 	
	d6=scan.nextInt(); 
if(d6>99||d6<0) 	
	System.out.println("number 6 not Dwarf!"); 
}while(d6>99||d6<0); 	


do{ 		d7=scan.nextInt(); 	
if(d7>99||d7<0) 	
	System.out.println("number 7 not Dwarf!"); 	
}while(d7>99||d7<0); 	


do{ 		d8=scan.nextInt(); 
if(d8>99||d8<0) 
	System.out.println("number 8 not Dwarf!"); 	
}while(d8>99||d8<0); 

do{ 		d9=scan.nextInt(); 	
if(d9>99||d9<0) 	
	System.out.println("number 9 not Dwarf!"); 
}while(d9>99||d9<0); 	


sum=d1+d2+d3+d4+d5+d6+d7+d8+d9; 	
over=sum-100;  	


	if(d1+d2==over)d1=d2=0; 	
else if(d1+d3==over)d1=d3=0; 	
else if(d1+d4==over)d1=d4=0; 		
else if(d1+d5==over)d1=d5=0; 		
else if(d1+d6==over)d1=d6=0; 		
else if(d1+d7==over)d1=d7=0; 		
else if(d1+d8==over)d1=d8=0; 		
else if(d1+d9==over)d1=d9=0; 		 		
else if(d2+d3==over)d2=d3=0; 		
else if(d2+d4==over)d2=d4=0; 		
else if(d2+d5==over)d2=d5=0; 		
else if(d2+d6==over)d2=d6=0; 		
else if(d2+d7==over)d2=d7=0; 		
else if(d2+d8==over)d2=d8=0; 		
else if(d2+d9==over)d2=d9=0; 		 		
else if(d3+d4==over)d3=d4=0; 		
else if(d3+d5==over)d3=d5=0; 		
else if(d3+d6==over)d3=d6=0; 		
else if(d3+d7==over)d3=d7=0; 		
else if(d3+d8==over)d3=d8=0; 		
else if(d3+d9==over)d3=d9=0; 		 	
else if(d4+d5==over)d4=d5=0; 	
else if(d4+d6==over)d4=d6=0; 	
else if(d4+d7==over)d4=d7=0; 	
else if(d4+d8==over)d4=d8=0; 	
else if(d4+d9==over)d4=d9=0; 		
else if(d5+d6==over)d5=d6=0; 		
else if(d5+d7==over)d5=d7=0; 		
else if(d5+d8==over)d5=d8=0; 		
else if(d5+d9==over)d5=d9=0; 		
else if(d6+d7==over)d6=d7=0; 		
else if(d6+d8==over)d6=d8=0; 		
else if(d6+d9==over)d6=d9=0; 		
else if(d7+d8==over)d7=d8=0; 		
else if(d7+d9==over)d7=d9=0; 		
else if(d8+d9==over)d8=d9=0; 		
	
	
else { 	
	System.out.println("Your Enter number "); 		
	d1=d2=d3=d4=d5=d6=d7=d8=d9=0; 
	} 		 	
	if (d1!=0)System.out.println(d1); 
	if (d2!=0)	System.out.println(d2); 	
	if (d3!=0)System.out.println(d3); 	
	if (d4!=0)	System.out.println(d4); 	
	if (d5!=0)System.out.println(d5); 	
	if (d6!=0)System.out.println(d6); 	
	if (d7!=0)System.out.println(d7); 
	if (d8!=0)System.out.println(d8); 	
	if (d9!=0)System.out.println(d9); 		 		 
} 	 
}

 
