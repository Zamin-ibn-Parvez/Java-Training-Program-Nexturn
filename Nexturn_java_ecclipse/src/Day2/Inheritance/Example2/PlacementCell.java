package Day2.Inheritance.Example2;

public class PlacementCell extends Examination{
    protected int interviewsAttended ;
    protected boolean selected;

    public PlacementCell(int regNo, String stdName, String group, int sub1, int sub2, int sub3, int interviewsAttended, boolean selected) {
        super(regNo, stdName, group, sub1, sub2, sub3);
        this.interviewsAttended = interviewsAttended;
        this.selected = selected;
    }

    public PlacementCell(int interviewsAttended, boolean selected){
        this.interviewsAttended= interviewsAttended;
        this.selected = selected;
    }



    public static void main(String[] args) {
        PlacementCell placementCell = new PlacementCell(67,"Zamin","IT",65,45,56,7,false);

        System.out.println(placementCell.stdName+" "+placementCell.regNo+" "+placementCell.group);
        placementCell.displayAverageMarks();
        placementCell.displayTotalMarks();
        placementCell.displayResult();



    }
}

