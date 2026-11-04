class Solution {
    public boolean isPerfectSquare(int num) {
        int iCnt = 1;

        while((long)iCnt * iCnt <= num)
        {
            if(iCnt * iCnt == num)
            {
                return true;
            }
            iCnt++;
        }

        return false;
    }
}