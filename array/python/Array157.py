```
157
100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와 합계 평균을 출력하는 프로그램을 작성하시오.
평균은 소수점 이하 1자리까지 출력한다.
```
nums = list(map(int, input().split()))
count = sumVal = 0
 
for i in nums:
     
    if i == 0:
        break
    elif i % 5 == 0:
        count += 1
        sumVal += i
 
avg = sumVal / count
 
print("Multiples of 5 :", count)
print("sum :", sumVal)
print("avg :", round(avg, 1))
