package AccessMode;

public class Protectedorg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class C extends B{
			C obj=new C();
			int op=obj.z;
			System.out.println("value of x is" + op);
			obj.b1();
		}

	}

}
