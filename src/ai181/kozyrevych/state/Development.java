package ai181.kozyrevych.state;

public class Development implements ProjectState {
    private int i = 0;

    @Override
    public void workOnProject(ProjectContext projectContext) {
        System.out.println("Development");
        if (++i == 3) {
            projectContext.setProjectState(new Testing());
        }
    }
}
