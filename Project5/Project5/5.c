#include<stdio.h>
#include<string.h>
int main()
{
	char a[] = "book";
	char b[] = { 'b','o','o','k','\0'};
	printf("%s\n", a);
	printf("%s\n", b);

	int num1 = strlen(a);
	int num2 = strlen(b);
	printf("%d\n", num1);
	printf("%d\n", num2);
	return 0;
}