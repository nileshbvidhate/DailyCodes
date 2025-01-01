#include<stdio.h>

int Reverse(int iNo)
{
    int iDigit = 0, iRevNum = 0; 
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iRevNum = (iRevNum * 10) + iDigit;
        iNo = iNo / 10;
    }
    return iRevNum;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Please enter Number : \n");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);

    printf("Reverse number is : %d\n",iRet);

    return 0;
}
