#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (void) {
    float lAmount,iRate,disc,i;
    int years,months;

    printf ("please enter the total loan amount: ");
    scanf("%f",&lAmount);
    printf ("please enter no of years: ");
    scanf("%f",&years);
    printf ("please enter interet rate: ");
    scanf("%f",&iRate);

    months=years*12;
    i=iRate/12;
    disc=(pow((1+i),months)-1)/((i)*pow((1+i),months));

    printf ("\n the value of discount is: %f ",disc);

    printf ("\n te monthly  loan repayment is: %f ",lAmount/disc);
    return EXIT_SUCCESS;


}