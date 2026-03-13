class count
{
	public static void main(String args[])
		{
			int[] arr = {1,3,5,5,5,7,6,5};
			int countI=0;
			
			for(int i=0; i<=arr.length-1; i++)
			{
				System.out.println("Array " +arr[i]);
				countI++;
			}
			System.out.println("Count: "+countI);
		}
}