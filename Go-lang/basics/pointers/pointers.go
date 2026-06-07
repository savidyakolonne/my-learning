package main

import "fmt"

func main() {
	var num int = 10
	fmt.Println(num)

	// print the pointing address
	fmt.Println(&num)

	// declare a pointer to an interger
	var ptr *int

	ptr = &num

	fmt.Println(ptr)

	// pointer dereferencing --------------------------------
	fmt.Println(*ptr)

	// update the value with the pointer
	num = 100
	*ptr = 200
	// ptr = 200 cant change the pointer value lol
	fmt.Println(num) // update to the 200

	// pointer has the memory address also . print the pointers addresss wit the 7
	fmt.Println(&ptr)

}
