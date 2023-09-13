#!/bin/bash
read -p "Enter any Letter from VIBGYOR: " color
case "$color" in
	"V") echo "Violet";;
	"I") echo "Indigo";;
	"B") echo "Blue";;
	"G") echo "Green";;
	"Y") echo "Yellow";;
	"O") echo "Orange";;
	"R") echo "Red";;
	*) echo "INVALID OPTION";;
esac
