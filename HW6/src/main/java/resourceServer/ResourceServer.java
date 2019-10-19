package resourceServer;

import resources.TestResource;

public class ResourceServer implements ResourceServerI {
    private TestResource tr;

    public ResourceServer(TestResource tr) {
        this.tr = tr;
    }

    public String getName() {
        return tr.getName();
    }


    public int getAge() {
        return tr.getAge();
    }

    public TestResource getTestResource(){
        return tr;
    }

    public void setTestResource(TestResource tr) {
        this.tr = tr;
    }
}
