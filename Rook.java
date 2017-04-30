
public class Rook extends ChessPiece {
	
	private	int row1;
	private int col1;
	private int row2;
	private int col2;

	public Rook(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void AnalyzeMove(String mv) throws Exception
	{

		StringBuilder tmp = new StringBuilder();
		String temp=mv.toUpperCase();
		switch(temp.charAt(0))
		{
		case 'A':
			row1 = 0;
			break;
		case 'B':
			row1 = 1;
			break;
		case 'C':
			row1 = 2;
			break;
		case 'D':
			row1 = 3;
			break;
		case 'E':
			row1 = 4;
			break;
		case 'F':
			row1 = 5;
			break;
		case 'G':
			row1 = 6;
			break;
		case 'H':
			row1 = 7;
			break;
		default:
			throw new Exception("Invalid board character selected. Please try again.");
			
		}
		
		col1=Character.getNumericValue(temp.charAt(1));
		
		switch(temp.charAt(2))
		{
		case 'A':
			row2 = 0;
			break;
		case 'B':
			row2 = 1;
			break;
		case 'C':
			row2 = 2;
			break;
		case 'D':
			row2 = 3;
			break;
		case 'E':
			row2 = 4;
			break;
		case 'F':
			row2 = 5;
			break;
		case 'G':
			row2 = 6;
			break;
		case 'H':
			row2 = 7;
			break;
		default:
			throw new Exception("Invalid board character selected. Please try again.");
			
		}
		
		col2=Character.getNumericValue(temp.charAt(3));
	}
	@Override
	public void Move(String mv)
	{
		
	}
	@Override
	public boolean parseMove(String mv) throws Exception 
	{
		
		
		
		return true;
	}
	public String toString()
	{
		return "R";
	}

}
