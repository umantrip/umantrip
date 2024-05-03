package practicejava;

class Amazon_Application
{
	private String un="stbymkt@gmail.com";
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
}

public class GetterSetter 
{

	public static void main(String[] args) 
	{
		Amazon_Application a1=new Amazon_Application();
		a1.setUn("simba@gmail.com");
		System.out.println(a1.getUn());

	}

}
