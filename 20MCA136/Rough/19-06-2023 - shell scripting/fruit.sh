#!/bin/bash
read -p "Enter any Fruit from (apple, banana, orange): " fruit
case "$fruit" in
	"banana") echo "i like banana";;
	"apple") echo "i like apple";;
	"orange") echo "i like orange";;
	*) echo "INVALID OPTION";;
esac
