# UC-001: Record a Sale

## Description
Allows a Sales Rep to record a new sale with product details.

## Actors
Sales Rep

## Preconditions
User must be logged into the system.

## Main Flow
1. Sales Rep selects "Record Sale"
2. System prompts for Product, Quantity, Customer, Price
3. Sales Rep enters details
4. System calculates total = quantity * price
5. System saves sale and displays confirmation with Sale ID

## Postconditions
New sale is added to the sales list.

## Related Requirement
US-001 in backlog.md
Related Method: `SalesManager.recordSale()`