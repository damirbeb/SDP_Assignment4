package expense_approval_system;

public class Main {
    public static void main(String[] args) {
        ApprovalChain chain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(800, "Conference attendance");
        ExpenseRequest request2 = new ExpenseRequest(3000, "New equipment");
        ExpenseRequest request3 = new ExpenseRequest(8000, "Marketing campaign");

        chain.processRequest(request1);
        chain.processRequest(request2);
        chain.processRequest(request3);
    }
}