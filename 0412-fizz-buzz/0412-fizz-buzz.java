class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
         
        for(int i = 1 ; i<=n ;i++){
            ans.add(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : 
            String.valueOf(i));
        }
        return ans;
        //     if(i%3 == 0 && i%5 == 0){
        //         ans.add("FizzBuzz");
        //     }
        //     else if(i%3 == 0){
        //         ans.add("Fizz");
        //     }
        //     else if(i%5==0){
        //         ans.add("Buzz");
        //     }
        //     else{
        //         ans.add(Integer.toString(i));
        //     }
            
        // }
        // return ans;
        
        
    }
}