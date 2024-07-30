


select count(*) AS COUNT
from ECOLI_DATA
where  
LPAD(RIGHT( conv( GENOTYPE, 10, 2) ,3 ),3,0) = 101 OR 
LPAD(RIGHT( conv( GENOTYPE, 10, 2) ,3 ),3,0) = 100 OR
LPAD(RIGHT( conv( GENOTYPE, 10, 2) ,3 ),3,0) = 001;
