```
562
10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
평균은 반올림하여 소수첫째자리까지 출력한다.
```
nums = list(map(int, input().split()))

count = 1
oddSum = evenSum = 0

for i in nums:
    
    if (count % 2 == 0):
        evenSum += i
    else:
        oddSum += i
        
    count += 1

avg = oddSum / 5

print("sum :", evenSum)
print("avg :", avg)   
