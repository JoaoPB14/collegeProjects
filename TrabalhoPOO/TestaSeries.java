
public class TestaSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Series s1 = new Series();
		Series s2 = new Series();
		Series s3 = new Series();
		
		s1.setI1(1);
		s1.setI2(10);
		s1.setPasso(1);
		
		s2.setI1(10);
		s2.setI2(0);
		s2.setPasso(2);
		
		s3.setI1(-5);
		s3.setI2(5);
		s3.setPasso(1);
		
		System.out.println(s1.mostraSerie()); 
		System.out.println(s2.mostraSerie());
		System.out.println(s3.mostraSerie());
	}

}
