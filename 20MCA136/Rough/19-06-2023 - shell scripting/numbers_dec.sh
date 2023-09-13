read -p "Enter the Start Range: " start
read -p "Enter the End Range: " end
while [ $start -ge $end ]
do
    echo $start
    start=$(($start-1))
done
