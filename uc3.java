
public class uc3 {
	public static void main(String[] args) {
		 
//uc3
int IS_Part_Time=1;
int IS_Full_Time=2;
int emp_wage_per_hr=20;
int emphrs=0;
int empwage=0;
double empcheck = Math.floor (Math.random() *10) % 3 ;
if(empcheck == IS_Part_Time)
	emphrs=4;
else if (empcheck == IS_Full_Time)
  emphrs =8;
else
	emphrs=0;
empwage = emphrs * emp_wage_per_hr;
System.out.println("emp wage:" + empwage );
}
}

