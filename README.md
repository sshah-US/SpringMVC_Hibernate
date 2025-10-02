<h2> Project Structure</h2>
    <img width="443" height="571" alt="image" src="https://github.com/user-attachments/assets/bd9f5423-6f2c-442e-aea9-2dabf70d55ab" />
    <img width="348" height="593" alt="image" src="https://github.com/user-attachments/assets/a1608c1e-3f11-4e61-ae5c-c8cb990c80e7" />
Client (Browser)
        │
        ▼
 ┌───────────────────────┐
 │ web.xml (Dispatcher)  │
 └───────────────────────┘
        │
        ▼
 ┌────────────────────────────────────┐
 │ registration-servlet.xml           │
 │ (HandlerMapping, ViewResolver)     │
 └────────────────────────────────────┘
        │
        ▼
 ┌────────────────────────────────────┐
 │ Controllers                        │
 │  - BankInfoController              │
 │  - ContactInfoController           │
 │  - PersonalInfoController          │
 └────────────────────────────────────┘
        │
        ▼
 ┌──────────────────────────────┐
 │ Service Layer (AllInfoService) │
 └──────────────────────────────┘
        │
        ▼
 ┌──────────────────────────────┐
 │ DAO Layer (AllInfoDAO)       │
 │ uses Hibernate SessionFactory │
 └──────────────────────────────┘
        │
        ▼
 ┌──────────────────────────────┐
 │ Hibernate Config              │
 │ (applicationContext.xml)      │
 └──────────────────────────────┘
        │
        ▼
 Database (MySQL/Oracle/etc.)

  ┌──────────────────────┐   ┌──────────────────────┐
  │ Interceptors         │   │ JSP Views            │
  │ (Logging, StepFlow)  │   │ (BankInfo.jsp, etc.) │
  └──────────────────────┘   └──────────────────────┘
