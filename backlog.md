# Sales Backlog - Business System

## User Stories

### US-001: Record a Sale
**As a** Sales Rep  
**I want to** record a new sale with product, quantity, and customer  
**So that** the business can track revenue  
**Use-Case Link**: [docs/use-cases/uc-001-Recordsale.md](./docs/use-cases/uc-001-Recordsale.md)

**Acceptance Criteria:**
Given I am logged in as a Sales Rep
When I enter product "Laptop", quantity "2", customer "Musa" and click "Save"
Then the sale should be recorded and total revenue should increase

**MoSCoW**: Must Have

---

### US-002: View Sales Report
**As a** Business Owner  
**I want to** view a daily/weekly sales report  
**So that** I can see total sales and top products  
**Use-Case Link**: [docs/use-cases/uc-002-viewReport.md](./docs/use-cases/uc-002-viewReport.md)

**Acceptance Criteria:**
Given there are 5 recorded sales today
When I open the "Sales Report" page
Then I should see total revenue and a list of all 5 sales

**MoSCoW**: Must Have

---

### US-003: Apply Discount to Sale
**As a** Sales Rep  
**I want to** apply a percentage discount to a sale  
**So that** I can give customers promotions  
**Use-Case Link**: [docs/use-cases/uc-003-ApplyDiscount.md](./docs/use-cases/uc-003-ApplyDiscount.md)

**Acceptance Criteria:**
Given a sale of $1000
When I apply a 10% discount
Then the final sale amount should be $900

**MoSCoW**: Should Have

---

### US-004: Search Sale by Customer Name
**As a** Business Owner  
**I want to** search sales by customer name  
**So that** I can find a specific customer's purchase history  
**Use-Case Link**: [docs/use-cases/uc-004-SearchSale.md](./docs/use-cases/uc-004-SearchSale.md)

**Acceptance Criteria:**
Given customer "Aisha" has 3 sales
When I search "Aisha"
Then I should see all 3 sales for Aisha

**MoSCoW**: Could Have

---

### US-005: Export Sales to PDF
**As a** Business Owner  
**I want to** export the sales report to PDF  
**So that** I can send it to the accountant  
**Use-Case Link**: [docs/use-cases/uc-005-ExportPDF.md](./docs/use-cases/uc-005-ExportPDF.md)

**Acceptance Criteria:**
Given I have a weekly sales report open
When I click "Export PDF"
Then a PDF file should be downloaded

**MoSCoW**: Won't Have - For v1.0