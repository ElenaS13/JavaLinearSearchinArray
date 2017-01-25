
public class BubbleSort2 {

	public static void main(String[] args) {
		
int[] a = {32, 13, 2, 3, 6, 7,8, 55, 67};

int j =0;
int t=0;

for(int i=0; i<a.length; i++){
	//System.out.println("After i for loop: "+ a[i]);
	for(j=0; j <a.length-i -1; j++){
		
		if(a[j]>a[j+1]){
			t=a[j];
			a[j] = a[j+1];
			a[j+1] = t; 
		}
	}
}

for(int i =0; i<a.length; i++){
	System.out.println(a[i]+ " ");
}
	}

}
