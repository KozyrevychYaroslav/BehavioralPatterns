package ai181.kozyrevych.state;

public class RequirementsAnalysis implements ProjectState {

    @Override
    public void workOnProject(ProjectContext projectContext) {
        System.out.println("Requirements analysis");
        projectContext.setProjectState(new Design());
    }
}
