package test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public void deposit() {
		System.out.println("deposit");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
	public void print() {
		System.out.println("print");
	}
	public void print2() {
		System.out.println("print2");
	}

}
