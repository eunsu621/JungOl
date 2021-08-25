```
561
10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
```

nums = list(map(int, input().split()))
minVal = 9999
maxVal = 0

for i in nums:
    if (maxVal < i < 100):
        maxVal = i
    elif (100 <= i < minVal):
        minVal = i
        
if (maxVal == 0):
    maxVal = 100
elif (minVal == 9999):
    minVal = 100
        
print(maxVal, minVal)
