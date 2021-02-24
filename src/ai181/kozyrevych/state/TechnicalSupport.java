package ai181.kozyrevych.state;

public class TechnicalSupport implements ProjectState {
    @Override
    public void workOnProject(ProjectContext projectContext) {
        System.out.println("Technical support");
        projectContext.setProjectState(new RequirementsAnalysis());
    }
}
