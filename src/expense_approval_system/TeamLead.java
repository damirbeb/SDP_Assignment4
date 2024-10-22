package expense_approval_system;

public class TeamLead extends Approver {
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Team Lead approved the request.");
        } else {
            if (nextApprover != null) {
                nextApprover.approveRequest(request);
            } else {
                System.out.println("Request could not be approved.");
            }
        }
    }
}