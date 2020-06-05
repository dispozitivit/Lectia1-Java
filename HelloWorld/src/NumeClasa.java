
public class NumeClasa {

	int test;
	int $test;
	//permis deoarece folosim java 8, versiunile mai mari de java de la 9 inclusiv au eliminat _
	int _test;
	int TEST;
	//permis deoarece _ nu apare la inceputul denumiri atributului;
	int TEST_UNU_TEST;
	
	public static void main(String args[]) {
//		
//		String s = "Salutare !";
//		
//		System.out.println(s);
//		
		int x = 10;
		
		if(x == 100) {
			System.out.println("x = 100");
		}else {
			System.out.println("x este diferit de 100: "+x);
				
		}
		
		System.out.println(x==100?"x = 100":"x este diferit de 100: "+x);
		
//		
//		switch (x) {
//		case 1:
//			System.out.println("x = 1");
//			break;
//		case 100:
//			System.out.println("x = 100");
//			break;
//
//		default:
//			System.out.println("x = nu este 1 sau 100, are o alta valoare "+x);			
//			break;
//		}
		
		
	}
	
}
