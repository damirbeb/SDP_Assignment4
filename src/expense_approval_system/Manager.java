package expense_approval_system;

public class Manager extends Approver {
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved the request.");
        } else {
            if (nextApprover != null) {
                nextApprover.approveRequest(request);
            } else {
                System.out.println("Request could not be approved.");
            }
        }
    }
}