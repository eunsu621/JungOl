```
553
자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
```

n = int(input())
uni = 65

for i in range(0, n):
    for j in range(i, n):
        print(chr(uni), end="")
        uni += 1
    print()
