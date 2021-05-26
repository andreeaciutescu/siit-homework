package Hw3;

public class Album extends Book {
    private boolean paperQuality;

    public Album(String name, int nrOfPages, boolean paperQuality) {
        super(name, nrOfPages);
        this.paperQuality = paperQuality;
    }

    public boolean isPaperQuality() {
        return paperQuality;
    }

    @Override
    public void delete() {
        System.out.println("I deleted the album with name: " + getName());
    }

    @Override
    public void add() {
        super.add();
    }

    @Override
    public String toString() {
        return "Album: " + getName() + ", pages: " + getNrOfPages() + ", paperQuality: " + paperQuality;
    }
}
