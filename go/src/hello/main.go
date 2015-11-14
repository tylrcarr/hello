package main

import (
	"fmt"
	c "github.com/skilstak/go/colors"
	"os"
	"time"
)

func Plain(message string) {
	fmt.Println("Hello World!")
}

func Loop(message string) {
	for {
		fmt.Println("Hello World!")
	}
}

func Color(message string) {
	for {
		fmt.Println(c.Rc() + message)
	}
}

func Multi(message string) {
	for {
		fmt.Println(c.Clear + c.Multi(message))
		time.Sleep(2 * time.Millisecond)
	}

}

func main() {
	var name = "cis scum"
	var option = os.Args[1]
	if option.hasPrefix(os.Args[1], "-") {
		var name = Args[2]
		if option == "-m" {
			Multi(name)
		} else if option[2] == "-c" {
			Color(name)
		} else {
			fmt.Println("Use -c, -m, or no - at all.")
		}
	} else {
		var name = Args[1]
		Plain(name)
	}
}
