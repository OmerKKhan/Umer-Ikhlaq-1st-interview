import java.util.Map;

// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2

// [2,4]  Target = 6, Answer =0,1

class Main {
  public static void main(String[] args) {

    int[] numbers = {1,9,5,19};
    int target = 6;
    int [] indexes =  targetSum(numbers, target);
    System.out.println(indexes[0]);
    System.out.println(indexes[1]);
    
  }

  public static int[] targetSum(int[] numbers, int target){

     int[] index = new int[2];

    Map<Integer,Integer> map = new HashMap<>();
    int diff= 0;
    for(int i=0; i<numbers.length;i ++){
      diff = target - numbers[i];
      if(map.containsKey(diff)){
        index[0] = map.get(diff);
        index[1] = i;
        return index;
      }
      map.put(numbers[i], i);

    }
    
    return index;
   
  }
}