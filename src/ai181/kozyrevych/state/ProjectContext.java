package ai181.kozyrevych.state;

public class ProjectContext {
    private ProjectState projectState;

    public void setProjectState(ProjectState projectState) {
        this.projectState = projectState;
    }

    public void workOnProject() {
        projectState.workOnProject(this);
    }
}
