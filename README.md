# snowBunnies 
|------------------------|
|User                    |
|------------------------|
|userID                  |
|password                |
|firstName               |
|lastName                |
|userType                |
|email                   |
|isEmployee              |
|------------------------|
|updatePassword()        |
|updateFirstName()       | 
|updateLastName()        |
-------------------------
            |
            |        isEmployee
            |---------------------------|
            |                           |
            V                           V
|------------------------|          |------------------------|    
|Employee                |          |Customer                |  
|------------------------|          |------------------------|  
|                        |          |                        |
|------------------------|          |------------------------|
| processProduct()       |          | returnProduct()        |
--------------------------          --------------------------     

|------------------------|
|Invoice                 |
|------------------------|
|invoiceID               |
|userID                  |
|cartID                  |
|phoneNumber             |
|billingDetailID         |
|deliveryDetailID        | 
|paymentDetailID         |
|------------------------|
|updatePhoneNumber()     |
-------------------------

|------------------------|
|paymentDetail           |
|------------------------|
|paymentDetailID         |
|cardNumber              |
|cvv                     |
|cardType                |
|cardExpiration          |
|cardServiceProvider     |
|------------------------|
|                        |
-------------------------

|------------------------|
|deliveryDetail          |
|------------------------|
|deliveryDetailID        |
|streetAddress           |
|streetAddressTwo        |
|state                   |
|country                 |
|zipcode                 |
|city                    |
|------------------------|
|updateDeliveryAddress() |
-------------------------

|------------------------|
|billingDetail           |
|------------------------|
|deliveryDetailID        |
|streetAddress           |
|streetAddressTwo        |
|state                   |
|country                 |
|zipcode                 |
|city                    |
|------------------------|
|updateBillingAddress()  |
-------------------------

|-----------------|
|Product          |
|-----------------|
|name             |
|productID        |
|type             |  
|-----------------|
|addProduct()     |
|updateProduct()  |
|deleteProduct()  |
------------------

|-----------------|
|Cart             |
|-----------------|
|cartID           |
|userID           |
|totalCost        |
|purchaseDate     |
|-----------------|       
|addCart()        |
|removeCart()     |
------------------

|-------------------|
|CartProduct        |
|-------------------|
|cartID             |
|productID          |    
|-------------------|       
|addCartProduct()   |
|removeCartProduct()|
--------------------
