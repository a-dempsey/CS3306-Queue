#!/bin/sh

dir_path=pwd

count=001

if [ -e backup-dir]
then
    :
else
    mkdir backup-dir
fi

new_date=$(date  "+%Y-%m-%d")
new_backup=$new_date"-"$count

mkdir backup-dir/$new_backup
cp -R x backup-dir/$new_backup

count=`expr $count + 001`



