package main

import "fmt"

// define the struct
type Employee struct {
	ID       int
	Name     string
	Position string
	Salary   float64
}

// create func printEmployeeDetails
func printEmployeeDetails(emp Employee) {
	fmt.Println(emp)
}

// create the instance of employee
func main() {
	emp := Employee{
		ID:       101,
		Name:     "John Doe",
		Position: "Software Engineer",
		Salary:   75000.00,
	}

	// call the print func
	printEmployeeDetails(emp)
}
