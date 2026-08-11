# UC-003: Apply Discount to Sale

## Description
Allows Sales Rep to apply percentage discount to an existing sale.

## Actors
Sales Rep

## Preconditions
Sale must exist in the system.

## Main Flow
1. Sales Rep selects "Apply Discount"
2. System prompts for Sale ID and Discount %
3. Sales Rep enters details
4. System reduces sale amount by discount %
5. System displays new amount

## Postconditions
Sale amount is updated.

## Related Requirement
US-003 in backlog.md
Related Method: `SalesManager.applyDiscount()`