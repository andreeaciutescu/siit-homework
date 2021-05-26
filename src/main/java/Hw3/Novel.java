package Hw3;

public class Novel extends Book{
    private String type;

    public Novel(String name, int nrOfPages, String type) {
        super(name, nrOfPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void delete() {
        System.out.println("I deleted the novel with name: " + getName());
    }

    @Override
    public void add() {
        super.add();
    }

    @Override
    public String toString() {
        return "Novel: " + getName() + ", pages: " + getNrOfPages() + ", type: " + type;
    }
}
