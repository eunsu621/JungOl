import math

n = list(map(int, input().split()))

count = sum = avg = 0

for i in n:
    if i == 0:
        break;
    else:
        sum += i
        count +=1
    
avg = math.floor(sum / count);

print(sum, avg)
