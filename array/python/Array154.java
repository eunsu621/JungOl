```
154
6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
출력은 반올림하여 소수 첫째자리까지로 한다.
```
weightArr = list(map(float, input().split()))
sum = avt = 0

for i in weightArr:
    sum += i

avg = sum / 6
print(round(avg, 1))
