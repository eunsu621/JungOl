```
148
자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
```

n = int(input())

for i in range(1, n+1):
    
    for j in range(i):
        print("#", end=" ")
        
    print()
    
    
for i in range(1, n) :
    
    for j in range(i*2):
        print(" ", end="")
        
    for j in range(n-i):
        print("#", end=" ")
        
    print()
