package test;
class A {   
   void averageScore(int...values) {
      int sum = 0;
      float average = 0f;
      
      for(int value : values) {
          sum += value; // value = values[i]
       }
      
//      for(int i = 0; i < values.length; i++) {
//         sum+=values[i];         
//      }
      average = sum / (float)values.length;      
      System.out.println(average);      
   }
}
public class Part7_exam5 {
   public static void main(String[] args) {
               
      A a = new A();
            
      a.averageScore(1);
      a.averageScore(1, 2);
      a.averageScore(1, 2, 3);
      a.averageScore(1, 2, 3, 4);         
   }
}