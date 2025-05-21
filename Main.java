/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test = new DACArecipient();

    System.out.println("Test: " + test);

    DACArecipient test2 = new DACArecipient("Gomez", "Nayan", "123-456-789", "Mexico", 2415021, 2415021, 2415021, 'F');
    
    System.out.println("Test #2: " + test2);
  
  }
}