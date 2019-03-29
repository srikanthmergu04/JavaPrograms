class ComplaintDetails
{
	private int Cno;
	String Cstatus;
	ComplaintDetails()
	{
		System.out.println("ComplaintDetails Object Created");
	}
	public void setCno(int Cno)
	{
		if(Cno>0)
		{
			this.Cno = Cno;
		}
		
		else
		{
			this.Cno = 001;
			
		}
	}
	int getCno()
	{
		return Cno;
	}
	
	void ShowComplaintDetails()
	{
		System.out.println("--------------------");
		System.out.println("Complaint No : "+Cno);
		System.out.println("Complaint Status : "+Cstatus);
		System.out.println("--------------------");
	}
	
}

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplaintDetails c1 = new ComplaintDetails();
		
		c1.setCno(-1);
		c1.Cstatus = "In Process";
		c1.ShowComplaintDetails();
		

	}

}
