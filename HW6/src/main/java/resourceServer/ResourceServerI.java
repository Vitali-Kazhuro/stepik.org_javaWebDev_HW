package resourceServer;

import resources.TestResource;

public interface ResourceServerI {

    String getName();

    int getAge();

    void setTestResource(TestResource tr);

}
