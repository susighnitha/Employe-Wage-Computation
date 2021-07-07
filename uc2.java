
public class uc2 {
	public static void main(String[] args) {
		


//uc 2
int IS_FULL_TIME=1;
int EMP_WAGE_PER_HOUR =20;
int emphrs=0;
int empwage=0;

double empcheck = Math.floor (Math.random() *10) % 2 ;
if(empcheck == IS_FULL_TIME)
 emphrs=8;
else
emphrs=0;
empwage = emphrs * EMP_WAGE_PER_HOUR;
System.out.println("empwage:" + empwage);
}
}