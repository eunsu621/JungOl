```
142
자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
```

n = int(input())

for i in range (n*2-1):
    
    if i < n:
        for j in range(i+1):
            print("*", end="")
    else:
        for j in range(1, n*2-i):
            print("*", end="")
    print()
