```
139
2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
구구단 사이의 공백은 3칸이다.
```
n1, n2 = map(int, input().split())

for i in range (1, 10):
   
    if n1 > n2:
        
        for j in range(n1, n2-1, -1):
            print("{0} * {1} = {2}   ".format(j, i, str(j*i).rjust(2)), end="")
    else:
        
         for j in range(n1, n2+1):
            print("{0} * {1} ={2}   ".format(j, i, str(j*i).rjust(3)), end="")

    print()
