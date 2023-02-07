package week1.day2;

public class Fibbonacci {

	public static void main(String[] args) {
		int firstNum = 0;
		int SecNum   =1;
		int sum =0;
	   for (int i=1;i<10;i++)
	   {
       sum = firstNum +SecNum;
       firstNum = SecNum;
       SecNum=sum;
       System.out.println(sum);
	   }
    		   
    	   
		
	}

}
