#include<stdio.h>
#include<stdbool.h>

bool IsDivisibleByThreeAndFive(int iNo)
{
    if((iNo % 3 == 0) && (iNo % 5 == 0))
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    bRet = IsDivisibleByThreeAndFive(iValue);
    if(bRet == true)
    {
        printf("Number is divisible by 3 and 5\n");
    }
    else
    {
        printf("Number is not divisible by 3 or 5 or both. \n");
    }
    return 0;
}