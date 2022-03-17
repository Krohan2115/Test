import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage

  public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore,
      int finalExamScore) {

      float a = assignmentScore*0.1f;
	  float p = projectScore*0.35f;
	  float q = quizScore*0.1f;
	  float m = midTermScore*0.15f;
	  float f = finalExamScore*0.30f;

	  float overallPercentage = a+p+q+m+f;
      
      return overallPercentage;
  }

}
