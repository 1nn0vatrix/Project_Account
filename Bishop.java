
public class Bishop extends ChessPiece {

	public Bishop(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Move(String mv)
	{
		if(parseMove(mv)==true)
		{
			System.out.println("The move is Valid!");
		}
		else
		{
			System.out.println("The move is Invalid.");
		}
		
	}
	@Override
	public boolean parseMove(String mv)
	{
		if(mv.length()!=4)
		{
			return false;
		}
		else
		{
			
		}
		
		return true;
	}
	public String toString()
	{
		return "B";
	}

}
