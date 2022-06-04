Endpoint that needs to be implemented:
1. /v1/check | POST | payload: username | response: true/false include the calculation (?)
2. /v1/add | POST | payload: username | response: success/ensuring
3. /v1/add-fix | POST | payload: username | response: success/not
4. /v1/update | PUT | payload: username | response: is someone still detected as a buzzer or not

Details:
1. /v1/check. If the name is already exist in database, response with the available information in database. Otherwise, will calculate the information of the inputted username and decide is the user buzzer or not.
2. /v1/add. Will check first is the user already exist in db or not. If not, then calculate the information of the inputted username and if the result is the user isnt a buzzer then response to client "are u serious?"
3. /v1/add-fix. Will automatically add the user as a buzzer to database. This endpoint will automatically called by the client if they click "OK" on the question "are u serious?" before.
4. /v1/update. Will recalculate the information of the inputted user and update the information of database. (i think we need to save the "last_updated" field on  db)

Calculations:
1. Created date tends to new
2. Few follower or if many usually they follow each other as buzzer fellow
3. The tweets tend to lead to something
4. Range between tweet sometimes so wide (because they just tweet on certain times)