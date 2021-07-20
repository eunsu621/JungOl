# 528 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
x = int(input())
print(x)
if (x < 0):
    print("minus")


# 529 “몸무게+100-키”를 비만수치 공식이라고 하자.
# 키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 비만수치가 0보다 크면 다음줄에 비만("Obesity")이라는 메시지를 출력하는 프로그램을 작성하시오. (출력형식은 아래 출력 예를 참고하세요.)
height, weight = map(int, input().split())
level = weight + 100 - height
print(level)
if (level > 0) :
    print("Obesity")


# 530 나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
age = int(input())
if (age >= 20) :
    print("adult")
else :
    print(20 - age,"years later")


# 531 복싱체급은 몸무게가 
# 50.80kg 이하를 Flyweight, 
# 61.23kg 이하를 Lightweight, 
# 72.57kg 이하를 Middleweight, 
# 88.45kg 이하를 Cruiserweight, 
# 88.45kg 초과를 Heavyweight
# 라고 하자.
# 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
weight = float(input())
if (weight <= 50.80) :
    print("Flyweight")
elif (weight <= 61.23):
     print("Lightweight")
elif (weight <= 72.57):
     print("Middleweight")
elif (weight <= 88.45):
     print("Cruiserweight")
elif (weight > 88.45) :
    print("Heavyweight")
