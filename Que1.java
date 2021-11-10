package LambdaExpression;
@FunctionalInterface 
interface Sum
{
	int add(int a,int b);
}
interface Substract
{
	int sub(int a,int b);
}
interface Multiply
{
	int multi(int a,int b);
}
interface Divide
{
	int div(int a,int b);
}
public class Que1 {

	public static void main(String[] args) {
		Sum A=(x,y)->
		{
			return x+y;
		};
		Substract S=(a,b)->
		{
			return a-b;
		};
		Multiply M=(a,b)->
		{
			return a*b;
		};
		Divide D=(a,b)->
		{
			return a/b;
		};
		System.out.println(A.add(20, 10));
		System.out.println(S.sub(30, 10));
		System.out.println(M.multi(20,10));
		System.out.println(D.div(20,5));
	}

}
