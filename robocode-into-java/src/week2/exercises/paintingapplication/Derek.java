package week2.exercises.paintingapplication;

public class Derek {

    private Tool tool;

    public void setTool(Tool tool){
        this.tool=tool;

    }

    public Boolean canHangPainting(){
        return tool !=null & tool.getName().equals("Hammer");


       /* if (tool != null && tool.getName().equals("hammer")){
            return true;}
         else {
             return false;}*/
        }



    public void hangPainting(){
        if (canHangPainting()){
        System.out.println("I will hang the painting.");
        } else{
            System.out.println("I am missing the hammer.");
        }



    }
}
