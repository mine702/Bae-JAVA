SELECT ITI.ITEM_ID, ITI.ITEM_NAME
FROM ITEM_INFO ITI
WHERE ITI.ITEM_ID IN (
    SELECT ITT.ITEM_ID
    FROM ITEM_TREE ITT
    WHERE ITT.PARENT_ITEM_ID IS NULL
)
ORDER BY ITI.ITEM_ID ASC