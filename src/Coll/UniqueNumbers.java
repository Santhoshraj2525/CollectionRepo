package Coll;

public class UniqueNumbers {

	public static void main(String[] args) {
		int [] arr= {1,2,1,2,5,8,4,7,6,2,1};
		int[] xx= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int j,count=1;
			if(arr[i]!=0) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
					}
			}}
			xx[i]=count;
			
		}
	
	for(int i=0;i<xx.length;i++) {
		if(xx[i]==1 && arr[i]!=0) {
			System.out.println(arr[i]+ " the unique number");
		}else if(xx[i]>1 && arr[i]!=0) {
			System.out.println(arr[i]+ " this number is not an unique number and the presence is " +xx[i]);
		}
	}
	}}
