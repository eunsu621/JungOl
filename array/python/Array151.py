nums = list(map(int, input().split()))

count = 1
sumVal = 0

for i in nums:
    if count % 2 != 0:
        sumVal += i
    count += 1

print(sumVal)
