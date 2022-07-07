# snowBunnies 
|------------------------|
|User                    |
|------------------------|
|userID                  |
|password                |
|name                    |          
|phoneNumber             |
|email                   |
|billingAddress          |
|delivery                |
|payment                 |
|------------------------|
|changePassword()        |
|changeBillingAddress()  |
|changeDeliveryAddress() |
|changePayment()         |
--------------------------
            |
            |
            |---------------------------|
            |                           |
            V                           V
|------------------------|          |------------------------|    
|Employee                |          |Customer                |  
|------------------------|          |------------------------|  
|                        |          |                        |
|------------------------|          |------------------------|
|                        |          |                        |
--------------------------          --------------------------        
                                                    | 1
                                                    |
|-----------------|                                 |
|Product          |                                 |
|-----------------|                                 |
|name             |                                 |
|productID        |                                 |
|type             |                                 |
|-----------------|                                 |
|addProduct()     |                                 |
|deleteProduct()  |                                 |
------------------                                  |
                                                    | *
                                            |-----------------|
                                            |Cart             |
                                            |-----------------|
                                            |orderID          |
                                            |customerId       |
                                            |total            |      
                                            |-----------------|       
                                            |addProduct()     |
                                            |removeProduct()  |
                                            ------------------

