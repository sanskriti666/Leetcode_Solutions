class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();
        for(String ops : operations){
            if(ops.equals("C")){
                stack.pop();
            }
            else if(ops.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(ops.equals("+")){
                int top= stack.pop();
                int newScore= top+ stack.peek();
                stack.push(top);
                stack.push(newScore);
            }
            else stack.push(Integer.parseInt(ops));
        }
        int totalSum=0;
        for(int score : stack){
            totalSum+= score;
        }
        return totalSum;
    }
}