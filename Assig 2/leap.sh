#Take the year from the user and display if it is leap year.

#!/bin/sh

read -p " Enter year : " year
yr=$(( $year % 4 ))
yr1=$(( $year % 400 ))
if [[ $yr = 0 || $yr1 = 0 ]]

#if [[ $(( $year % 4 )) = 0 || $(( $year % 400 )) = 0 ]]
then
    echo " $year is leap year "
else
    echo " $year is not a leap year " 
fi