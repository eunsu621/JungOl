```
545
10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
```
nums = list(map(int, input().split()))

mul3 = 0
mul5 = 0

for i in nums :
    
    if i % 3 == 0:
        mul3 += 1
        
    if i % 5 == 0:
        mul5 += 1
    
print("Multiples of 3 :", mul3)
print("Multiples of 5 :", mul5)



```
546
10 이하의 과목수 n이 주어진다.
정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 
평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
평균은 반올림하여 소수 첫째자리까지 출력한다.​
```
subCnt = int(input())
scores = list(map(int, input().split()))

sum = 0
avg = 0

for i in scores:
    sum += i

avg = round((sum / subCnt), 1)

print("avg :", avg)

if avg >= 80:
    print("pass")
else:
    print("fail")



```
547
아래와 같이 출력되는 프로그램을 작성하시오.
```
for i in range(2, 7):
    
    for j in range(i, i + 5):
        print(j, end=" ")
    
    print()



```
548
구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​
```
for i in range(2, 5):
    
    for j in range (1, 6):
        result = "{0} * {1} ={2}   ".format(i, j, str(i * j).rjust(3))
        print(result, end="")
    
    print()
