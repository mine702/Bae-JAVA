
SELECT ROUND( 
    (SELECT SUM( IF ( LENGTH IS NULL, 10 , LENGTH) ) FROM FISH_INFO) / COUNT(*) , 2) 
AVERAGE_LENGTH
FROM FISH_INFO

