package erros;

public class Int extends Exception{

	private int a;
	public Int(int a)
	{
		super ();
	}
	@Override
	public String toString()
	{
		return a + " não é um inteiro válido";
	}
}
