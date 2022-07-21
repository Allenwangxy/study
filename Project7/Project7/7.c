#include<stdio.h>
int main()
{
int input;
printf("Are you ok?\n");
printf("Yes/No\n");
printf("Yes=1    No=2");
scanf_s("%d", &input);
if (input == 1)
printf("Fine");
else
printf("Come on");
return 0;
}