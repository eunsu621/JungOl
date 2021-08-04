```
549
자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
```
n = int(input())
count = sum = 0

for i in range(1, n+1):
    if sum >= n:break;
    if (i % 2 != 0):
        sum += i
        count += 1
print(count, sum)


```
634
자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
```
n = int(input())

for i in range(n):
    
    for j in range(i+1):
        print("*", end="")
        
    print()


```
550
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
```
n = int(input())

for i in range(n * 2):
    
    if i < n:
        
        for j in range(n, i, -1):
            print("*", end="")
    else:
        
        for j in range(i-n+1):
            print("*", end="")
    print()
