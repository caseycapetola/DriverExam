
public class DriverExam 
{
	private char[] correctAnswers;
	
	public Answers(char[] answers)
	{
		correctAnswers = answers;
	}
	
	public boolean passed(char[] studentAnswers)
	{
		int correct = 0;
		int score = (correct/correctAnswers.length)*100;
		for(int i=0; i<correctAnswers.length; i++)
		{
			if(studentAnswers[i] == correctAnswers[i])
				correct++;
		}
		if(score>=75)
			return true;
		else
			return false;
	}
	
	public int totalCorrect(char[] studentAnswers)
	{
		int correct = 0;
		for(int i=0; i<correctAnswers.length; i++)
		{
			if(studentAnswers[i] == correctAnswers[i])
				correct++;
		}
		return correct;
	}
	
	public int totalIncorrect(char[] studentAnswers)
	{
		int incorrect = 0;
		for(int i=0; i<correctAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
				incorrect++;
		}
		return incorrect;
	}
	
	public int[] questionsMissed(char[] studentAnswers)
	{
		int[] questionsMissed;
		int arrSize =  0;
		for(int i=0; i<correctAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				arrSize++;
				questionsMissed = new int[arrSize];
				questionsMissed[0] = i+1;
				
			}
		}
	}
}
