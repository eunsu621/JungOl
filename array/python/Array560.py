```
560
10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
```
nums = list(map(int, input().split()))

min = nums[0]

for i in nums:
    
    if i < min:
        min = i
        
print(min)
