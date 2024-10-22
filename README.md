## Design Patterns Implementation

**Project Structure:**

```
design_patterns
├── strategy_pattern_payment_system
│   ├── PaymentStrategy.java
│   ├── CreditCardPayment.java
│   ├── PayPalPayment.java
│   ├── CryptoPayment.java
│   ├── ShoppingCart.java
│   └── Main.java
├── weather_monitoring_system
│   ├── WeatherDisplay.java
│   ├── CurrentConditionsDisplay.java
│   ├── StatisticsDisplay.java
│   ├── ForecastDisplay.java
│   ├── WeatherStation.java
│   └── Main.java
├── smart_home_remote_control
│   ├── Command.java
│   ├── TurnTVOn.java
│   ├── SetVolume.java
│   ├── DimLights.java
│   ├── TV.java
│   ├── Stereo.java
│   ├── Light.java
│   ├── RemoteControl.java
│   └── Main.java
├── order_processing_system
│   ├── State.java
│   ├── NewState.java
│   ├── PaidState.java
│   ├── ShippedState.java
│   ├── DeliveredState.java
│   ├── CancelledState.java
│   ├── Order.java
│   └── Main.java
├── expense_approval_system
│   ├── Approver.java
│   ├── TeamLead.java
│   ├── Manager.java
│   ├── Director.java
│   ├── CEO.java
│   ├── ExpenseRequest.java
│   ├── ApprovalChain.java
│   └── Main.java
├── chat_room_application
│   ├── ChatMediator.java
│   ├── ChatRoom.java
│   ├── User.java
│   ├── RegularUser.java
│   ├── PremiumUser.java
│   └── Main.java
├── document_version_control_system
│   ├── Document.java
│   ├── DocumentVersion.java
│   ├── VersionControl.java
│   └── Main.java
├── shape_area_calculator
│   ├── Shape.java
│   ├── Circle.java
│   ├── Rectangle.java
│   ├── Triangle.java
│   ├── Visitor.java
│   ├── AreaCalculator.java
│   ├── Drawing.java
│   └── Main.java
├── pattern_report_generation_system
│   ├── ReportGenerator.java
│   ├── PDFReportGenerator.java
│   ├── HTMLReportGenerator.java
│   ├── PlainTextReportGenerator.java
│   ├── ReportingSystem.java
│   └── Main.java
└── playlist_management_system
    ├── Song.java
    ├── Playlist.java
    ├── Iterator.java
    ├── SequentialIterator.java
    ├── ShuffleIterator.java
    ├── GenreFilterIterator.java
    └── Main.java
```

**Design Patterns and Use Cases:**

1. **Strategy Pattern:** Payment processing system with multiple payment methods (Credit Card, PayPal, Cryptocurrency).
2. **Observer Pattern:** Weather monitoring system with multiple displays updating based on weather station data.
3. **Command Pattern:** Remote control for smart home devices using various commands (TurnTVOn, SetVolume, DimLights).
4. **State Pattern:** Order processing system that changes behavior based on the order's current state (New, Paid, Shipped, Delivered, Cancelled).
5. **Chain of Responsibility Pattern:** Expense approval system with multiple approvers.
6. **Mediator Pattern:** Chat room application with multiple users.
7. **Memento Pattern:** Document version control system.
8. **Visitor Pattern:** Shape area calculator.
9. **Template Method Pattern:** Report generation system with different report formats.
10. **Iterator Pattern:** Playlist management system with various iterators for traversing songs (Sequential, Shuffle, Genre Filter).

**Usage:**

1. Clone this repository.
2. Import the desired package into your IDE.
3. Run the `Main` class in the corresponding package to execute the example code.
