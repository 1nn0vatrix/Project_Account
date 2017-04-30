
public class King extends ChessPiece {
	

	public King(Color c) {
		super(c);
		
		
	}
	@Override
	public void Move(String mv)
	{
		
	}
	@Override
	public boolean parseMove(String mv)
	{
		
		return true;
	}
	
	public String toString()
	{
		if(Color.black!=null)
		{return "K";}
		else
			return "k";
	}
	
}
