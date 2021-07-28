```
128
0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
```
x = list(map(int, input().split()))

count = 0

for i in x:
    
    if i == 0:
        break
    elif i % 3 != 0 and i % 5 != 0:
        count = count + 1

print(count)
