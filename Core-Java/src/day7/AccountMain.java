package day7;

public class AccountMain {

	public static void main(String[] args) {

		
		Account acc=new Account();
		
		acc.setAccno(7777);
		acc.setName("dhoni");
		acc.setAmount(1000000);
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
	}

}
