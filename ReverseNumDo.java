class ReverseNumDo
{
	public static void main(String[] arge)
	{
	int n = 12345;
	int rev =0;
	int i =n;
	do
	{
	int rem= i%10;
	rev=rev*10+rem;
	i=i/10;
	}while(i>0);
	System.out.println("Reverse of the number is :"+rev);
	}
}