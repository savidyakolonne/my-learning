package main

import "fmt"

func main() {
	var itemPrice float64 = 50.50
	var itemQuantity int = 2
	var discountPrecentage float64 = 10

	totalCost := itemPrice * float64(itemQuantity)

	totalDiscount := totalCost * (discountPrecentage / 100)

	finalCost := totalCost - totalDiscount

	fmt.Println("Item price is", itemPrice)
	fmt.Println("Item quantity is: ", itemQuantity)
	fmt.Println("Item discount precentage: ", discountPrecentage)

	fmt.Println("The total cost is: ", totalCost)
	fmt.Println("Total discount is: ", totalDiscount)
	fmt.Println("Final cost is : ", finalCost)
}
