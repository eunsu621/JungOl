```
134
10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
```
nums = list(map(int, input().split()))

evenC = oddC = 0

for i in nums:
    
    if i % 2 == 0:
        evenC += 1
    else:
        oddC += 1

print("even :", evenC)
print("odd :", oddC)



```
135
두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
```
n1, n2 = map(int, input().split())

mn = min(n1, n2)
mx = max(n1, n2)

sum = cnt = 0

for i in range (mn, mx+1):
    
    if i % 3 == 0 or i % 5 == 0:
        sum += i
        cnt += 1
        
avg = sum / cnt

print("sum :", sum)
print("avg :", round(avg, 1))


```
136
한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
```
n = int(input())

for i in range(n, n*10+1, n):
    print(i, end=" ")
