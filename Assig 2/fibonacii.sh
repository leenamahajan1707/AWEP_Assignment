#!/bin/sh

 a=0;
 b=1;
 echo -n "$a $b"

 for i in {2..10}
 do
 fab=$(( $a + $b))
    a=$b
    b=$fab
    
    echo -n " $fab "
 done