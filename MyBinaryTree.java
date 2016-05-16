//U10416018 陳宗佑

import java.util.Scanner;

public class MyBinaryTree{
	public static void BinaryTree(int[] list){
		boolean needNextPass = true;
		
		for(int k = 1; k < list.length && needNextPass; k++){
			//Array may be sorted and next pass not needed
			needNextPass = false;
			for(int i = 0; i < list.length - k; i++){
				if(list[i] > list[i + 1]){
					//Swap list[i] with list[i + 1]
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					//Next pass still needed
					needNextPass = true;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Ask how many numbers does user want to enter
		System.out.println("想輸入幾個數字?");
		int num = input.nextInt();
		int[] list = new int[num];
		//Enter numbers
		System.out.println("請輸入 " + num + " 個數字 :");
		for(int i = 0; i < num; i++){
			list[i] = input.nextInt();
		}
		System.out.println();
		//Add the numbers to BinaryTree(int[] list)
		BinaryTree(list);
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
	}
}
