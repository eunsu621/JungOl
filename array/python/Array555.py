```
555
문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
```

strList = list(map(str, input().split()))

for i in strList:
    print(i, end="")
