```
558
100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
```

intList = list(map(int, input().split()))

reverseList = intList.reverse()

for i in intList:
    if (i != 0):
        print(i, end=" ")
