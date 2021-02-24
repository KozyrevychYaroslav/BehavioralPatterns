package ai181.kozyrevych.state;

public class Design implements ProjectState {

    @Override
    public void workOnProject(ProjectContext projectContext) {
        System.out.println("Design");
        projectContext.setProjectState(new Development());
    }
}
