# UC-002: View Sales Report

## Description
Allows Business Owner to view total revenue and all sales.

## Actors
Business Owner

## Preconditions
At least one sale must be recorded.

## Main Flow
1. Business Owner selects "View Sales Report"
2. System calculates total revenue
3. System displays list of all sales and total revenue

## Postconditions
Sales data is displayed to user.

## Related Requirement
US-002 in backlog.md
Related Method: `SalesManager.viewSalesReport()`