SELECT 
    HISTORY_ID,
    CAR_ID,
    DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE,
    DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE, 
    CASE 
        WHEN TIMESTAMPDIFF(DAY, START_DATE, END_DATE) + 1 >= 30 
        THEN '장기 대여' 
        ELSE '단기 대여' 
    END AS RENT_TYPE 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE >= '2022-09-01' AND START_DATE < '2022-10-01'
ORDER BY HISTORY_ID DESC;
