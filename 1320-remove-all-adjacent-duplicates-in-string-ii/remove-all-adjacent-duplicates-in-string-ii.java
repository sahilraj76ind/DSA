class Solution {
        class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char current= s.charAt(i);
            if(!stack.isEmpty() && stack.peek().ch==current){
                stack.peek().count++;
                if(stack.peek().count==k){
                    stack.pop();
                }
            }else{
                    stack.push(new Pair(current,1));
                }

        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<stack.size();i++){
            Pair p = stack.get(i);
            for(int j=0;j<p.count;j++){
                ans.append(p.ch);
            }
        }
        return ans.toString();

    }
}