package com.selenium.my.task;

public class rev {

	public static void main(String[] args) {
int a = 987654;
int num = a;
int rem = 0;
int value = 0;
while(num>0) {
rem=num%10;
value = (value*10)+rem;
num=num/10;
}
System.out.println(value);
	}
}
