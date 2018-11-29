#!/bin/bash
prefix=${1:-192.168.178}

for ip in `seq 1 254`
do
  ( ping -c1 -w1 ${prefix}.${ip} > /dev/null 2>&1 && echo ${prefix}.${ip} ) &
done
wait

