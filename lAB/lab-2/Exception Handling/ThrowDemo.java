public class ThrowDemo {
    public void eligibility (int age)
	{
		if (age < 16) {
			throw new ArithmeticException("You donot have right to make driving license ");
		}
        else{
            System.out.println("you have right to make driving license");
        }
	}
    public static void main(String[] args)
	{
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.eligibility(15);
		}catch(Exception error) {
			System.out.println("Exception message : " + error.getMessage());
		}
	}
}