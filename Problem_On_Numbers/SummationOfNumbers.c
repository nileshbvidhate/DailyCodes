#include<stdio.h>


int SummationOfNumbers(int iNum)
{
    int iSum = 0;
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNum; iCnt++)
    {
        iSum = iSum + iCnt;
    }
     
    return iSum;
}

int main()
{
    int iRet = 0;
    int iNum = 0;

    printf("Enter the number upto which you want to calculate the sum of numbers :\n");
    scanf("%d",&iNum);

    iRet = SummationOfNumbers(iNum);

    printf("Summation is : %d\n",iRet);

    return 0;
}