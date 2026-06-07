package main

import "fmt"

// functions ------------------------------------
// number = 10 and have the two machines M1 and the M2.
// when input to the M1 it increase the value in 1 and
// the when input to the M2 make the value 0 .

// that s like the functions work .

// in this functions work with the pointers

// func to increment a value using a pointer
func increment(value *int) {
	*value++
}

func setToZero(value *int) {
	*value = 0
}

func main() {

	num := 10
	increment(&num)

	fmt.Println("After incrementing: ", num)

	setToZero(&num)
	fmt.Println("After setting to zero: ", num)
}
