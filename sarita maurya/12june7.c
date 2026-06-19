/*7. WAP to input your name and
 check your name is polyndrom or not. :
Divya : ayvid
Kanak : kanak
Madam : madam
Saras : saras*/
#include<stdio.h>

int main()
{
    char name[20];
    int i,l;
    printf("enter your name:");
    gets(name);
    l=strlen(name);
    for(i=0;i<l/2;i++)
    {
    if(name[i]!=name[l-1-i])
    {
    printf("Not a polyndrom");
    break;
    }
    }
    if(i==l/2)
    printf("Polyndrom");
    printf("\nHello world!");
    return 0;
}
/*o/p:enter your name:saras
Polyndrom
Hello world!
enter your name:sarita
Not a polyndrom
Hello world!
*/