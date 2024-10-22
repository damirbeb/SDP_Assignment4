package expense_approval_system;

public class CEO extends Approver {
    public void approveRequest(ExpenseRequest request) {
        System.out.println("CEO approved the request.");
    }
}