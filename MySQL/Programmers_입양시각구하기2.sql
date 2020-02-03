-- 코드를 입력하세요
-- SET문에서는 할당 연산자로 = 또는 := 모두 사용 가능. SET 문이 아닌 다른 것으로도 사용자 정의 변수 값 할당 가능. 이 경우에는, 할당 연산자는 = 가 아닌 := 가 되어야. 비-SET 명령문에서는 =가 비교 연산자로 취급.
SET @hour = -1;
SELECT  @hour := @hour + 1 AS HOUR,
                (
                    SELECT COUNT(*)
                    FROM ANIMAL_OUTS
                    WHERE HOUR(DATETIME) = @hour
                 )AS COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23;
