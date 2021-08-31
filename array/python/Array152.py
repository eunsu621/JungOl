```
152
10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
```
nums = list(map(int, input().split()))
oddSum = evenSum = 0
count = 1

for i in nums:
    if count % 2 != 0:
        oddSum += i
    else:
        evenSum += i
    count += 1

print("odd :", oddSum)
print("even :", evenSum)
