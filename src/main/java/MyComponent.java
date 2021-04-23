import org.springframework.beans.factory.annotation.Autowired;

public class MyComponent {
    private final MyCollaborator collaborator;

    public MyComponent(MyCollaborator collaborator) {
        this.collaborator = collaborator;
    }
    public void myBusinessMethod() {
        collaborator.doSomething();
    }
}
