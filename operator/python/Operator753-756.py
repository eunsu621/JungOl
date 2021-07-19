# 753 오빠와 여동생의 바둑 급수를 입력받아(입력시에 물어보는 문장이 있음에 주의한다), 오빠와 여동생의 바둑 급수가 다르면 True, 같으면 False를 출력하는 프로그램을 작성하시오.
Brother = int(input('Brother? '))
Sister = int(input('Sister? '))
if Brother == Sister:
    print(False)
else:
    print(True)

#754 민수의 키, 민수의 몸무게, 기영이의 키, 기영이의 몸무게를 순서대로 입력받아 민수가 키도 크고 몸무게도 크면 True, 그렇지 않으면 False를출력하는 프로그램을 작성하시오.
mHight = int(input())
mWeight = int(input())
gHeight = int(input())
gWeight = int(input())

if (mHight > gHeight) and (mWeight > gWeight):
    print(True)
else:
    print(False)

# 755 두 이름을 입력받아, 첫 줄에는 띄어쓰기를 넣어서 'and'라는 문자열로 구분하고, 둘째 줄에는 띄어쓰기 없이 '&'를 넣어서 출력 예와 같은 문장처럼 출력하는 프로그램을 작성하시오.​​
name1 = input()
name2 = input()
print(name1, 'and', name2)
print(name1 + '&'+ name2)

# 756 두 개의 문자열과 한 개의 정수를 입력 받아서, 뒤의 문자열을 입력받은 수만큼, 연속해서 출력하고, 앞의 문자열을 이어서 출력하는 프로그램을 작성하시오.
str1 = input()
str2 = input()
num = int(input())
for i in range(num) :
    print(str2, end='')
print(str1)
