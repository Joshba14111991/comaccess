package com.access;
import com.java.Abstract_1;
public class Abstract_2 extends Abstract_1{

	@Override
	public void username() {
		// TODO Auto-generated method stub
		System.out.println("joshba");
		
	}

	@Override
	public void password() {
		// TODO Auto-generated method stub
		System.out.println("7878");
	}
	
	public static void main(String[] args) {
		
		Abstract_2 a =new Abstract_2();
		a.username();
		a.password();
		a.Login();
		
	}
	

}
