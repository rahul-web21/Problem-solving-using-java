class Solution {
    public int findLucky(int[] arr) {

        int[] freq = new int[501];

        for(int nums : arr)
        {
            freq[nums]++;
        }

        for(int i=500 ; i>=1 ; i--)
        {
            if(i==freq[i])
            {
                return freq[i];
            }
        }

        return -1;


        
    }
}
