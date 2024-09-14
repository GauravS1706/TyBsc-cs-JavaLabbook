package assignment1.setA;

public class Q1 {
	int num;

	public Q1() {
		num=0;
	}

	public Q1(int num) {

		this.num = num;
	}

	public static void main(String[] args) {
		
		Q1 q= new Q1();
		if(args.length>0)
		{
			int n= Integer.parseInt(args[0]);
			Q1 q2=new Q1(n);
			System.out.println(q.num);
			System.out.println(q2.num);
		}
		else {
			System.out.println("Insufficent arguments");
		}
	}

}
