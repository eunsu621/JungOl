```
150
10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
```
strs = list(map(str, input().split()))

revStr = reversed(strs)

for i in revStr:
    print(i, end=" ")
