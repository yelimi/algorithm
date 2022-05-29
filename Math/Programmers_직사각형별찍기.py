#입력받기
a, b = map(int, input().strip().split(' '))   #입력받은 값의 왼쪽, 오른쪽 공백을 제거하고 공백을 기준으로 분리

#출력
for n in range(0, b, 1) :
    for m in range(0, a, 1) :
        print('*', end='')  #end에 ''를 지정하여 줄바꿈을 하지 않음
    print('')  #'' 지정하여 줄바꿈
