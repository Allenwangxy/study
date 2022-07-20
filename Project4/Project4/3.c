#include<stdio.h>
int main()
{
	enum a {red,blue,green,yellow };
	int brown = red + blue + green + yellow;
	printf("%d\n",red);
	printf("%d\n",blue );
	printf("%d\n", green);
	printf("%d\n", yellow);
	printf("%d\n", brown);
	return 0;
}