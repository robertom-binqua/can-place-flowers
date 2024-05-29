### Can place flowers ###

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length

org.binqua.examples.canplaceflowers.SolutionSpec:
+ we can plant 1 seed into 0 0.003s
+ we cannot plant 1 seed into 1 0.001s
+ we can plant 1 seed into 00 0.0s
+ we cannot plant 2 seeds into 00 0.0s
+ we cannot plant 2 seeds into 01 or 10 0.0s
+ we can plant 1 seed into 000 0.0s
+ we can plant 1 seed into 100 0.0s
+ we can plant 1 seed into 001 0.0s
+ we cannot plant 1 seed into 010 0.001s
+ we can plant 2 seeds into 000 0.0s
+ we cannot plant 3 seeds into 000 0.0s
+ we cannot plant 4 seeds into 000 0.0s
+ we cannot plant 1 seed into 111 0.0s
+ we cannot plant 1 seed into 0111 0.0s
+ we cannot plant 1 seed into 0101 0.0s
+ we can plant 1 seed into 0011 0.0s
+ we can plant 2 seeds into 0000 0.0s
+ we can plant 2 seeds into 0011 0.0s
+ we cannot plant 1 seed into 1 0 0 1 0.001s
+ we can plant 1 seeds into 1 0 0 0 1 0.0s
+ we can plant 1 seed into 1 0 0 0 0 1 => 1 0 1 0 0 1 0.0s
+ we can plant 2 seeds into 1 0 0 0 0 0 1 => 1 0 1 0 1 0 1 0.0s
+ we can plant 1 seed into 1 0 0 0 0 0  => 1 0 1 0 0 0 0.0s
+ we can plant 2 seeds into 1 0 0 0 0 0  => 1 0 1 0 1 0 0.0s
+ we cannot plant 1 seed into 1-1 0.0s
+ we can plant 1 seed into 10001 0.003s
+ we cannot plant 2 seeds into 10001 0.001s