```
563
10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
```

nums = list(map(int, input().split()))

sortedNum = sorted(nums)
revSrtNum = reversed(sortedNum)

for i in revSrtNum:
    print(i, end=" ")
