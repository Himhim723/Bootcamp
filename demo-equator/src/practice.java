import java.util.Scanner;
import java.util.Random;
public class practice{
	void ascending1(int[] Arra) {
		for (int i=Arra.length-1;i>0;i--) {
			for (int j=0;j<Arra.length-1;j++) {
				if (Arra[j]>Arra[j+1]) {
					int sub = Arra[j+1];
					Arra[j+1]=Arra[j];
					Arra[j]= sub;
				}
			}
		}
		for(int s=0;s<Arra.length;s++) {
			System.out.print(Arra[s]+"\t");
		while ((s+1)%10==0) {
			System.out.println();
			break;
		}
		}
	}
	
	void QuickSearch(int[] Array){
		Scanner input = new Scanner(System.in);
		int low=0,high=Array.length,rank=-1,midNum;
		int ans = input.nextInt();
		do {
			midNum=(low+high)/2;
			if(ans ==Array[midNum]) {
				rank=midNum+1;
				break;
			}if(ans>Array[midNum]) {
				low=midNum;
			}else {
				high=midNum;
			}
		} while (low!=high);
		System.out.println(ans +" ranked "+rank );
		
	}
	
	static int factorial(int x) {
		int result = 1;
		for (int ans = x;ans>0;ans--) {
			result *= ans;
		} return result;
	}
	
	static void game1(){
		Scanner input= new Scanner(System.in);
		Random ran = new Random();
		int ans=(ran.nextInt(98)+1);
		int low=0, high=100;
		int res;
		do {
			System.out.println("Enter a number between "+low+" and "+high);
			res = input.nextInt();
			if (res>ans) {
				high=res;
			} else if (res<ans) {
				low=res;
			}  else{
				System.out.println("You have got the correct answer");
			}
		} while (res!=ans);
	}
	
	static void randomExist(int[]List) {
		Random ran = new Random();
		int check;
		for (int a=0;a<List.length;a++) {
			do {
				check=0;
				List[a]=ran.nextInt(100)+1;
			for (int b=0;b<a;b++) {
				if (List[a]==List[b]) {
					check=1;
				}
			}
			}while (check==1);
		}
	}
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static float add (int a, float b) {
		return a+b;
	}
	
public static void main(String[]args) {	
	Scanner input= new Scanner(System.in);
	Random ran = new Random();
	game1();
	int[] num = new int[30] ;
	randomExist(num);
	practice sorting = new practice();
	sorting.ascending1(num);
	System.out.print("Enter a number you like: ");
	sorting.QuickSearch(num);
	System.out.print("Enter a number: ");
	int x = input.nextInt();
	int ans1=factorial(x);
	System.out.println(x+"! = "+ans1);
	System.out.print("Enter a number: ");
	int o = input.nextInt();
	int ans2=factorial(o);
	System.out.println(o+"! = "+ans2);
}
}

