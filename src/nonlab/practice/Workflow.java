package nonlab.practice;

public enum Workflow {
	HCM_EXTRACT("HCM_EXTRACT", "ux-hcm-extract"),
    PEGASUS_EXTRACT("PEGASUS_EXTRACT", "ux-pegasus-worker");

    private final String name;
    private final String workflowSchedulerService;

    Workflow(String name, String workflowSchedulerService) {
        this.name = name;
        this.workflowSchedulerService = workflowSchedulerService;
    }

    public static Workflow getWorkflowByName(String name) {
        for (Workflow wf : Workflow.values()) {
            if (wf.name.equals(name)) {
                return wf;
            }
        }
        return null;
    }

    public static String getWorkflowSchedulerServiceByName(String name) {
        for (Workflow wf : Workflow.values()) {
            if (wf.name.equals(name)) {
                return wf.workflowSchedulerService;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getWorkflowSchedulerService() {
        return this.workflowSchedulerService;
    }
}
