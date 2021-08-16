```
149
자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
10 미만의 홀수만 출력하시오.
주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
```

n = int(input())

count = 1

for i in range(n):
    
    for j in range(n):
        
        print(count, end=" ")
        
        if count == 9:
            count = 1
        else:
            count += 2
            
    print()
