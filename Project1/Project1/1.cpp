#include<stdio.h>
int main(void)
{
	int money = 100;
	double height = 150;
	
	money = money - 10;
	height = height + 10.5;

	printf("%d\n", money);
	printf("%lf", height);


	return 0;
}