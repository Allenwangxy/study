#include<stdio.h>
int main()
{
	int a;
	int b;
	int sum;
	scanf_s("%d %d", &a, &b);
	sum = a + b*a;
	printf("%d", sum);
	return 0;
}