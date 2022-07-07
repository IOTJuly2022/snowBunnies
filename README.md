# snowBunnies 
|------------------------|
|User                    |
|------------------------|
|userID                  |
|password                |
|firstName               | *first name and last name need to be seperated into different fields
|lastName                |
|email                   | *guessing email will be pk?
|------------------------|
|updatePassword()        | *nit
|updateFirstName()       | 
|updateLastName()        | *not sure if we want to update one at a time, or both at the same time?
-------------------------

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
|userID                  | *should only keep this if we want to save payment information
|cardNumber              |
|cvc                     |
|cardType                |
|cardExpiration          |
|cardBusinessType        | *like mastercard or visa.
|------------------------|
|                        | *don't think we need to have an update here since no refunds.
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
|type             | *how would we use this?   
|-----------------|
|addProduct()     |
|updateProduct()  | *in case of product name change but still needs same id.
|deleteProduct()  |
------------------

|-----------------|
|Cart             |
|-----------------|
|cartID           | *nit change
|userID           | *nit change
|total            |
|date             | *easy look up for a user if we want to keep/inplement this feature. 
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
|addCartProduct()   | *probably have to changes these
|removeCartProduct()|
------------------

