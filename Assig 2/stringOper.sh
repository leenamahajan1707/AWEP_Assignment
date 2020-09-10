# 2. Write a menu based script to perform following string operations
# a) To find length of a string
# c) Copying string
# d) Concatenation of strings
# e) Compare two strings
# f) Reversing a string


while [ true ]
echo 1. find length of string
echo 2. Copying string
echo 3. Concatenation of strings
echo 4. Compare two strings
echo 5. Reversing a string
read ch
do
case $ch in
1)  len=0
    echo " enter string" 
    read str
    len=`expr $str | wc -m`
    echo length is: $(( $len-1 ))
    ;;
2) echo " enter string" 
    read str
    cp $str str1
    echo string is : $str1
    ;;
3)    
        echo Enter String1:
        read str1
        echo Enter String2:
        read str2

        str3=$str1$str2
        echo new String: $str3
        ;;
4)
    read -p "enter two string : " str str1
    if [ $str = $str1 ]
    then
        echo strings are equal!!
    else
        echo strings are different!!
    fi
    ;;
5)
    echo Enter String:
    read str
    echo "$str" | rev 
    
    ;;
esac
    echo Do u want to continue?
    read ans
    if [ $ans = n ] 
    then
        exit
    fi
done