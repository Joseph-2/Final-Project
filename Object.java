import java.util.InputMismatchException;
public class Object {
    private int length;
    private int width;

    public Object(int recLen, int recWid){
        length = recLen;
        width = recWid;

        if (recLen == recWid){
            throw new InputMismatchException("That's a square!");
        }

        else if (recLen <= 0 || recWid <= 0){
            throw new InputMismatchException("Ah yes, a negative rectangle! Try again genius.");
        }
    }

    public int getLength(){return length;}
    public int getWidth(){return width;}

    public void changeLength(int length){this.length = length;}
    public void changeWidth(int width){this.width = width;}

    public String drawRec(){
        StringBuilder row = new StringBuilder();
        row.append("#  ".repeat(Math.max(0, width)));
        StringBuilder column = new StringBuilder();
        for(int i = 0; i < length; i++){
            column.append(row).append("\n");
        }

        return column.toString();
    }

    public String tallWideRec(Object rect){
        if (rect.getLength() > rect.getWidth()){return "You have a tall rectangle";}
        else{return "You have a wide rectangle";}
    }

}
