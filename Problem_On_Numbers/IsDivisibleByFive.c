#include<stdio.h>
#include<stdbool.h>

bool isDivisibleByFive(int iValue)
{
    bool bFlag = false;
    if(iValue % 5 == 0)
    {
        bFlag = true;
    }

    return bFlag;
}

int main()
{
    int iNo = 0;
    bool bFlag = false;

    printf("Enter  number : \n");
    scanf("%d",&iNo);

    bFlag = isDivisibleByFive(iNo);
    if(bFlag)
    {
        printf("%d is divisible by 5\n",iNo);
    }
    else
    {
        printf("%d is not divisible by 5\n",iNo);
    }

    return 0;
}