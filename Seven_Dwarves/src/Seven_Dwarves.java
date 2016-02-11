 import java.util.*; 
 public class Seven_Dwarves {  
 public static void main(String[] args) { 	
	 int k1,k2,k3,k4,k5,k6,k7,k8,k9; 	
	 int sum=0,over=0;  	
	 
	 Scanner scan=new Scanner(System.in); 	
do{ 			
	k1=scan.nextInt(); 		if(k1>99||k1<0) 	
		System.out.println("number 1. Error!"); 	
	}while(k1>99||k1<0); 

do{ 			 
	k2=scan.nextInt(); 		if(k2>99||k2<0) 
		System.out.println("number 2. Error!"); 	
	}while(k2>99||k2<0); 	

do{ 
k3=scan.nextInt(); 		if(k3>99||k3<0) 	
	System.out.println("number 3. Error!"); 
}while(k3>99||k3<0); 	

do{ 		
	k4=scan.nextInt(); 
if(k4>99||k4<0) 	
	System.out.println("number 4. Error!"); 	
}while(k4>99||k4<0); 	

do{ 	
	k5=scan.nextInt(); 	
	if(k5>99||k5<0) 
		System.out.println("number 5. Error!"); 
	}while(k5>99||k5<0); 

do{ 	
	k6=scan.nextInt(); 
if(k6>99||k6<0) 	
	System.out.println("number 6. Error!"); 
}while(k6>99||k6<0); 	


do{ 		k7=scan.nextInt(); 	
if(k7>99||k7<0) 	
	System.out.println("number 7. Error!"); 	
}while(k7>99||k7<0); 	


do{ 		k8=scan.nextInt(); 
if(k8>99||k8<0) 
	System.out.println("number 8. Error!"); 	
}while(k8>99||k8<0); 

do{ 		k9=scan.nextInt(); 	
if(k9>99||k9<0) 	
	System.out.println("number 9. Error!"); 
}while(k9>99||k9<0); 	


sum=k1+k2+k3+k4+k5+k6+k7+k8+k9; 	
over=sum-100;  	


	if(k1+k2==over)k1=k2=0; 	
else if(k1+k3==over)k1=k3=0; 	
else if(k1+k4==over)k1=k4=0; 		
else if(k1+k5==over)k1=k5=0; 		
else if(k1+k6==over)k1=k6=0; 		
else if(k1+k7==over)k1=k7=0; 		
else if(k1+k8==over)k1=k8=0; 		
else if(k1+k9==over)k1=k9=0; 		 		
else if(k2+k3==over)k2=k3=0; 		
else if(k2+k4==over)k2=k4=0; 		
else if(k2+k5==over)k2=k5=0; 		
else if(k2+k6==over)k2=k6=0; 		
else if(k2+k7==over)k2=k7=0; 		
else if(k2+k8==over)k2=k8=0; 		
else if(k2+k9==over)k2=k9=0; 		 		
else if(k3+k4==over)k3=k4=0; 		
else if(k3+k5==over)k3=k5=0; 		
else if(k3+k6==over)k3=k6=0; 		
else if(k3+k7==over)k3=k7=0; 		
else if(k3+k8==over)k3=k8=0; 		
else if(k3+k9==over)k3=k9=0; 		 	
else if(k4+k5==over)k4=k5=0; 	
else if(k4+k6==over)k4=k6=0; 	
else if(k4+k7==over)k4=k7=0; 	
else if(k4+k8==over)k4=k8=0; 	
else if(k4+k9==over)k4=k9=0; 		
else if(k5+k6==over)k5=k6=0; 		
else if(k5+k7==over)k5=k7=0; 		
else if(k5+k8==over)k5=k8=0; 		
else if(k5+k9==over)k5=k9=0; 		
else if(k6+k7==over)k6=k7=0; 		
else if(k6+k8==over)k6=k8=0; 		
else if(k6+k9==over)k6=k9=0; 		
else if(k7+k8==over)k7=k8=0; 		
else if(k7+k9==over)k7=k9=0; 		
else if(k8+k9==over)k8=k9=0; 		
	
	
else { 
 
 System.out.println("Your Enter number Error"); 		
	k1=k2=k3=k4=k5=k6=k7=k8=k9=0; 
}	 	
	if (k1!=0)System.out.println(k1); 
	if (k2!=0)	System.out.println(k2); 	
	if (k3!=0)System.out.println(k3); 	
	if (k4!=0)	System.out.println(k4); 	
	if (k5!=0)System.out.println(k5); 	
	if (k6!=0)System.out.println(k6); 	
	if (k7!=0)System.out.println(k7); 
	if (k8!=0)System.out.println(k8); 	
	if (k9!=0)System.out.println(k9); 		 		 
} 	 
}

 
