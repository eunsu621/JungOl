```
553
자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
```
n = int(input())
uni = 65

for i in range(n):
    for j in range(i, n):
        print(chr(uni), end="")
        uni += 1
    print()



```
554
자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
```
n = int(input())
count = 1
uni = 65

for i in range(n):
    for j in range(n+1):
        
        if n-j > i:
            print(count, end=" ")
            count += 1
        else:
            print(chr(uni), end=" ")
            uni += 1
    print()
