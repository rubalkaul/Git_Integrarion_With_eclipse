package day2.usingStatic;

public class CourseProcessor {
   static int counter;
   public static float cost;

   public static float getCost() {
      return cost;
   }

   public static int getCounter() {
      return counter;
   }
   public static void create (int courseId, String courseTitle, int courseDuration, String courseProvider, float courseCost){
      int id=courseId,duration=courseDuration;
      String title=courseTitle,provider=courseProvider;
      counter++;
      cost=courseCost;
   }
}
