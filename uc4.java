
public class uc4 {
 public static void main(String[] args) {
	 
//uc3
int IS_Part_Time=1;
int IS_Full_Time=2;
int emp_wage_per_hr=20;
int emphrs=0;
int empwage=0; 
int empcheck =(int) Math.floor (Math.random() *10) % 3 ;
switch (empcheck) {
case 1:
	emphrs=4;
	break;
case 2:
	emphrs=8;
	break;
	default:
		emphrs=0;
}
empwage = emphrs * emp_wage_per_hr;
System.out.println("emp wage:" + empwage );
}
}
