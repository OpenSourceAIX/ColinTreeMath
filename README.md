## 数学运算库拓展

更新于2016.10.15 版本1.0

对Appinventor的数学运算进行功能拓展咯！内置了一下函数：

|显示函数名|功能|
|-|-|
|Average(计算平均值)|计算参数(数字列表*)中的所有数字的平均值|
|BubbleSortInAscendingOrder(按升序进行冒泡排序)|将参数(数字列表*)中的数字按照升序排序并返回|
|BubbleSortInDecendingOrder(按降序进行冒泡排序)|将参数(数字列表*)中的数字按照降序排序并返回|
|CubeRoot(立方根)|返回参数(任意数字)的立方根|
|GreatestCommonDivisor(最大公约数)|返回两个参数(整数*)最大公约数|
|LeastCommonMultiple(最小公倍数)|返回两个参数(整数*)的最小公倍数|
|Log10|返回参数(任意数字)对于底数10的对数|
|Max(最大数)|返回参数(数字列表*)中最大的数字|
|Min(最小数)|返回参数(数字列表*)中最小的数字|
|Pi(π)|返回圆周率π的近似值|
|Power(求幂)|返回参数num(任意数字)的参数n(整数*)次幂|
|PrimeNumber(判断质数)|如果参数(正整数*)是质数则返回true否则返回false|
|ReciprocalOfTheSquareRoot(平方根倒数)|返回参数(任意数字)的平方根的倒数|
|e|返回常数e|
|hypot(两数平方和的平方根)|返回两个参数(任意数字)的平方和的平方根（常用于勾股定理）|

* 数字列表*  如果数字列表中有非数字列表项，会发生运行错误
* 整数*  如果在这里填入一个小数，会自动向下取整，比如2.5取整为2
* 正整数*  我自己也还没有尝试如果填负数会怎么样，你们可以试一下然后在反馈那里告诉我，嘿嘿
* 过一段时间我会用快速排序替换冒泡排序(目测需要大家帮忙hhh好忙啊)

原网址：[http://aix.colintree.cn/down/MathExtended][ori]



## Extended Math Library
 
Version1.0 Update in Oct.15, 2016

Extend Math Functions of Appinventor! Included: 

|Function Name|Explaination|
|-|-|
|Average|Calculate average of the numbers in the parameter(list of numbers*)|
|BubbleSortInAscendingOrder|Sort the numbers in the parameter(list of numbers*) using Bubble Sort in ascending order|
|BubbleSortInDecendingOrder|Sort the numbers in the parameter(list of numbers*) using Bubble Sort in decending order|
|CubeRoot|Return the cube root of the parameter(any number)|
|GreatestCommonDivisor|Return the Greatest Common Divisor of two parameters(integer*)|
|LeastCommonMultiple|Return the Lesat Common Multiple of two parameters(integer)|
|Log10|Return Log 10,parameter(any number)|
|Max|Return the greatest number in the parameter(list of numbers*)|
|Min|Return the least number in the parameter(lists of numbers*)|
|Pi(π)|Return Pi(π)|
|Power|Return parameter number(any number)^parameter n(integer)|
|PrimeNumber|Return true if parameter(positive integer) is prime number, else return false|
|ReciprocalOfTheSquareRoot|Return the reciprocal of the square root of the parameter(any number)|
|e|Return e|
|hypot|Return √(number1^2+number2^2)|

* list of number*  if there are some items of the list is not number, it will show a runtime error
* integer*  if you fill a decimal number, it will auto turn in to the floor of this number, such as 2.5 turn into 2
* positive integer*  i have not try what will happen when we fill a negative number, you can try and tell me at the feedback
* maybe later i will change bubble sort into quick sort( i m so busy that i need help...)

Original Web Page：[http://aix.colintree.cn/down/MathExtended][ori]
  
  
  [ori]: http://www.source-space.cn/en/down/MathExtended
