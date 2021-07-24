# 123 1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
# 해당 번호가 없으면 "I don't know."라고 출력한다.
# 개-dog
# 고양이-cat
# 병아리-chick​ 
x = int(input("Number? "))
if x == 1:
    print("dog")
elif x == 2:
    print("cat")
elif x == 3:
    print("chick")
else:
    print("I don't know.")


#124 1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
month = int(input())
if month <= 7:
    if month == 2:
        print(28)
    elif month % 2 == 0:
        print(30)
    else:
        print(31)
else:
    if month % 2 == 0:
        print(31)
    else:
        print(30)        
