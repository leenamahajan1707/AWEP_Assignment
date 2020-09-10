# 2. Write a script to print day of the week using
# 	a) elif	b) case 


read -p "enter number: " no

# case $no in
# 1) echo "Sunday" ;;
# 2) echo "Monday" ;;
# 3) echo "Tuesday" ;;
# 4) echo "Wednesday" ;;
# 5) echo "Thursday" ;;
# 6) echo "Friday" ;;
# 7) echo "Saturday" ;;
# *) echo "enter value between 1 to 7" ;;
# esac

if [ $no == 1 ]
then 
    echo "Sunday"
    elif [ $no == 2 ]
    then
    echo "Monday"
    elif [ $no == 3 ]
    then
    echo "Tuesday"
    elif [ $no == 4 ]
    then
    echo "Wednesday"
    elif [ $no == 5 ]
    then
    echo "Thursday"
    elif [ $no == 6 ]
    then
    echo "Friday"
    elif [ $no == 7 ]
    then
    echo "Saturday"

    else
        echo "enter value between 1 to 7"

fi