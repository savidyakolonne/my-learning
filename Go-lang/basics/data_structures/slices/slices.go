//  why slices when have the arrays?
// slices, we can expand the container. arrays can expand (add more elemnents)

package main

import "fmt"

func main() {

	// declare and intialize a slice
	numbers := []int{1, 2, 3, 4, 5}

	fmt.Println(numbers)
	fmt.Println(numbers[0])
	numbers[4] = 10
	fmt.Println(numbers[4])

	// append elements to the slice (add a element to end)
	numbers = append(numbers, 6)
	fmt.Println(numbers)
	fmt.Println(len(numbers))

	// remove elements from the slice
	fmt.Println(numbers)
	numbers = append(numbers[:2])
	fmt.Println(numbers)
}
