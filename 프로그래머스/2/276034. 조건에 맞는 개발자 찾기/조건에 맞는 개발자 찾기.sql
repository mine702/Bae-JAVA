SELECT DE.ID, DE.EMAIL, DE.FIRST_NAME, DE.LAST_NAME
FROM DEVELOPERS DE
WHERE (DE.SKILL_CODE & (SELECT SK.CODE FROM SKILLCODES SK WHERE SK.NAME = 'Python')) > 0
   OR (DE.SKILL_CODE & (SELECT SK.CODE FROM SKILLCODES SK WHERE SK.NAME = 'C#')) > 0
ORDER BY DE.ID ASC;
