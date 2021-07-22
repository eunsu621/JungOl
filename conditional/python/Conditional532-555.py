# 532 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
x, y = map(float, input().split())
if x >= 4.0 and y >= 4.0:
    print('A')
elif x >= 3.0 and y >= 3.0:
     print('B')
else :
     print('C')


# 533 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
# 성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
sex, age = input().split()
age = int(age)
if sex == "M" and age >= 18:
    print("MAN")
elif sex == "F" and age >= 18:
    print("WOMAN")
elif sex == "M" and age < 18:
    print("BOY")
elif sex == "F" and age <= 18:
    print("GIRL")


# 534 영문 대문자를 입력받아 
# 'A'이면 “Excellent”, 
# 'B'이면 “Good”, 
# 'C'이면 “Usually”, 
# 'D'이면 “Effort”, 
# 'F'이면 “Failure”, 
# 그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
alphabet = input()
if alphabet == 'A':
    print("Excellent")
elif alphabet == 'B':
    print("Good")
elif alphabet == 'C':
    print("Usually")
elif alphabet == 'D':
    print("Effort")
elif alphabet == 'F':
    print("Failure")
else :
    print("error")


# 535 4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
# (C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용)
# 단 입력는 0이상 4.5 이하이다.
# 4.0 이상 : "scholarship"
# 3.0 이상 : "next semester"
# 2.0 이상 : "seasonal semester"
# 2.0 미만 : "retake"​
# >> 실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))
score = float(input())
score = int(score)
if score >= 4:
    print("scholarship")
elif score >= 3:
    print("next semester")
elif score >= 2:
    print("seasonal semester")
elif score < 2:
    print("retake")
