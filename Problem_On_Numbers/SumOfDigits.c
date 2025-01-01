#include<stdio.h>

int SumOfDigits(int iNo)
{
    int iSum = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iSum = iSum + (iNo % 10);
        iNo = iNo / 10;
    }
    return iSum;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Please enter number : \n");
    scanf("%d",&iValue);

    iRet = SumOfDigits(iValue);

    printf("Summation of digits : %d\n",iRet);

    return 0;
}