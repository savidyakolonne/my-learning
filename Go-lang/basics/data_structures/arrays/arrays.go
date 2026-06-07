package main

import "fmt"

func main() {

	// var number int = 20;

	var numbers = [5]int{1, 2, 5, 6, 3}
	fmt.Println(numbers[2])

	var colors [3]string
	colors[0] = "red"
	colors[1] = "green"
	colors[2] = "blue"
	fmt.Println(colors)
	fmt.Println(len(colors))

	colors[1] = "yellow"
	fmt.Println(colors)

	var number = [...]int{1, 2, 3, 4, 5}
	// can write like this also
	// var number = []int{1, 2, 3, 4, 5}
	fmt.Println(len(number))

	// 2D arrays -----------------------------------

	// want to know the cols and rows
	/* 2 4 6
	   8 10 5
	   0 -7 2
	*/

	var metric = [3][3]int{{2, 4, 6}, {8, 10, 5}, {0, -7, 2}}
	fmt.Println(metric)

	// example 2
	/*  1 3
	4 5
	7 8
	10 9
	*/
	// row =4, col =2
	// 4*2

	var newMetric = [4][2]int{{1, 3}, {4, 5}, {7, 8}, {9, 10}}
	fmt.Println(newMetric)
	fmt.Println(newMetric[0])
	fmt.Println(newMetric[0][0])
}
