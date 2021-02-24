package ai181.kozyrevych.state;

public class Testing implements ProjectState {
    @Override
    public void workOnProject(ProjectContext projectContext) {
        System.out.println("Testing");
        projectContext.setProjectState(new TechnicalSupport());
    }
}
