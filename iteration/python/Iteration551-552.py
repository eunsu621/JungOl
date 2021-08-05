```
551
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
```
n = int(input())

for i in range(0, n):
    
    for j in range(i):
         print(" ", end="")
         
    for j in range(i, n):
        print("*", end="")
        
    print()


```
552
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
```
n = int(input())

for i in range(0, n):
    for j in range(i):
        print(" ", end="")
    for j in range(i*2, n*2-1):
        print("*", end="")
    print()
