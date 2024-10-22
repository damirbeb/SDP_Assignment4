package expense_approval_system;

public class Director extends Approver {
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Director approved the request.");
        } else {
            if (nextApprover != null) {
                nextApprover.approveRequest(request);
            } else {
                System.out.println("Request could not be approved.");
            }
        }
    }
}