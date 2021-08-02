```
137
행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
```

n1, n2 = map(int, input().split())

for i in range(1, n1+1):

    for j in range(i, i*n2+1, i):
        
        print(j, end=" ")
    
    print()


```
138
정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
* 주의 
 ')'와 '('사이에 공백이 1칸 있다.
(1,_1) 처럼 출력한다 : '_'는 공백
```
n = int(input())
for i in range(1, n+1):
    
    for j in range(1, n+1):
        print("({0}, {1}) ".format(i, j), end="")
        
    print()

