class Solution {
    public String solution(String s) {
                String answer = "";

        String[] c = s.split(" ");

        int[] arr = new int[c.length];

        for(int i = 0; i < c.length; i++){
            arr[i] = Integer.parseInt(c[i]);
        }

        int max = -9999999;
        for(int i = 0; i < c.length; i++){
            if(max < arr[i])
                max = arr[i];
        }

        int min = 9999999;
        for(int i = 0; i < c.length; i++){
            if(min > arr[i])
                min = arr[i];
        }

        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}