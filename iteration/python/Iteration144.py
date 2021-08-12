```
144
자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
```

n = int(input())

for i in range(1, n+1):
    for j in range(1, (n-i)*2+1):
        print(" ", end="")
    for j in range (1, i*2):
        print("*", end="")
    print()
