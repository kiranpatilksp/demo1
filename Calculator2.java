package Pack;
//wap to create java application for calculator 
public class Calculator2 
{

int x;
int y; 

void add()
{
	x=10;
	y=20;
	System.out.println(" sum= "+ (x+y));
}
void subtract()
{
	x=33;
	y= 23;
	System.out.println("difference"+ (x-y));
	
}
public static void main(String[] args) {
	Calculator2 cal= new Calculator2();// we created class instance
	
	
	cal.add();
	cal.subtract();

	



}

}
