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
		return a + " n�o � um inteiro v�lido";
	}
}
