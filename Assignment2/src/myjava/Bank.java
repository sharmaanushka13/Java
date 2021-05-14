package myjava;

public class Bank {
	
		int fixdeposit;
		int credit;
		int total=20000;
		
	public  void main(String[] args) {
		Bank b =new Bank();
		saving s=new saving();
		current c=new current();
		
		
		s.totalcash(20000, 0);
		c.totalcash(0, 30000);
		
		

	}
	
	
	
	public void toatlcash()
	{     
		int t=total+fixdeposit+credit;
	
		
	}
	
	void totalcash(int fixdeposit,int credit)
	{
		
		int t=total+fixdeposit+credit;
		
		
	}
	

}

class saving extends Bank{
	 
	void totalcash(int fixdepo,int credit)
	{
		
		int t=total+fixdepo+credit;
		
		System.out.println("the saving account total cash"+ t);
		
		
	}
	
}

class current extends Bank{
	
	void totalcash(int fixdeposit,int credit)
	{
		
		int t=total+fixdeposit+credit;
		System.out.println("the current account total cash"+t);
	}

}


