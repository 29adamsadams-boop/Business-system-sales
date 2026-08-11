# UC-004: Search Sale by Customer Name

## Description
Allows Business Owner to find all sales for a specific customer.

## Actors
Business Owner

## Preconditions
Sales data exists in the system.

## Main Flow
1. Business Owner selects "Search by Customer"
2. System prompts for Customer Name
3. Business Owner enters name
4. System displays all sales matching that customer

## Postconditions
Customer's purchase history is displayed.

## Related Requirement
US-004 in backlog.md
Related Method: `SalesManager.searchByCustomer()`