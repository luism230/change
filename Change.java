public class Change {
	public static void main(String[] args){
		System.out.println("hello world");
		System.out.println(NumberOfWaysToMakeChange(100, 0) + "combos");

	}
	public static int NumberOfWaysToMakeChange (int cents, int start)
	{
		int number_of_ways = 0;
		if(cents == 0)
		{
			return 1 ;
		}
		else if(cents > 0)
		{
			int[] coins = {25, 10, 5, 1 };
			
			for (int i = start; i < coins.length; i++)
			{
				if(i ==3)
				{
					number_of_ways++;
				}
				else
				{
					number_of_ways += NumberOfWaysToMakeChange(cents - coins[i], i);
				}
			}
		}
		else if (cents < 0)
		{
			return 0;
		}
		return number_of_ways;
	}
}
