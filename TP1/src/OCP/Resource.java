package OCP;

public interface Resource
{
    int findFree();

    void markBusy(int resourceId);

    void markFree(int resourceId);
}