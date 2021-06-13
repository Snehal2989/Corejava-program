package noargs;

public class Calci {
	int x=50;
	int y=90;
	int z=120;
	
	public Calci()
	{
		this(100);
		int add=x+y+z;
		System.out.println("addition is "+add);
		int sub =x+y-z;
		System.out.println("subtrction is " + sub);
		int div=((z/2)+y)/x;
		System.out.println("Division is "+ div);
		int mul=z*div;
		System.out.println("multiplication is " +mul);
		
	}
	
	public Calci(int t)
	{
		System.out.println("parametrised const");
	}

	public static void main(String[] args) {

        Calci c= new Calci();
        

	}

}
