#!/bin/bash
read -p "Enter any State (Tamil Nadu, Kerala, Karnataka): " capital
case "$capital" in
	"Tamil Nadu") echo "Chennai is the Capital of Tamil Nadu";;
	"Kerala") echo "Trivandrum is the Capital of Kerala";;
	"Karnataka") echo "Banglore is the Capital of Karnataka";;
	*) echo "INVALID OPTION";;
esac

