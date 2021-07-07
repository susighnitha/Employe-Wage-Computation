
public class uc6 {
	public static void main(String[] args) {
		  

int IS_PART_TIME=1;
int IS_FULL_TIME=2;
int MAX_HRS_IN_MONTH=10;
 int NUM_WORKING_DAYS=20;
 int EMP_WAGE_PER_HOUR=20;
int emphrs=0;
int totalworkingdays=0;
int totalemphrs=0;

while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_WORKING_DAYS)
{
totalworkingdays++;

	
int empcheck =(int) Math.floor (Math.random() *10) % 3 ;

	switch (empcheck) {
	
	
	case 1 :
	               emphrs=8 ;
	               break;
	case   2:
	               emphrs=4 ;
	           break;
	           default:
	        	   emphrs=0;
	        	   
	           
	}

   totalemphrs+= emphrs;
	System.out.println("Day#:" +totalworkingdays + "emp hr: " +emphrs );
	}
	int totalempwage =  totalemphrs * EMP_WAGE_PER_HOUR;
		System.out.println("Total emp wage:" + totalempwage );

	}
	
	 }


