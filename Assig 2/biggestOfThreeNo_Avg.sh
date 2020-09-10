# 3. a) Write a script to find biggest of three no.s
#    b) To find avg of 3 no.s, read no.s from keyboard

read -p "enter 3 numbers" no1 no2 no3
echo " $no1 $no2 $no3 "
if [ $no1 -gt $no2 ] && [ $no1 -gt $no3 ]
then
    echo " $no1 is the gretest no "
    elif [ $no2 -gt $no1 ] && [ $no2 -gt $no3 ]
    then
        echo " $no2 is grestest no "
else
echo " $no3 is gretest no "
fi


sum=$(( $no1 + $no2 + $no3 ))
avg=$(( $sum / 3 ))
echo " Avg is $avg"

