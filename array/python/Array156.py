```
156
세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.입력받는 정수는 100개 이하이다.
```
nums = list(map(int, input().split()))

nums.pop()
    
print('max :', max(nums))
print('min :', min(nums))
