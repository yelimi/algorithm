-- 코드를 입력하세요
SELECT NAME, COUNT(*) FROM ANIMAL_INS GROUP BY NAME HAVING COUNT(NAME) >= 2 ORDER BY NAME;
