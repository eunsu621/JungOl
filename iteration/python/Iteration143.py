```
143
자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
```


n = int(input())

for i in range(0, n-1):
    
    # 역사다리
    for j in range(i):
        print(" ", end="")
    
    for j in range(1, (n-1)*2+2-(i*2),):
        print("*", end="");
    print()
    
# 삼각형
for i in range(n):
    for j in range(n-i-1):
        print(" ", end="")
    for j in range(i*2+1):
        print("*", end="")  
    print()
