```
557
10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
```

strList = list(map(str, input().split()))
count = 1

for i in strList:
    
    if count == 1 or count == 4 or count == 7:
        print(i)
        
    count += 1
