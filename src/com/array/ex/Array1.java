package com.array.ex;

public class Array1 {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<num.length;i++)
		{
			System.out.println("numbers "+num[i]);
		}

		int j=1;
		int k=10;
		int l=j+k;
		System.out.println(l);
		String hellow=message();
		System.out.println(hellow+"... This is manjesh.....");
	}
	
	public static String message()
	{
		return "hellow every one";
	}

}
