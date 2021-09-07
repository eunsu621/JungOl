```
159
20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
```
n = int(input())
scores = list(map(int, input().split()))

scores.sort(reverse=True);

for i in scores:
    print(i)
