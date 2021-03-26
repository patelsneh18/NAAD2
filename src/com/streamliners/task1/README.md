# Assignment / Task 1

## 1.1 modify()
Write a function
`String modify(String s, String replacements)`where :
- String s consists of digits (0-9).
- String replacements consists pairs of < int, char >.

Your task is to form a new string such that each digit in s is replaced by its corresponding character as given in replacements string.

Example :

`modify("12332321", "2R3S1T4D") = "TRSSRSRT"`

---

## 1.2 totalWeight()
Write a function
`int totalWeight(String s, int[] weights)`where :
- String s consists characters (A-E).
- int[] weights consists weights of characters A-E in the order A-E.

Your task is to return the total weight of string s according to weights given.

Example : 

`totalWeight("EEDBCCAB", [4, 3, 2, 1, 5]) = 25`

`{ (1A = 4) + (2B = 6) + (2C = 4) + (1D = 1) + (2E = 10) = 25 }`

---

## 1.3 isDirectlyProportional()
Write a function
`boolean isDirectlyProportional(int[] x, int[] y)`where :
- x & y are two inter-related mathematical variables
- x.length = y.length
- x[i] is related to y[i]

Your task is to return a boolean stating whether x & y are directly proportional to each other.

You can learn about Proportionality [here](https://www.mathsisfun.com/algebra/directly-inversely-proportional.html)

---

## 1.4 Custom exception & RegExp
Learn about Custom exceptions [here](https://www.programiz.com/java-programming/examples/create-custom-exception)

Your task is to throw custom exception named InvalidReplacementsException in Task 1.1's program when

- replacements string is invalid

- replacement for a digit in s is not given in replacements string
    
Example :

- modify("12", "2R") is invalid as replacement for 1 is not given

- modify("12", "12") is invalid as it does not match the format < int, char >

**To check validity of replacement string, use Regular Expressions.**

Learn about RegExp at [A](https://www.vogella.com/tutorials/JavaRegularExpressions/article.html), [B](https://www.programiz.com/java-programming/library/string/matches)
or [C](https://www.javatpoint.com/java-regex)

Best tool to try out RegExp - [RegExr](https://regexr.com/)
 