package main

import "fmt"

func main() {
	// question - calculate the area of a cricle

	var radius int = 10
	const pie float64 = 3.141592653589793

	var area float64 = pie * float64(radius) * float64(radius)

	fmt.Println("The area of the circle is: ", area)
}
