package main

import "fmt"

func main() {
	// a := 10
	// b := 3

	// sum := a + b
	// difference := a - b
	// product := a * b
	// quotient := a / b
	// remainder := a % b

	// fmt.Println("Sum: ", sum)
	// fmt.Println("Sum: ", difference)
	// fmt.Println("Sum: ", product)
	// fmt.Println("Sum: ", quotient)
	// fmt.Println("Sum: ", remainder)

	// video6 -------------------------------------------------------

	var intNum int = 10
	var floatNum float64 = 3.5

	sum := intNum + int(floatNum)
	fmt.Println("Sum is: ", sum)

	sum2 := float64(intNum) + floatNum
	fmt.Println("Sum2 is: ", sum2)

	sum3 := 3
	fmt.Println(sum3)

	sum3 = 20
	fmt.Println(sum3)
	// cant assign again with the another type (eg: float)

}
